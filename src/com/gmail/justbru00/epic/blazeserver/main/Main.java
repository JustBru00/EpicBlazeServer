/**
THE (“EpicBlazeServer”) SOURCE IS PROVIDED AS IS AT NO MONETARY COST FOR PERSONAL USE ONLY. ANY COMMERCIAL DISTRIBUTION/USE OF THE (“EpicBlazeServer”) SOURCE IS STRICTLY PROHIBITED.
THIS PLUGIN WAS CREATED FOR ("BlazeServer") BY ("Justin Brubaker"). ANY USE WITHOUT PERMISSION OF ("Justin Brubaker") IS STRICTLY PROHIBITED.
YOU CAN CONTACT ("Justin Brubaker") AT ("epicrealmmc00@gmail.com").
 */
package com.gmail.justbru00.epic.blazeserver.main;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.justbru00.epic.blazeserver.commands.EpicBlazeServer;
import com.gmail.justbru00.epic.blazeserver.commands.WithdrawXP;
import com.gmail.justbru00.epic.blazeserver.utils.Messager;



public class Main extends JavaPlugin {

	public static final String PREFIX = Messager.color("&8[&bEpic&cBlaze&6Server&8] &f");
	public static ConsoleCommandSender console = Bukkit.getConsoleSender();
	public FileConfiguration config = getConfig();
	public PluginDescriptionFile pdf = this.getDescription();
	public final String VERSION = pdf.getVersion();

	@Override
	public void onDisable() {	
		Messager.msgConsole("&cPlugin Disabled.");
	}

	@Override
	public void onEnable() {
		Messager.msgConsole("&bTHIS PLUGIN IS COPYRIGHT 2016 JUSTIN BRUBAKER.");
		Messager.msgConsole("&aBeginning Enable...");
		
		getCommand("withdrawxp").setExecutor(new WithdrawXP(this));
		getCommand("epicblazeserver").setExecutor(new EpicBlazeServer(this));
		
		// Start stats
				
					try {
						Metrics metrics = new Metrics(this);
						metrics.start();
					} catch (IOException e) {
						// Failed to submit the stats :-(
					}
				
		
		Messager.msgConsole("&aEnabled!");
	}
}
