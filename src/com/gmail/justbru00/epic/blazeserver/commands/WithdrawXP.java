/**
THE (“EpicBlazeServer”) SOURCE IS PROVIDED AS IS AT NO MONETARY COST FOR PERSONAL USE ONLY. ANY COMMERCIAL DISTRIBUTION/USE OF THE (“EpicBlazeServer”) SOURCE IS STRICTLY PROHIBITED.
THIS PLUGIN WAS CREATED FOR ("BlazeServer") BY ("Justin Brubaker"). ANY USE WITHOUT PERMISSION OF ("Justin Brubaker") IS STRICTLY PROHIBITED.
YOU CAN CONTACT ("Justin Brubaker") AT ("epicrealmmc00@gmail.com").
 */
package com.gmail.justbru00.epic.blazeserver.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.gmail.justbru00.epic.blazeserver.main.Main;
import com.gmail.justbru00.epic.blazeserver.utils.ItemMaker;

public class WithdrawXP implements CommandExecutor {
	
	Main main;
	
	public WithdrawXP(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (command.getName().equalsIgnoreCase("withdrawxp")) {
			if (!(sender instanceof Player)) {
				// Console not allowed message
				return true;
			}
			
			Player player = (Player) sender;
			
			if (!player.hasPermission("epicblazeserver.withdrawxp")) {
				// No permission msg
				return true;
			}
			
			if ((args.length != 1)) {
				// Too many args msg
				return true;
			}
			
			int amountOfLvls = 0;
			
			try {
				amountOfLvls = Integer.getInteger(args[0]);
			} catch (Exception e) {
				// Sorry not a number msg
				return true;
			}
			
			ItemStack xpBall = ItemMaker.createItemStack("&eXP Ball &5(Right Click to deposit.)", "SLIME_BALL", "&bNumber of levels:", "&f" + amountOfLvls);
			
			player.giveExpLevels(-amountOfLvls);
			
			player.getInventory().addItem(xpBall);
			// Complete Msg
			
			return true;
		}
		
		return false;
	}
	
}
