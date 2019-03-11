package com.awzaee.customitemsmod.init;

        import com.awzaee.customitemsmod.items.ItemBase;
        import com.awzaee.customitemsmod.items.tools.ToolSpade;
        import com.awzaee.customitemsmod.items.tools.ToolSword;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemSpade;
        import net.minecraft.item.ItemSword;
        import net.minecraftforge.common.util.EnumHelper;

        import java.util.ArrayList;
        import java.util.List;

public abstract class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final Item.ToolMaterial MATERIAL_METAL = EnumHelper.addToolMaterial("material_metal", 3,350,8.0F,50F,20);

    //Items
    public static final Item METAL = new ItemBase("metal");

    //Tools
    public static final ItemSword ULTIMATE_DIAMOND_SWORD = new ToolSword ("ultimate_diamond_sword", Item.ToolMaterial.DIAMOND);
    public static final ItemSpade METAL_SHOVEL = new ToolSpade("metal_shovel", MATERIAL_METAL);

}
