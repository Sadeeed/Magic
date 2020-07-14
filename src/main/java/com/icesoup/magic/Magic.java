package com.icesoup.magic;

import com.icesoup.magic.Biomes.MagicBiomes;
import com.icesoup.magic.Blocks.MagicBlocks;
import com.icesoup.magic.Items.MagicItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.icesoup.magic.Items.MagicItems.*;

public class Magic implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "magicdust";
    public static final String MOD_NAME = "Magic";


    //Define Mod Group
    public static final ItemGroup General = FabricItemGroupBuilder.create(
            new Identifier("magicdust", "general"))
            .icon(() -> new ItemStack(MagicItems.Potato_Dust)).build();




    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        //System.out.println("Test");
        MagicItems.register();
        MagicBlocks.register();
        MagicBiomes.register();
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}