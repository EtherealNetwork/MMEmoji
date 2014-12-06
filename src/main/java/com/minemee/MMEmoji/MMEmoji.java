package com.minemee.MMEmoji;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class MMEmoji extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		log.info("MMEmoji enabled!");
		// Commands:
		getCommand("tableflip").setExecutor(new MMEmojiAscii());
		getCommand("table").setExecutor(new MMEmojiAscii());
		getCommand("dtable").setExecutor(new MMEmojiAscii());
		getCommand("finger").setExecutor(new MMEmojiAscii());
		getCommand("shrug").setExecutor(new MMEmojiAscii());
		getCommand("wtf").setExecutor(new MMEmojiAscii());
		getCommand("why").setExecutor(new MMEmojiAscii());
		getCommand("cool").setExecutor(new MMEmojiAscii());
		getCommand("cry").setExecutor(new MMEmojiAscii());
		getCommand("sad").setExecutor(new MMEmojiAscii());
		getCommand("dead").setExecutor(new MMEmojiAscii());
		getCommand("dance").setExecutor(new MMEmojiAscii());
		getCommand("gimme").setExecutor(new MMEmojiAscii());
		getCommand("bighit").setExecutor(new MMEmojiAscii());
		getCommand("visualizer").setExecutor(new MMEmojiAscii());
		getCommand("vis").setExecutor(new MMEmojiAscii());
		getCommand("spam").setExecutor(new MMEmojiAscii());
		getCommand("bunny").setExecutor(new MMEmojiAscii());
		getCommand("fixtable").setExecutor(new MMEmojiAscii());
		getCommand("throw").setExecutor(new MMEmojiAscii());
		getCommand("erika").setExecutor(new MMEmojiAscii());
		getCommand("donger").setExecutor(new MMEmojiAscii());
		getCommand("wannago").setExecutor(new MMEmojiAscii());
		getCommand("snip").setExecutor(new MMEmojiAscii());
		getCommand("lilgimme").setExecutor(new MMEmojiAscii());
		getCommand("kirk").setExecutor(new MMEmojiAscii());
		getCommand("ecast").setExecutor(new MMEmojiAscii());
	}
 
	public void onDisable(){
		log.info("MMEmoji disabled.");
	}
	
}