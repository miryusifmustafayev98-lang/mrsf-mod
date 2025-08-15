/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mrsf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mrsf.item.MrsfswordItem;
import net.mcreator.mrsf.item.MrsfshovelItem;
import net.mcreator.mrsf.item.MrsfpickaxeItem;
import net.mcreator.mrsf.item.MrsfhoeItem;
import net.mcreator.mrsf.item.MrsfaxeItem;
import net.mcreator.mrsf.item.MrsfItem;
import net.mcreator.mrsf.MrsfMod;

public class MrsfModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MrsfMod.MODID);
	public static final RegistryObject<Item> MRSFSWORD = REGISTRY.register("mrsfsword", () -> new MrsfswordItem());
	public static final RegistryObject<Item> MRSFPICKAXE = REGISTRY.register("mrsfpickaxe", () -> new MrsfpickaxeItem());
	public static final RegistryObject<Item> MRSFAXE = REGISTRY.register("mrsfaxe", () -> new MrsfaxeItem());
	public static final RegistryObject<Item> MRSFSHOVEL = REGISTRY.register("mrsfshovel", () -> new MrsfshovelItem());
	public static final RegistryObject<Item> MRSFHOE = REGISTRY.register("mrsfhoe", () -> new MrsfhoeItem());
	public static final RegistryObject<Item> MRSF_HELMET = REGISTRY.register("mrsf_helmet", () -> new MrsfItem.Helmet());
	public static final RegistryObject<Item> MRSF_CHESTPLATE = REGISTRY.register("mrsf_chestplate", () -> new MrsfItem.Chestplate());
	public static final RegistryObject<Item> MRSF_LEGGINGS = REGISTRY.register("mrsf_leggings", () -> new MrsfItem.Leggings());
	public static final RegistryObject<Item> MRSF_BOOTS = REGISTRY.register("mrsf_boots", () -> new MrsfItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}