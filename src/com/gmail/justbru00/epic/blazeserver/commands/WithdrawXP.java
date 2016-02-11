/**
THE (“EpicBlazeServer”) SOURCE IS PROVIDED AS IS AT NO MONETARY COST FOR PERSONAL USE ONLY. ANY COMMERCIAL DISTRIBUTION/USE OF THE (“EpicBlazeServer”) SOURCE IS STRICTLY PROHIBITED.
THIS PLUGIN WAS CREATED FOR ("BlazeServer") BY ("Justin Brubaker"). ANY USE WITHOUT PERMISSION OF ("Justin Brubaker") IS STRICTLY PROHIBITED.
YOU CAN CONTACT ("Justin Brubaker") AT ("epicrealmmc00@gmail.com").
 */
package com.gmail.justbru00.epic.blazeserver.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.gmail.justbru00.epic.blazeserver.main.Main;

public class WithdrawXP implements CommandExecutor {
	
	Main main;
	
	public WithdrawXP(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		return false;
	}
	
}
