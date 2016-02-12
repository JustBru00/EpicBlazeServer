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

public class EpicBlazeServer implements CommandExecutor {
	
	Main main;
	
	public EpicBlazeServer(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("epicblazeserver")) {
			if (!sender.hasPermission("epicblazeserver.epicblazeserver")) {
				// No permission msg
				return true;
			}
			
			if (args.length != 1) {
				// Too many args msg
				return true;
			}
			
			if (args[0].equalsIgnoreCase("version")) {
				// Send version msg
				return true;
			} else if (args[0].equalsIgnoreCase("info")) {
				// Send info msg (Authors name and license link.) at least.
				return true;
			}
			
			return true;
			// End of command
		}
		return false;
	}
}
