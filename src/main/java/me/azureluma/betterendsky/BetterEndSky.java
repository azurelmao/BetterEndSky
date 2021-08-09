package me.azureluma.betterendsky;

import me.azureluma.betterendsky.client.BetterEndSkyConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class BetterEndSky implements ModInitializer {

    public static final String MOD_ID = "betterendsky";

    public static BetterEndSkyConfig CONFIG = new BetterEndSkyConfig();

    @Override
    public void onInitialize() {
        AutoConfig.register(BetterEndSkyConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(BetterEndSkyConfig.class).getConfig();
    }
}
