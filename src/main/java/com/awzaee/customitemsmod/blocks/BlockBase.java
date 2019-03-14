package com.awzaee.customitemsmod.blocks;

import com.awzaee.customitemsmod.Main;
import com.awzaee.customitemsmod.init.ModBlocks;
import com.awzaee.customitemsmod.init.ModItems;
import com.awzaee.customitemsmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel
{
    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public BlockBase(String name, Material material)
    {
        super(material);
        setUnlocalizedName (name);
        setRegistryName (name);
        setCreativeTab (Main.tabTutorial);

        ModBlocks.BLOCKS.add (this);
        ModItems.ITEMS.add (new ItemBlock(this).setRegistryName(this.getRegistryName ()));
    }

    @Override
    public BlockStateContainer getBlockState() {
        return super.getBlockState();
    }
    @Override
    public boolean isOpaqueCube (IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube (IBlockState state)
    {
        return false;
    }

    @Override
    public IBlockState getStateForPlacement (World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState state = super.getStateForPlacement(world, pos, facing, hitX, hitY, hitZ, meta, placer);
        return state.withProperty(FACING, placer.getHorizontalFacing());
    }

    @Override
    public int getMetaFromState (IBlockState state)
    {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public IBlockState getStateFromMeta ( int meta)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    @Override
    protected BlockStateContainer createBlockState ()
    {
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer (Item.getItemFromBlock (this), 0, "inventory");
    }
}
