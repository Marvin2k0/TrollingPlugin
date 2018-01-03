package de.marvinleiers.trollingplugin.commands;

import de.marvinleiers.trollingplugin.TrollingPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TrollingCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if (!(commandSender instanceof Player))
        {
            commandSender.sendMessage(TrollingPlugin.getInstance().getPrefix() + " §cNur fuer Spieler!");

            return true;
        }
        return false;
    }
}
