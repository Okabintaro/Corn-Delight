package cn.mcmod.corn_delight.mixin;

import cn.mcmod.corn_delight.SoundRegistry;
import cn.mcmod.corn_delight.item.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractFurnaceBlockEntity.class)
public class PopcornFurnaceMixin extends BlockEntity {

    protected PopcornFurnaceMixin(BlockEntityType<?> p_155076_, BlockPos p_155077_, BlockState p_155078_) {
        super(p_155076_, p_155077_, p_155078_);
    }

    @Inject(at = @At("HEAD"), method = "burn")
    public void burnFinished(Recipe<?> p_155027_, NonNullList<ItemStack> p_155028_, int p_155029_, CallbackInfoReturnable<Boolean> cir) {
        if (p_155027_.getResultItem().getItem() == ItemRegistry.POPCORN.get()) {
            if (level != null) {
                float randomPitch = 1.5f + (level.random.nextFloat() * 0.5f);
                level.playSound(null, getBlockPos(), SoundRegistry.POPCORN_POPS.get(), SoundSource.BLOCKS, 1.0f, randomPitch);
            }
        }
    }
}
