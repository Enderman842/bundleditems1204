package puxped.bundleditems;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import puxped.bundleditems.blocks.GlassVialBlock;

public class BIBlocks {

    public static final Block GLASS_VIAL = new GlassVialBlock(FabricBlockSettings.copy(Blocks.GLASS));
    public static final Block BUNDLED_GLOWSTONE_DUST = new GlassVialBlock(FabricBlockSettings.create().luminance(8));
    public static final Block BUNDLED_GUNPOWDER = new GlassVialBlock(FabricBlockSettings.copy(Blocks.GLASS));
    public static final Block BUNDLED_REDSTONE = new GlassVialBlock(FabricBlockSettings.copy(Blocks.GLASS));
    public static final Block BUNDLED_SUGAR = new GlassVialBlock(FabricBlockSettings.copy(Blocks.GLASS));
    
    public static void regBlocks() {
        registerBlock("small_bottle", GLASS_VIAL);
        registerBlock("bundled_glowstone_dust", BUNDLED_GLOWSTONE_DUST);
        registerBlock("bundled_gunpowder", BUNDLED_GUNPOWDER);
        registerBlock("bundled_redstone", BUNDLED_REDSTONE);
        registerBlock("bundled_sugar", BUNDLED_SUGAR);
    }

    public static void registerBlock(String blockName, Block block) {
        Registry.register(Registries.BLOCK, new Identifier("bundleditems", blockName), block);
    }
}
