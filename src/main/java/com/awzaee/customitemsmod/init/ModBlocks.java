package com.awzaee.customitemsmod.init;

import com.awzaee.customitemsmod.blocks.RubiksCube;
import com.awzaee.customitemsmod.blocks.Table;
import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks
{

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Blocks
    public static final Block TABLE = new Table("table");
    public static final Block RUBICKS_CUBE = new RubiksCube("rubiks_cube");

}
