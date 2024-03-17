package puxped.bundleditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
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

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.cuboid(0.375, 0, 0.375, 0.6875, 0.5, 0.6875), BooleanBiFunction.OR);
        shape = VoxelShapes.combineAndSimplify(shape, VoxelShapes.cuboid(0.4375, 0.5, 0.4375, 0.625, 0.5625, 0.625), BooleanBiFunction.OR);

        return shape;
    }
    
}
