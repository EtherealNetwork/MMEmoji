package com.minemee.MMEmoji;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class MMEmojiAscii implements CommandExecutor{
	String spam = "████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████";
	String tableflip = "(╯°□°）╯︵ ┻━┻";
	String dtable = "┻━┻ ︵ヽ(`Д´)ﾉ︵﻿ ┻━┻";
	String finger = "┌∩┐(◣_◢)┌∩┐";
	String shrug = "¯\\_(ツ)_/¯";
	String wtf = "(ಠ_ಠ)";
	String why = "ლ(ಠ益ಠლ)";
	String cool = "(⌐■_■)";
	String cry = "(╥﹏╥)";
	String sad = "(╯︵╰,)";
	String dead = "(✖╭╮✖)";
	String dance = "♪┏(°.°)┛┗(°.°)┓┗(°.°)┛┏(°.°)┓ ♪";
	String gimme = "༼ つ ◕_◕ ༽つ";
	String bighit = "█▬█ █ ▀█▀";
	String visualizer = "▇ ▅ █ ▅ ▇ ▂ ▃ ▁ ▁ ▅ ▃ ▅ ▅ ▄ ▅ ▇";
	// Bunny is more that one line.
	String fixtable = "┬──┬ﾉ(° -°ﾉ)";
	String throwP = "(ノಠ ∩ಠ)ノ彡( \\o°o)\\";
	String erika = "༼☉ɷ⊙༽";
	String donger = "ヽ༼ຈل͜ຈ༽ﾉ";
	String wannago = "(ง •̀_•́)ง";
	String snip = "( ＾◡＾)っ✂╰⋃╯";
	String lilgimme = "(づ｡◕‿‿◕｡)づ";
	String kirk = "(◐ω◑ )";

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (sender instanceof Player) 
		{
			Player player = (Player) sender;
			if(commandLabel.equalsIgnoreCase("spam")){
				if(args.length == 0){
					player.sendMessage(spam);
				}
				else if(args.length == 1){
				  if(player.getServer().getPlayer(args[0]) != null){
				     Player targetPlayer = player.getServer().getPlayer(args[0]);
				     targetPlayer.sendMessage(spam);
				     return true;
				  }
				 else if(args.length == 2)
				 {
					 if(player.getServer().getPlayer(args[0]) != null){
					     Player targetPlayer = player.getServer().getPlayer(args[0]);
					     if(args[1].equalsIgnoreCase("tableflip"))
					    	 for(int i=20;i>=0;i--)
					    		 targetPlayer.sendMessage(tableflip);
					     return true;
					  }
				 }
				}
			}
			if(commandLabel.equalsIgnoreCase("tableflip") || commandLabel.equalsIgnoreCase("table")){
			   player.chat(tableflip);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("dtable")){
			   player.chat(dtable);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("finger")){
			   player.chat(finger);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("shrug")){
			   player.chat(shrug);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("wtf")){
			   player.chat(wtf);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("why")){
			   player.chat(why);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("cool")){
			   player.chat("( •_•)");
			   player.chat("( •_•)>⌐■-■");
			   player.chat("(⌐■_■)");
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("cry")){
			   player.chat(cry);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("sad")){
			   player.chat(sad);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("dead")){
			   player.chat(dead);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("dance")){
			   player.chat(dance);
			   return true;
			} 
			if(commandLabel.equalsIgnoreCase("gimme")){
			   player.chat(gimme);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("bighit")){
			   player.chat(bighit);
			   return true;
			}  
			if(commandLabel.equalsIgnoreCase("visualizer") || commandLabel.equalsIgnoreCase("vis")){
			   player.chat(visualizer);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("bunny")){
			   player.chat("(\\_/)");
			   player.chat(" (^.^)");
			   player.chat("O(\")(\")");
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("fixtable")){
			   player.chat(fixtable);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("throw")){
			   player.chat(throwP);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("erika")){
			   player.chat(erika);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("donger")){
			   player.chat(donger);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("wannago")){
			   player.chat(wannago);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("snip")){
			   player.chat(snip);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("lilgimme")){
			   player.chat(lilgimme);
			   return true;
			}
			if(commandLabel.equalsIgnoreCase("kirk")){
				player.chat(kirk);
				return true;
			}
			if(commandLabel.equalsIgnoreCase("ecast")){
				String message = "";
				if(args.length == 0){
					player.sendMessage(ChatColor.GRAY + "Usage:");
					player.sendMessage(ChatColor.GRAY + "/ecast <message> (Same as /tm bc)");
					player.sendMessage(ChatColor.GRAY + "/ecast <emojiName>");
					player.sendMessage(ChatColor.GRAY + "/ecast <bigEmojiName> <smallEmojiName>");
				}
				else if(args.length == 1){
					String emoji = "";
					if(args[0].substring(0,1).equalsIgnoreCase("&"))
					{
						emoji += args[0].substring(0,2);
						args[0] = args[0].substring(2);
					}
					if(args[0].equalsIgnoreCase(spam))
						emoji += spam;
					else if(args[0].equalsIgnoreCase("tableflip") || args[0].equalsIgnoreCase("table"))
						emoji += tableflip;
					else if(args[0].equalsIgnoreCase("dtable"))
						emoji += dtable;
					else if(args[0].equalsIgnoreCase("finger"))
						emoji += finger;
					else if(args[0].equalsIgnoreCase("shrug"))
						emoji += shrug;
					else if(args[0].equalsIgnoreCase("wtf"))
						emoji += why;
					else if(args[0].equalsIgnoreCase("cool"))
						emoji += cool;
					else if(args[0].equalsIgnoreCase("cry"))
						emoji += cry;
					else if(args[0].equalsIgnoreCase("sad"))
						emoji += sad;
					else if(args[0].equalsIgnoreCase("dead"))
						emoji += dead;
					else if(args[0].equalsIgnoreCase("dance"))
						emoji += dance;
					else if(args[0].equalsIgnoreCase("gimme"))
						emoji += gimme;
					else if(args[0].equalsIgnoreCase("bighit"))
						emoji += bighit;
					else if(args[0].equalsIgnoreCase("visualizer") || args[0].equalsIgnoreCase("vis"))
						emoji += visualizer;
					else if(args[0].equalsIgnoreCase("fixtable"))
						emoji += fixtable;
					else if(args[0].equalsIgnoreCase("throw"))
						emoji += throwP;
					else if(args[0].equalsIgnoreCase("erika"))
						emoji += "erika";
					else if(args[0].equalsIgnoreCase("donger"))
						emoji += donger;
					else if(args[0].equalsIgnoreCase("wannago"))
						emoji += wannago;
					else if(args[0].equalsIgnoreCase("snip"))
						emoji += snip;
					else if(args[0].equalsIgnoreCase("lilgimme"))
						emoji += lilgimme;
					else if(args[0].equalsIgnoreCase("kirk"))
						emoji += kirk;
					else
						emoji += args[0];
				    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),"tm bc " + emoji);
				    return true;
				  }
				 else if(args.length == 2)
				 {
					 String bigEmoji = "";
					 String smallEmoji = "";
					 if(args[0].substring(0,1).equalsIgnoreCase("&"))
						{
							bigEmoji += args[0].substring(0,2);
							args[0] = args[0].substring(2);
						}
					 if(args[0].equalsIgnoreCase(spam))
							bigEmoji += spam;
						else if(args[0].equalsIgnoreCase("tableflip") || args[0].equalsIgnoreCase("table"))
							bigEmoji += tableflip;
						else if(args[0].equalsIgnoreCase("dtable"))
							bigEmoji += dtable;
						else if(args[0].equalsIgnoreCase("finger"))
							bigEmoji += finger;
						else if(args[0].equalsIgnoreCase("shrug"))
							bigEmoji += shrug;
						else if(args[0].equalsIgnoreCase("wtf"))
							bigEmoji += why;
						else if(args[0].equalsIgnoreCase("cool"))
							bigEmoji += cool;
						else if(args[0].equalsIgnoreCase("cry"))
							bigEmoji += cry;
						else if(args[0].equalsIgnoreCase("sad"))
							bigEmoji += sad;
						else if(args[0].equalsIgnoreCase("dead"))
							bigEmoji += dead;
						else if(args[0].equalsIgnoreCase("dance"))
							bigEmoji += dance;
						else if(args[0].equalsIgnoreCase("gimme"))
							bigEmoji += gimme;
						else if(args[0].equalsIgnoreCase("bighit"))
							bigEmoji += bighit;
						else if(args[0].equalsIgnoreCase("visualizer") || args[0].equalsIgnoreCase("vis"))
							bigEmoji += visualizer;
						else if(args[0].equalsIgnoreCase("fixtable"))
							bigEmoji += fixtable;
						else if(args[0].equalsIgnoreCase("throw"))
							bigEmoji += throwP;
						else if(args[0].equalsIgnoreCase("erika"))
							bigEmoji += "erika";
						else if(args[0].equalsIgnoreCase("donger"))
							bigEmoji += donger;
						else if(args[0].equalsIgnoreCase("wannago"))
							bigEmoji += wannago;
						else if(args[0].equalsIgnoreCase("snip"))
							bigEmoji += snip;
						else if(args[0].equalsIgnoreCase("lilgimme"))
							bigEmoji += lilgimme;
						else if(args[0].equalsIgnoreCase("kirk"))
							bigEmoji += kirk;
						else 
							bigEmoji += args[0];
					 if(args[1].substring(0,1).equalsIgnoreCase("&"))
						{
							smallEmoji += args[1].substring(0,2);
							args[1] = args[1].substring(2);
						}
					 if(args[1].equalsIgnoreCase(spam))
							smallEmoji += spam;
						else if(args[1].equalsIgnoreCase("tableflip") || args[1].equalsIgnoreCase("table"))
							smallEmoji += tableflip;
						else if(args[1].equalsIgnoreCase("dtable"))
							smallEmoji += dtable;
						else if(args[1].equalsIgnoreCase("finger"))
							smallEmoji += finger;
						else if(args[1].equalsIgnoreCase("shrug"))
							smallEmoji += shrug;
						else if(args[1].equalsIgnoreCase("wtf"))
							smallEmoji += why;
						else if(args[1].equalsIgnoreCase("cool"))
							smallEmoji += cool;
						else if(args[1].equalsIgnoreCase("cry"))
							smallEmoji += cry;
						else if(args[1].equalsIgnoreCase("sad"))
							smallEmoji += sad;
						else if(args[1].equalsIgnoreCase("dead"))
							smallEmoji += dead;
						else if(args[1].equalsIgnoreCase("dance"))
							smallEmoji += dance;
						else if(args[1].equalsIgnoreCase("gimme"))
							smallEmoji += gimme;
						else if(args[1].equalsIgnoreCase("bighit"))
							smallEmoji += bighit;
						else if(args[1].equalsIgnoreCase("visualizer") || args[1].equalsIgnoreCase("vis"))
							smallEmoji += visualizer;
						else if(args[1].equalsIgnoreCase("fixtable"))
							smallEmoji += fixtable;
						else if(args[1].equalsIgnoreCase("throw"))
							smallEmoji += throwP;
						else if(args[1].equalsIgnoreCase("erika"))
							smallEmoji += "erika";
						else if(args[1].equalsIgnoreCase("donger"))
							smallEmoji += donger;
						else if(args[1].equalsIgnoreCase("wannago"))
							smallEmoji += wannago;
						else if(args[1].equalsIgnoreCase("snip"))
							smallEmoji += snip;
						else if(args[1].equalsIgnoreCase("lilgimme"))
							smallEmoji += lilgimme;
						else if(args[1].equalsIgnoreCase("kirk"))
							smallEmoji += kirk;
						else
							smallEmoji += args[1];
					 Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),"tm bc " + bigEmoji + "<nl>" + smallEmoji);
					 return true;					  
				 }
				 else
				 {
					 if(args.length > 2)
					 {
						 for(int i=0;i<args.length;i++)
							 message += args[i] + " ";
					 }
					 Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),"tm bc " + message);
				 }
			}
		}
		else
		{
			sender.sendMessage("Only players can use this command.");
			return false;
		}	           
		return false;
	}	
}