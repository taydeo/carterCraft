package com.catsinred.cartercraft;

import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class CarterCraft extends JavaPlugin {
    private Logger LOGGER = getLogger();
    private Server SERVER = getServer();
    
    @Override
    public void onEnable() {
        LOGGER.info("Starting CarterCraft...");

        if (SERVER.getPluginManager().isPluginEnabled("Citizens")) {
            LOGGER.severe("Could not find Citizens2. Disabling.");
            SERVER.getPluginManager().disablePlugin(this);
            return;
        }
    }
}