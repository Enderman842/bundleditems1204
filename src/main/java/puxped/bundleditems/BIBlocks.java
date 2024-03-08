package puxped.bundleditems;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import puxped.bundleditems.blocks.GlassVialBlock;

public class BIBlocks {

    public static final Block GLASS_VIAL = new GlassVialBlock(FabricBlockSettings.create());
    
    public static void regBlocks() {
        registerBlock("small_bottle", GLASS_VIAL);
    }

    public static void registerBlock(String blockName, Block block) {
        Registry.register(Registries.BLOCK, new Identifier("bundleditems", blockName), block);
    }
}
