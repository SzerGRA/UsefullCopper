package szer.usefullcopper.core;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import szer.usefullcopper.UsefullCopper;
import szer.usefullcopper.common.items.ModArmorMaterials;
import szer.usefullcopper.common.items.ModCreativeTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UsefullCopper.MODID);

    public static final RegistryObject<Item>  COPPER_ALLOY = ITEMS.register("copper_alloy", () -> new Item (new Item.Properties().tab(ModCreativeTab.Usefull_Copper)) );

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));
    public static final RegistryObject<Item> COPPER_LEGGING = ITEMS.register("copper_legging", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));

    public static final RegistryObject<Item> COPPER_ALLOY_HELMET = ITEMS.register("copper_alloy_helmet", () -> new ArmorItem(ModArmorMaterials.COPPER_ALLOY, EquipmentSlot.HEAD,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));
    public static final RegistryObject<Item> COPPER_ALLOY_CHESTPLATE = ITEMS.register("copper_alloy_chestplate", () -> new ArmorItem(ModArmorMaterials.COPPER_ALLOY, EquipmentSlot.CHEST,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));
    public static final RegistryObject<Item> COPPER_ALLOY_LEGGING = ITEMS.register("copper_alloy_legging", () -> new ArmorItem(ModArmorMaterials.COPPER_ALLOY, EquipmentSlot.LEGS,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));
    public static final RegistryObject<Item> COPPER_ALLOY_BOOTS = ITEMS.register("copper_alloy_boots", () -> new ArmorItem(ModArmorMaterials.COPPER_ALLOY, EquipmentSlot.FEET,
            new Item.Properties().tab(ModCreativeTab.Usefull_Copper)));


}
