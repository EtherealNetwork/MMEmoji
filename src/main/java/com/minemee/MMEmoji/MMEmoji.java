package com.minemee.MMEmoji;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class MMEmoji extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");

	public final MMEmojiAscii mmEmojiAscii = new MMEmojiAscii();

	public void onEnable(){
		log.info("MMEmoji enabled!");
	}
 
	public void onDisable(){
		log.info("MMEmoji disabled.");
	}

}