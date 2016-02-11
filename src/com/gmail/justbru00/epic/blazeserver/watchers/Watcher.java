/**
THE (“EpicBlazeServer”) SOURCE IS PROVIDED AS IS AT NO MONETARY COST FOR PERSONAL USE ONLY. ANY COMMERCIAL DISTRIBUTION/USE OF THE (“EpicBlazeServer”) SOURCE IS STRICTLY PROHIBITED.
THIS PLUGIN WAS CREATED FOR ("BlazeServer") BY ("Justin Brubaker"). ANY USE WITHOUT PERMISSION OF ("Justin Brubaker") IS STRICTLY PROHIBITED.
YOU CAN CONTACT ("Justin Brubaker") AT ("epicrealmmc00@gmail.com").
 */
package com.gmail.justbru00.epic.blazeserver.watchers;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import com.gmail.justbru00.epic.blazeserver.main.Main;
import com.gmail.justbru00.epic.blazeserver.utils.Messager;


public class Watcher implements Listener {
	
	Main main;
	
	@EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){
        final Player player = e.getPlayer(); 
        ItemStack inHand = player.getItemInHand();
    	
    	
    	if (e.getAction() != Action.RIGHT_CLICK_BLOCK) return;
    	
    	if (inHand.getItemMeta().getLore() == null) return;
    	
        if (inHand.getItemMeta().getDisplayName().equals(Messager.color("&eXP Ball &5(Right Click to deposit.)"))) {
            if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
                if(inHand.getType() == Material.SLIME_BALL){               	
                
                		if (inHand.getItemMeta().getLore().get(0).equals(Messager.color("&bNumber of levels:"))) {
                	
                			int giveLvls = 0;
                			try {
                				giveLvls = Integer.getInteger(ChatColor.stripColor(inHand.getItemMeta().getLore().get(1)));
                			} catch (Exception exeption) {
                				//Error (Should never happen.)
                				return;
                			}
                			
    		              player.giveExpLevels(giveLvls);      
    		              // Gave you x amount opf lvls msg.
    		              
    		              int amountInHand = inHand.getAmount();
    		              if (amountInHand == 1) {
    		            	  player.setItemInHand(new ItemStack(Material.AIR));
    		              } else {
    		              inHand.setAmount(--amountInHand);
    		              }    	         			
                	}
            		}
                  }
            	}
                 
            }  
    	
	
	public Watcher(Main main) {				
		this.main = main;
	}


	// Sends plugin developer (Justin Brubaker) a msg when he joins the server.
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
	 if (e.getPlayer().getName().equalsIgnoreCase("JustBru00")) {
		 e.getPlayer().sendMessage(Messager.color(Main.PREFIX + "&bThis Server Uses EpicBlazeServer."));		 
	 }
	}
}
