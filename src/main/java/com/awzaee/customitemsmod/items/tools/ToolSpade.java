package com.awzaee.customitemsmod.items.tools;

import com.awzaee.customitemsmod.Main;
import com.awzaee.customitemsmod.init.ModItems;
import com.awzaee.customitemsmod.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {

    public ToolSpade(String name, Item.ToolMaterial material)
    {
        super(material);
        setUnlocalizedName (name);
        setRegistryName (name);
        setCreativeTab (Main.tabTutorial);
        ModItems.ITEMS.add (this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
