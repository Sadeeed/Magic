package com.icesoup.magic.Items;

import com.icesoup.magic.Blocks.MagicBlocks;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

public class EscapeRopeItem extends Item {

    private int rX;
    private int rZ;

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
            //System.out.println(user.getPos());
            //user.playSound();
            Random gen = new Random(System.currentTimeMillis());
            rX = gen.nextInt(256);
            rZ = gen.nextInt(256);
            user.teleport(user.getX() + rX, user.getY(), user.getZ() + rZ);
        }
        return super.use(world, user, hand);
    }
}
