package de.marvinleiers.trollingplugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class TrollingPlugin extends JavaPlugin
{
    private static TrollingPlugin instance;
    private String prefix;

    @Override
    public void onEnable()
    {
        super.onEnable();

        instance = this;
        getConfig().options().copyDefaults(true);
        getConfig().addDefault("prefix", "&7[&cTROLL&7] &f");
        prefix = getConfig().getString("prefix");
    }

    public static TrollingPlugin getInstance()
    {
        return instance;
    }

    public String gePrefix()
    {
        return translateColorfromConfig("prefix");
    }

    private String translateColorfromConfig(String path)
    {
        return ChatColor.translateAlternateColorCodes('&', getConfig().getString(path));
    }
}
