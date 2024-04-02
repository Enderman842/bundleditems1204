package puxped.bundleditems.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BundledEnchantedGoldenApples extends BundledBlockItem {

    public BundledEnchantedGoldenApples(Block block, Settings settings, Item unbundledItem, Item container) {
        super(block, settings, unbundledItem, container);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    
}
