package puxped.bundleditems.items;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BundledItem extends Item {

    private ItemConvertible unbundledItem;
    private ItemConvertible container;

    public BundledItem(Settings settings, Item unbundledItem, Item container) {
        super(settings);
        this.unbundledItem = unbundledItem;
        this.container = container;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.isSneaking() && hand == Hand.MAIN_HAND) {
            ItemStack stack = user.getStackInHand(hand);
            if (!stack.isEmpty()) {
                stack.split(1);
                if(this.container == null) {

                    ItemStack thing = new ItemStack(this.unbundledItem, 9);
                    ItemEntity itemEntity = new ItemEntity(world, user.getX(), user.getY(), user.getZ(), thing);

                    itemEntity.setPickupDelay(0);

                    world.spawnEntity(itemEntity);

                } else {
                    ItemStack thing = new ItemStack(this.unbundledItem, 8);
                    ItemStack container1 = new ItemStack(this.container, 1);

                    ItemEntity itemEntity = new ItemEntity(world, user.getX(), user.getY(), user.getZ(), thing);
                    ItemEntity containerItemEntity = new ItemEntity(world, user.getX(), user.getY(), user.getZ(), container1);

                    itemEntity.setPickupDelay(0);
                    containerItemEntity.setPickupDelay(0);

                    world.spawnEntity(itemEntity);
                    world.spawnEntity(containerItemEntity);
                }

                //user.dropItem(toDrop, false);

                return TypedActionResult.success(stack);
            }
        }
        return super.use(world, user, hand);
    }
    
}
