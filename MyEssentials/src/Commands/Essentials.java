package me.Sizableshrimp0.main;
 
import java.util.logging.Logger;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.GameMode;

@SuppressWarnings("deprecation")
public class MyEssentials extends JavaPlugin {
        public static Logger logger = Logger.getLogger("Minecraft");
        public static MyEssentials plugin; 
       
        @Override
        public void onEnable() {
        	    PluginDescriptionFile pdfFile = this.getDescription();
                MyEssentials.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " has been enabled!");
         
        }
        
        @Override
        public void onDisable() {
                PluginDescriptionFile pdfFile = this.getDescription();
                MyEssentials.logger.info(pdfFile.getName() + " has been disabled!");
        }
      
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
                           
                            }}
                	        else if(commandLabel.equalsIgnoreCase("gmc") || commandLabel.equalsIgnoreCase("creative") || commandLabel.equalsIgnoreCase("megmc")){
                	        	getServer().dispatchCommand(getServer().getConsoleSender(), "gmc");
                	        	if(player.hasPermission("MyEssentials.gmc")){
            		            if (args.length == 0){
            		            //Player only typed '/gmc' so lets gmc them back!
            		            player.setGameMode(GameMode.CREATIVE);
            			    	player.sendMessage(ChatColor.BLUE + "You Have Been Set To GameMode Creative!");
            		            }else{
            		            //Player typed something more
            		            	Player target = Bukkit.getPlayerExact(args[0]);
            		            	if (target == null) {
            		            	//Target is not online
            		            	player.sendMessage(ChatColor.DARK_RED + "Player " + args[0] + " is not online!");
            		            }else{
            		            //Targets online
            		            player.sendMessage(ChatColor.BLUE + "You've set GameMode Creative to " + args[0]);
            		            target.sendMessage(ChatColor.BLUE + "Your gamemode has been set to creative by " + sender.getName());
            		            target.setGameMode(GameMode.CREATIVE);
            		            }}
            		            }else{
            			    	player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
            		        }}
            				else if(commandLabel.equalsIgnoreCase("gms")|| commandLabel.equalsIgnoreCase("survival") || commandLabel.equalsIgnoreCase("megms")){
            			        if(player.hasPermission("MyEssentials.gms")){
            			        if (args.length == 0){
            			        //Player only typed '/gms' so lets gms them back!
            			        player.setGameMode(GameMode.SURVIVAL);
            			    	player.sendMessage(ChatColor.BLUE + "You Have Been Set To GameMode Survival!");
            			        }else{
                    			//Player typed something more
            			        	Player target = Bukkit.getPlayerExact(args[0]);
            			        	if (target == null) {
            			        	//Target is not online
                			    	player.sendMessage(ChatColor.DARK_RED + "Player " + args[0] + " is not online!");
            			        	}else{
            				        //Targets online
            			        	player.sendMessage(ChatColor.BLUE + "You've set GameMode Survival to " + args[0]);
            			        	target.sendMessage(ChatColor.BLUE + "Your gamemode has been set to survival by " + sender.getName());
            			        	target.setGameMode(GameMode.SURVIVAL);
            			        	}}	
            			            }else{
            			    	    player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
             			    }}
            			    else if(commandLabel.equalsIgnoreCase("gma")|| commandLabel.equalsIgnoreCase("adventure") || commandLabel.equalsIgnoreCase("megma")){
            				        if(player.hasPermission("MyEssentials.gma")){
            				        if (args.length == 0){
            				        //Player only typed '/gma' so lets gma them back!
            				        player.setGameMode(GameMode.ADVENTURE);
            				    	player.sendMessage(ChatColor.BLUE + "You Have Been Set To GameMode Adventure!");
            				        }else{
                    			    //Player typed something more
            				        	Player target = Bukkit.getPlayerExact(args[0]);
            				        	if (target == null) {
            				        	//Target is not online
                			    	    player.sendMessage(ChatColor.DARK_RED + "Player " + args[0] + " is not online!");
            				        	}else{
            				        	//Targets online
            				        	player.sendMessage(ChatColor.BLUE + "You've set GameMode Adventure to " + args[0]);
            				        	target.sendMessage(ChatColor.BLUE + "Your gamemode has been set to adventure by " + sender.getName());
            				        	target.setGameMode(GameMode.ADVENTURE);
            				        	}}
            				        	}else{
            				        player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
            				}}
            			    else if(commandLabel.equalsIgnoreCase("Heal") || commandLabel.equalsIgnoreCase("meheal") || commandLabel.equalsIgnoreCase("mheal") || commandLabel.equalsIgnoreCase("eheal") || commandLabel.equalsIgnoreCase("myheal")|| commandLabel.equalsIgnoreCase("health")){ 
            			    	    if(player.hasPermission("MyEssentials.heal")){
            			    	    if (args.length == 0){
                    			    //Player only typed '/heal' so lets heal them back!
            			    	    player.setHealth(20.0);
            			            player.setFireTicks(0);
            			    	    player.sendMessage(ChatColor.BLUE + "You have been healed!");
            			            }else{
            			            //Player typed something more
            			            	Player target = Bukkit.getPlayerExact(args[0]);
            			    	    	if (target == null) {
            			    	    	//Target is not online
            			    	    	player.sendMessage(ChatColor.DARK_RED + "Player " + args[0] + " is not online!");
            			    	    	}else{
            			    	    	//Targets online
            			    	    	player.sendMessage(ChatColor.BLUE + "You've healed " + args[0]);
            			    	    	target.sendMessage(ChatColor.BLUE + "You have been healed by " + sender.getName());
            			    	    	target.setHealth(20);
            			    	    	target.setFireTicks(0);
            			    	    	}}
            			    	    	}else{
            			    	    	player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
            			    }}
                            else if(commandLabel.equalsIgnoreCase("feed") || commandLabel.equalsIgnoreCase("mefeed") || commandLabel.equalsIgnoreCase("mfeed") || commandLabel.equalsIgnoreCase("efeed") || commandLabel.equalsIgnoreCase("myfeed") || commandLabel.equalsIgnoreCase("food")){
                            	    if(player.hasPermission("MyEssentials.feed")){
                            	    if (args.length == 0){
                            	    //Player only typed '/feed' so lets feed them back!
                            	    player.setFoodLevel(20);
                            	    player.sendMessage(ChatColor.BLUE + "You Have Been Fed!");
                            	    }else{
                            	    //Player typed something more
                            	    	Player target = Bukkit.getPlayerExact(args[0]);
                            	    	if (target == null) {
                            	    		//Target is not online
                			    	    	player.sendMessage(ChatColor.DARK_RED + "Player " + args[0] + " is not online!");
                			    	    	}else{
                			    	    	//Targets online
                			    	    	player.sendMessage(ChatColor.BLUE + "You've fed " + args[0]);
                			    	    	target.sendMessage(ChatColor.BLUE + "You have been fed by " + sender.getName());
                			    	    	target.setFoodLevel(20);
                            	    	    }}
                            	            }else{
                            	            player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");	
                            }}              
                            else if(commandLabel.equalsIgnoreCase("air") || commandLabel.equalsIgnoreCase("meair") || commandLabel.equalsIgnoreCase("mair") || commandLabel.equalsIgnoreCase("eair") || commandLabel.equalsIgnoreCase("myair") || commandLabel.equalsIgnoreCase("oxygen")){
                            	if(player.hasPermission("MyEssentials.air")){
                            	if (args.length == 0){
                            	//Player only typed '/air' so lets air them back!
                            		Location l = player.getLocation();
                            		l.setY(l.getY() + 1);
                            		Block b = l.getBlock();
                            		if(b.isLiquid()) {
                            		//in water
                            		player.sendMessage(ChatColor.BLUE + "You have replenished your supply of oxygen!");
                            		player.setRemainingAir(300);
                            	    }else{
                            		//not in water
                            		player.sendMessage(ChatColor.BLUE + "You are not in water!");
                        		}}
                            	}else{
                            		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
                            	  
                            }}		
                            else if(commandLabel.equalsIgnoreCase("fire") || commandLabel.equalsIgnoreCase("flame") || commandLabel.equalsIgnoreCase("mefire") || commandLabel.equalsIgnoreCase("myfire") || commandLabel.equalsIgnoreCase("mfire") || commandLabel.equalsIgnoreCase("efire")){
                            	if(player.hasPermission("MyEssentials.fire")){
                                if (args.length == 0){
                                //Player only typed '/fire' so lets fire them back!
                                	player.sendMessage(ChatColor.BLUE + "You have set yourself on fire!");
                                	player.setFireTicks(300);
                                    }else{
                            	    //Player typed something more
                            	    	Player target = Bukkit.getPlayerExact(args[0]);
                            	    	if (target == null) {
                            	    		//Target is not online
                			    	    	player.sendMessage(ChatColor.DARK_RED + "Player "  + args[0] + " is not online!");
                			    	        }else{
                			    	    	//Targets online
                			    	    	player.sendMessage(ChatColor.BLUE + "You have set " + args[0] + " on fire!");
                                            target.sendMessage(ChatColor.DARK_RED + "You have been set on fire by " + sender.getName());
                			    	    	target.setFireTicks(300);
                            	}}	    
                			   	}else{
                			      	player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");}}
		
		                    
                            else if(commandLabel.equalsIgnoreCase("ban") || commandLabel.equalsIgnoreCase("mban") || commandLabel.equalsIgnoreCase("eban") || commandLabel.equalsIgnoreCase("myban")|| commandLabel.equalsIgnoreCase("meban")){
                            	if(player.hasPermission("MyEssentials.ban")){
                            	if(args.length == 0){
                            	//Player only typed /ban
                            		player.sendMessage(ChatColor.WHITE + "Usage: /Ban [Player]" );
                            		}else{
                            		//Player typed some more
                            			Player target = Bukkit.getPlayerExact(args[0]);
                            			if (target == null) {
                            				//Target is not online
                            				Bukkit.getOfflinePlayer(args[0]).setBanned(true);
                            				Bukkit.broadcastMessage(ChatColor.BLUE + sender.getName() + " banned player " + args[0]);
                            			    }else{
                            			    //Targets online
                            			    target.kickPlayer("You have been banned!");
                            			    target.setBanned(true);
                            			    Bukkit.broadcastMessage(ChatColor.BLUE + sender.getName() + " banned player " + args[0]);
                            	}}
                            	}else{
                            		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");}}
                            
		 
                            else if(commandLabel.equalsIgnoreCase("unban") || commandLabel.equalsIgnoreCase("munban") || commandLabel.equalsIgnoreCase("eunban") || commandLabel.equalsIgnoreCase("myunban")|| commandLabel.equalsIgnoreCase("meunban")){
                            	if(player.hasPermission("MyEssentials.unban")){
                            	if(args.length == 0){
                            	//Player only typed /unban so lets unban them back
                            		player.sendMessage(ChatColor.WHITE + "Usage: /Unban [Player]");
                            	    }else{
                            	    //Player typed some more
                            	    	Player target = Bukkit.getPlayerExact(args[0]);
                            	    	if (target == null) {
                            	    		//Target is not online
                            	    		Bukkit.getOfflinePlayer(args[0]).setBanned(false);
                            	    		Bukkit.broadcastMessage(ChatColor.BLUE + sender.getName() + " has unbanned " + args[0]);
                            	}}
                            	}else{
                            		player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
                            		
                            }}
                            else if(commandLabel.equalsIgnoreCase("kill") || commandLabel.equalsIgnoreCase("mkill") || commandLabel.equalsIgnoreCase("ekill") || commandLabel.equalsIgnoreCase("mykill")|| commandLabel.equalsIgnoreCase("mekill")){
                            	if(player.hasPermission("MyEssentials.kill")){
                            	if(args.length == 0){
                            	//Player only typed /kill so lets kill them back!
                            		player.sendMessage(ChatColor.WHITE + "Usage: /kill [Player]");
                            	}else{
                            		//Player typed some more
                            		Player target = Bukkit.getPlayerExact(args[0]);
                            		if (target == null) {
                            			//Target is not online
                            			player.sendMessage(ChatColor.DARK_RED + "That player is not online!");
                            		}else{
                            			//Targets online
                            			target.setHealth(0);
                            			Bukkit.broadcastMessage(ChatColor.BLUE + args[0] + " has been killed by " + sender.getName());
                                  }}
                            	  }else{ 
                            		  player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
                            
                            }}
                            else if(commandLabel.equalsIgnoreCase("kick") || commandLabel.equalsIgnoreCase("mkick") || commandLabel.equalsIgnoreCase("ekick") || commandLabel.equalsIgnoreCase("mykick")|| commandLabel.equalsIgnoreCase("mekick")){
		                    	if(player.hasPermission("MyEssentials.kick")){
		                    		if(args.length == 0) {
		                    			//Player only typed /kick so lets kick them back!
		                    			player.sendMessage(ChatColor.WHITE + "Usage: /kick [Player]");
		                    		}else{
		                    			//Player typed some more
		                    			Player target = Bukkit.getPlayerExact(args[0]);
		                    			if (target == null) {
		                    				//Target is not online
		                    				player.sendMessage(ChatColor.DARK_RED + "That player is not online!");
		                    			    }else{
		                    				//Targets online
		                    				target.kickPlayer("You have been kicked!");
		                    				Bukkit.broadcastMessage(ChatColor.BLUE + args[0] + " has been kicked by " + sender.getName());
		                    }
		                    }
		                    }else{
		                    	player.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
                            		}
		                    			}
		                    				
		                    			}
		                    		{
		return true;
		                    	}}}



		


            
		
		



   		



