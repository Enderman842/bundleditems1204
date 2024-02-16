package puxped.bundleditems.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BundledItemWithGlint extends BundledItem {

    public BundledItemWithGlint(Settings settings, Item unbundledItem, Item container) {
        super(settings, unbundledItem, container);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
    
}
