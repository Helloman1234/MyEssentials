package: me.Sizableshrimp0.main

import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class CmdFly implements Listener{
        static Plugin plugin;
        
        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){{
                Player player = (Player) sender;
                


