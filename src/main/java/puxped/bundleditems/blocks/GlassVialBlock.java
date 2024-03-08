package puxped.bundleditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GlassVialBlock extends Block {

    public GlassVialBlock(Settings settings) {
        super(settings
        .nonOpaque()
        .strength(1.0f)
        );
    }

    @Override
    public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
    
}
