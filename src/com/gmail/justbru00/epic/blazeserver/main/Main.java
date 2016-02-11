/**
THE (“EpicBlazeServer”) SOURCE IS PROVIDED AS IS AT NO MONETARY COST FOR PERSONAL USE ONLY. ANY COMMERCIAL DISTRIBUTION/USE OF THE (“EpicBlazeServer”) SOURCE IS STRICTLY PROHIBITED.
THIS PLUGIN WAS CREATED FOR ("BlazeServer") BY ("Justin Brubaker"). ANY USE WITHOUT PERMISSION OF ("Justin Brubaker") IS STRICTLY PROHIBITED.
YOU CAN CONTACT ("Justin Brubaker") AT ("epicrealmmc00@gmail.com").
 */
package com.gmail.justbru00.epic.blazeserver.main;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.justbru00.epic.blazeserver.utils.Messager;


public class Main extends JavaPlugin {

	public static final String PREFIX = Messager.color("&8[&bEpic&cBlaze&6Server&8] &f");
	public static ConsoleCommandSender console = Bukkit.getConsoleSender();
	public FileConfiguration config = getConfig();

	@Override
	public void onDisable() {	
		
	}

	@Override
	public void onEnable() {
		Messager.msgConsole("&bTHIS PLUGIN IS COPYRIGHT 2016 JUSTIN BRUBAKER.");
		Messager.msgConsole("&aBeginning Enable...");
		
		//getCommand("warn").setExecutor(new Warn(this));
		//getCommand("epicblazeserver").setExecutor();
		
		Messager.msgConsole("&aEnabled!");
	}
}
