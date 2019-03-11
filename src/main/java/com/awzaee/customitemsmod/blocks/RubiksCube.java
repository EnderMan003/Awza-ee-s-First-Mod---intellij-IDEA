package com.awzaee.customitemsmod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class RubiksCube extends BlockBase {

    public RubiksCube (String name) {
        super(name, Material.PACKED_ICE);
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
