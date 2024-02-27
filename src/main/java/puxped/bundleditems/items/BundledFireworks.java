package puxped.bundleditems.items;

import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BundledFireworks extends BundledItem {

    public BundledFireworks(Settings settings, Item unbundledItem, Item container) {
        super(settings, unbundledItem, container);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Vec3d hitPos = context.getHitPos();

        if (!world.isClient) {

            FireworkRocketEntity rocket1 = new FireworkRocketEntity(world, hitPos.x, hitPos.y, hitPos.z, context.getStack());
            FireworkRocketEntity rocket2 = new FireworkRocketEntity(world, (hitPos.x-0.5), hitPos.y, hitPos.z, context.getStack());
            FireworkRocketEntity rocket3 = new FireworkRocketEntity(world, (hitPos.x+0.5), hitPos.y, hitPos.z, context.getStack());
            FireworkRocketEntity rocket4 = new FireworkRocketEntity(world, hitPos.x, hitPos.y, (hitPos.z+0.5), context.getStack());
            FireworkRocketEntity rocket5 = new FireworkRocketEntity(world, hitPos.x, hitPos.y, (hitPos.z-0.5), context.getStack());
            FireworkRocketEntity rocket6 = new FireworkRocketEntity(world, (hitPos.x+0.5), hitPos.y, (hitPos.z+0.5), context.getStack());
            FireworkRocketEntity rocket7 = new FireworkRocketEntity(world, (hitPos.x-0.5), hitPos.y, (hitPos.z+0.5), context.getStack());
            FireworkRocketEntity rocket8 = new FireworkRocketEntity(world, (hitPos.x+0.5), hitPos.y, (hitPos.z-0.5), context.getStack());
            FireworkRocketEntity rocket9 = new FireworkRocketEntity(world, (hitPos.x-0.5), hitPos.y, (hitPos.z-0.5), context.getStack());

            world.spawnEntity(rocket1);
            world.spawnEntity(rocket2);
            world.spawnEntity(rocket3);
            world.spawnEntity(rocket4);
            world.spawnEntity(rocket5);
            world.spawnEntity(rocket6);
            world.spawnEntity(rocket7);
            world.spawnEntity(rocket8);
            world.spawnEntity(rocket9);
        }

        return ActionResult.success(world.isClient());
    }
    
}
