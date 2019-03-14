package com.awzaee.customitemsmod.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Author: Awzaee
 */

public class BlockTable extends BlockBase {

    public BlockTable(String name) {
        super(name, Material.WOOD);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public static final PropertyDirection FACING = BlockHorizontal.FACING;


    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.setDefaultFacing(worldIn, pos, state);
    }

   private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
   {
       if (!worldIn.isRemote)
       {
           IBlockState iblockstate = worldIn.getBlockState(pos.north());
           IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
           IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
           IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
           EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

           if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
           {
               enumfacing = EnumFacing.SOUTH;
           }
           else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
           {
               enumfacing = EnumFacing.NORTH;
           }
           else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
           {
               enumfacing = EnumFacing.EAST;
           }
           else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
           {
               enumfacing = EnumFacing.WEST;
           }

           worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
       }
   }


    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
}
