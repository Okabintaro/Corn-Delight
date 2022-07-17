package cn.mcmod.corn_delight.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.CampfireBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CampfireBlockEntity.class)
public class PopcornCampfireMixin extends BlockEntity {
    public PopcornCampfireMixin(BlockEntityType<?> p_155228_, BlockPos p_155229_, BlockState p_155230_) {
        super(p_155228_, p_155229_, p_155230_);
    }

    // TODO: Figure out how to read local variables in a mixin
    // @Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/Level;sendBlockUpdated(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;I)V"), method = "cookTick")
    // public void burnFinished(Level p_155307_, BlockPos p_155308_, BlockState p_155309_, CampfireBlockEntity p_155310_, CallbackInfo ci) {
    // }
}
