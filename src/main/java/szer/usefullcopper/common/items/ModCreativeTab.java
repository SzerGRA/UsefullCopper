package szer.usefullcopper.common.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import szer.usefullcopper.core.ModItems;

public class ModCreativeTab {
    public static final CreativeModeTab Usefull_Copper = new CreativeModeTab( "Usefull Copper")   {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COPPER_ALLOY.get());
        }
    };
}
