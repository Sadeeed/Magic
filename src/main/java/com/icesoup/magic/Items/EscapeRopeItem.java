package com.icesoup.magic.Items;

import com.icesoup.magic.Blocks.MagicBlocks;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EscapeRopeItem extends Item {
    public EscapeRopeItem(Settings settings) {
        super(settings);
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        super.usageTick(world, user, stack, remainingUseTicks);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(hand == Hand.MAIN_HAND)
        {
            world.setBlockState(user.getBlockPos(), MagicBlocks.Portal_Residue.getDefaultState());
            System.out.println(user.getSpawnPosition());
            //user.teleport();
        }
        return super.use(world, user, hand);
    }
}
