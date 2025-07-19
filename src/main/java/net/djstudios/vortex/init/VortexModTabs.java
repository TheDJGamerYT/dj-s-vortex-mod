
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.djstudios.vortex.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.djstudios.vortex.VortexMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VortexModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VortexMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(VortexModItems.RUBY.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(VortexModBlocks.RUBY_ORE.get().asItem());
			tabData.accept(VortexModBlocks.RUBY_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(VortexModItems.RUBY_PICKAXE.get());
			tabData.accept(VortexModItems.RUBY_AXE.get());
			tabData.accept(VortexModItems.RUBY_SHOVEL.get());
			tabData.accept(VortexModItems.RUBY_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(VortexModItems.RUBY_SWORD.get());
			tabData.accept(VortexModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(VortexModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(VortexModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(VortexModItems.RUBY_ARMOR_BOOTS.get());
		}
	}
}
