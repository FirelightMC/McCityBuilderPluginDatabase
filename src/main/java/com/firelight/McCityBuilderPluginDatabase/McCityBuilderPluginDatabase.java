package com.firelight.McCityBuilderPluginDatabase;

import com.firelight.McCityBuilderPluginDatabase.utils.DatabaseSetup;
import org.bukkit.plugin.java.JavaPlugin;

public final class McCityBuilderPluginDatabase extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        try {
            DatabaseSetup.setup();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
