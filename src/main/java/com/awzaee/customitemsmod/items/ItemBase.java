package com.awzaee.customitemsmod.items;

import com.awzaee.customitemsmod.Main;
import com.awzaee.customitemsmod.init.ModItems;
import com.awzaee.customitemsmod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabTutorial);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
