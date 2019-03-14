package com.awzaee.customitemsmod;

import com.awzaee.customitemsmod.init.ModBlocks;
import com.awzaee.customitemsmod.init.ModRecipes;
import com.awzaee.customitemsmod.proxy.CommonProxy;
import com.awzaee.customitemsmod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public static void Postinit(FMLPostInitializationEvent event)
    {

    }

    public static CreativeTabs tabTutorial = new CreativeTabs ("custom_items") {
        @Override
        public ItemStack getTabIconItem() {
        return new ItemStack (ModBlocks.BLOCKTABLE);
        }
    };
}
