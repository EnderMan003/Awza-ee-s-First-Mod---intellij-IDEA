package com.awzaee.customitemsmod.items.tools;

import com.awzaee.customitemsmod.Main;
import com.awzaee.customitemsmod.init.ModItems;
import com.awzaee.customitemsmod.util.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword (String name, ToolMaterial material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabTutorial);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
