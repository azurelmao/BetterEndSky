package me.azureluma.betterendsky.client;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "betterendsky")
public class BetterEndSkyConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip()
    public boolean betterEndSky = true;
}
