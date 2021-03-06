package com.awzaee.customitemsmod.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Author: Awzaee
 */

public class BlockTable extends BlockBase {

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

        public BlockTable(String name) {
            super(name, Material.WOOD);
            this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        }

        @Override
        public BlockStateContainer getBlockState()
        {
            return super.getBlockState();
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
        public IBlockState withRotation(IBlockState state, Rotation rot)
        {
            return state.withProperty(BlockHorizontal.FACING, rot.rotate(state.getValue(BlockHorizontal.FACING)));
        }
    }
