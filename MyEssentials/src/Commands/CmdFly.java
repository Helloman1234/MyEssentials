package: me.Sizableshrimp0.main

import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class CmdFly implements Listener{

        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){{
                Player player = (Player) sender;
                
                if(commandLabel.equalsIgnoreCase("fly") || commandLabel.equalsIgnoreCase("mefly") || commandLabel.equalsIgnoreCase("efly") || commandLabel.equalsIgnoreCase("mfly") || commandLabel.equalsIgnoreCase("myfly") || commandLabel.equalsIgnoreCase("bird") || commandLabel.equalsIgnoreCase("flight")){
                	    if(player.hasPermission("MyEssentials.fly")){
                                if (args.length == 0){
                                //Player only typed /fly so lets fly them back!
                                if(player.getAllowFlight()){
                                player.sendMessage(ChatColor.BLUE + "Flying Has Been Disabled");                
                                player.setAllowFlight(false);
                                }else{                               
                                player.sendMessage(ChatColor.BLUE + "Flying Has Been Enabled!");
                                player.setAllowFlight(true);                  
                }}
                }else{            
                        player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
                }
                return true;
                }
        }
               
