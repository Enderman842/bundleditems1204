package puxped.bundleditems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BundledItems implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("bundleditems");

	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
    .icon(() -> new ItemStack(BIItems.SECRET_ITEM))
    .displayName(Text.translatable("itemGroup.bundleditems"))
        .entries((context, entries) -> {
        entries.add(BIItems.BUNDLED_OAK_SAPLINGS);
        entries.add(BIItems.BUNDLED_SPRUCE_SAPLINGS);
        entries.add(BIItems.BUNDLED_BIRCH_SAPLINGS);
        entries.add(BIItems.BUNDLED_JUNGLE_SAPLINGS);
        entries.add(BIItems.BUNDLED_ACACIA_SAPLINGS);
        entries.add(BIItems.BUNDLED_DARK_OAK_SAPLINGS);
        entries.add(BIItems.BUNDLED_DANDELIONS);
        entries.add(BIItems.BUNDLED_POPPIES);
        entries.add(BIItems.BUNDLED_BLUE_ORCHIDS);
        entries.add(BIItems.BUNDLED_ALLIUMS);
        entries.add(BIItems.BUNDLED_AZURE_BLUETS);
        entries.add(BIItems.BUNDLED_RED_TULIPS);
        entries.add(BIItems.BUNDLED_ORANGE_TULIPS);
        entries.add(BIItems.BUNDLED_WHITE_TULIPS);
        entries.add(BIItems.BUNDLED_PINK_TULIPS);
        entries.add(BIItems.BUNDLED_OXEYE_DAISIES);
        entries.add(BIItems.BUNDLED_CORNFLOWERS);
        entries.add(BIItems.BUNDLED_LILIES_OF_THE_VALLEY);
        entries.add(BIItems.BUNDLED_WITHER_ROSES);
        entries.add(BIItems.BUNDLED_VINES);
        entries.add(BIItems.BUNDLED_APPLES);
        entries.add(BIItems.BUNDLED_GOLDEN_APPLES);
        entries.add(BIItems.BUNDLED_ENCHANTED_GOLDEN_APPLES);
        entries.add(BIItems.QUIVER);
        entries.add(BIItems.BUNDLED_ARROWS);
        entries.add(BIItems.BUNDLED_BONES);
        entries.add(BIItems.BUNDLED_STICKS);
        entries.add(BIItems.BUNDLED_BLAZE_RODS);
        entries.add(BIItems.BUNDLED_BOWLS);
        entries.add(BIItems.BUNDLED_SNOWBALLS);
        entries.add(BIItems.BUNDLED_SLIME_BALLS);
        entries.add(BIItems.BUNDLED_BLAZE_POWDER);
        entries.add(BIItems.BUNDLED_CLAY_BALLS);
        entries.add(BIItems.BUNDLED_NETHER_WARTS);
        entries.add(BIItems.BUNDLED_SEEDS);
        entries.add(BIItems.BUNDLED_CHARCOAL);
        entries.add(BIItems.BUNDLED_GLOW_BERRIES);
        entries.add(BIItems.BUNDLED_STRING);
        entries.add(BIItems.BUNDLED_FEATHERS);
        entries.add(BIItems.BUNDLED_GLASS_BOTTLES);
        entries.add(BIItems.BUNDLED_WATER_BOTTLES);
        entries.add(BIItems.GLASS_VIAL);
        entries.add(BIItems.BUNDLED_GLOWSTONE_DUST);
        entries.add(BIItems.BUNDLED_GUNPOWDER);
        entries.add(BIItems.BUNDLED_REDSTONE);
        entries.add(BIItems.BUNDLED_SUGAR);
        entries.add(BIItems.BUNDLED_GHAST_TEARS);
        entries.add(BIItems.BUNDLED_BREAD);
        entries.add(BIItems.BUNDLED_FLINTS);
        entries.add(BIItems.BUNDLED_BUCKETS);
        entries.add(BIItems.BUNDLED_NAME_TAGS);
        entries.add(BIItems.BUNDLED_PORKCHOP);
        entries.add(BIItems.BUNDLED_COOKED_PORKCHOP);
        entries.add(BIItems.BUNDLED_RAW_BEEF);
        entries.add(BIItems.BUNDLED_COOKED_BEEF);
        entries.add(BIItems.BUNDLED_RAW_CHICKEN);
        entries.add(BIItems.BUNDLED_COOKED_CHICKEN);
        entries.add(BIItems.BUNDLED_RAW_MUTTON);
        entries.add(BIItems.BUNDLED_COOKED_MUTTON);
        entries.add(BIItems.BUNDLED_RAW_RABBIT);
        entries.add(BIItems.BUNDLED_COOKED_RABBIT);
        entries.add(BIItems.BUNDLED_ROTTEN_FLESH);
        entries.add(BIItems.BUNDLED_LEATHER);
        entries.add(BIItems.BUNDLED_BRICKS);
        entries.add(BIItems.BUNDLED_NETHER_BRICKS);
        entries.add(BIItems.BUNDLED_SUGAR_CANE);
        entries.add(BIItems.BUNDLED_PAPER);
        entries.add(BIItems.BUNDLED_BOOKS);
        entries.add(BIItems.BUNDLED_COD);
        entries.add(BIItems.BUNDLED_SALMON);
        entries.add(BIItems.BUNDLED_COOKED_COD);
        entries.add(BIItems.BUNDLED_COOKED_SALMON);
        entries.add(BIItems.GLASS_JAR);
        entries.add(BIItems.BUNDLED_COOKIES);
        entries.add(BIItems.BUNDLED_HONEY);
        entries.add(BIItems.BUNDLED_HONEYCOMB);
        entries.add(BIItems.BUNDLED_CARROTS);
        entries.add(BIItems.BUNDLED_GOLDEN_CARROTS);
        entries.add(BIItems.BUNDLED_EGGS);
        entries.add(BIItems.BUNDLED_POTATOES);
        entries.add(BIItems.BUNDLED_BAKED_POTATOES);
        entries.add(BIItems.BUNDLED_NETHER_STARS);
        entries.add(BIItems.BUNDLED_FIREWORKS);
        entries.add(BIItems.BUNDLED_CHORUS_FRUIT);
        entries.add(BIItems.BUNDLED_POPPED_CHORUS_FRUIT);
    })
    .build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading Bundled Items!");

        BIBlocks.regBlocks();
		BIItems.regItems();
		Registry.register(Registries.ITEM_GROUP, new Identifier("bundleditems", "main"), ITEM_GROUP);

		LOGGER.info("Bundled Items loaded!");

	}
}
