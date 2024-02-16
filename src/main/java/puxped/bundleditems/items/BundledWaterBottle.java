package puxped.bundleditems.items;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BundledWaterBottle extends Item {

    public BundledWaterBottle(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.isSneaking() && hand == Hand.MAIN_HAND) {
            ItemStack stack = user.getStackInHand(hand);
            if (!stack.isEmpty()) {
                stack.split(1);
                ItemStack thing = new ItemStack(Items.POTION, 9);
                PotionUtil.setPotion(thing, Potions.WATER);
                ItemEntity itemEntity = new ItemEntity(world, user.getX(), user.getY(), user.getZ(), thing);

                itemEntity.setPickupDelay(0);

                world.spawnEntity(itemEntity);

                return TypedActionResult.success(stack);
            }
        }
        return super.use(world, user, hand);
    }
    
}
