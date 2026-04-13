package io.github.maplemods.maplescreepercollection;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplescreepercollection.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "autumn", "flannel_creeper", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "autumn", "pumpkin_creeper", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "spring", "cherry_blossom_creeper", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "spring", "flower_creeper", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "summer", "midsommar_creeper", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "summer", "sunflower_creeper", 1);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "winter", "frozen_creeper", 1);
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.CREEPER, "winter", "snow_covered_creeper", 1);
    }
}
