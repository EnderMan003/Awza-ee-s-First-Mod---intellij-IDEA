package com.awzaee.customitemsmod.blocks;

import com.awzaee.customitemsmod.Main;
import com.awzaee.customitemsmod.init.ModBlocks;
import com.awzaee.customitemsmod.init.ModItems;
import com.awzaee.customitemsmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
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
    public void registerModels()
    {
        Main.proxy.registerItemRenderer (Item.getItemFromBlock (this), 0, "inventory");
    }
}
