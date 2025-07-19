
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.djstudios.vortex.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.djstudios.vortex.block.RubyOreBlock;
import net.djstudios.vortex.block.RubyBlockBlock;
import net.djstudios.vortex.VortexMod;

public class VortexModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VortexMod.MODID);
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
