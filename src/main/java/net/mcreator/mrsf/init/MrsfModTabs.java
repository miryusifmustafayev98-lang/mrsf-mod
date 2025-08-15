/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mrsf.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mrsf.MrsfMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MrsfModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MrsfMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MrsfModItems.MRSFSWORD.get());
			tabData.accept(MrsfModItems.MRSFAXE.get());
			tabData.accept(MrsfModItems.MRSF_HELMET.get());
			tabData.accept(MrsfModItems.MRSF_CHESTPLATE.get());
			tabData.accept(MrsfModItems.MRSF_LEGGINGS.get());
			tabData.accept(MrsfModItems.MRSF_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MrsfModItems.MRSFPICKAXE.get());
			tabData.accept(MrsfModItems.MRSFAXE.get());
			tabData.accept(MrsfModItems.MRSFSHOVEL.get());
			tabData.accept(MrsfModItems.MRSFHOE.get());
		}
	}
}