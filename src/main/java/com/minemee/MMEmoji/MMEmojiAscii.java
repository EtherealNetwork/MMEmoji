package com.minemee.MMEmoji;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MMEmojiAscii{
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;  
		if(commandLabel.equalsIgnoreCase("spam")){
			if(args.length == 0){
				player.sendMessage("████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
			}
			else if(args.length == 1){
			  if(player.getServer().getPlayer(args[0]) != null){
			     Player targetPlayer = player.getServer().getPlayer(args[0]);
			     targetPlayer.sendMessage("████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
			     return true;
			  }
			}
		}
		if(commandLabel.equalsIgnoreCase("tableflip") || commandLabel.equalsIgnoreCase("table")){
		   player.chat("(╯°□°）╯︵ ┻━┻");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("dtable")){
		   player.chat("┻━┻ ︵ヽ(`Д´)ﾉ︵﻿ ┻━┻");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("finger")){
		   player.chat("┌∩┐(◣_◢)┌∩┐");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("shrug")){
		   player.chat("¯\\_(ツ)_/¯");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("wtf")){
		   player.chat("(ಠ_ಠ)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("why")){
		   player.chat("ლ(ಠ益ಠლ)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("cool")){
		   player.chat("( •_•)");
		   player.chat("( •_•)>⌐■-■");
		   player.chat("(⌐■_■)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("cry")){
		   player.chat("(╥﹏╥)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("sad")){
		   player.chat("(╯︵╰,)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("dead")){
		   player.chat("(✖╭╮✖)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("dance")){
		   player.chat("♪┏(°.°)┛┗(°.°)┓┗(°.°)┛┏(°.°)┓ ♪");
		   return true;
		} 
		if(commandLabel.equalsIgnoreCase("gimme")){
		   player.chat("༼ つ ◕_◕ ༽つ");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("bighit")){
		   player.chat("█▬█ █ ▀█▀");
		   return true;
		}  
		if(commandLabel.equalsIgnoreCase("visualizer") || commandLabel.equalsIgnoreCase("vis")){
		   player.chat("▇ ▅ █ ▅ ▇ ▂ ▃ ▁ ▁ ▅ ▃ ▅ ▅ ▄ ▅ ▇");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("bunny")){
		   player.chat("(\\_/)");
		   player.chat(" (^.^)");
		   player.chat("O(\")(\")");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("fixtable")){
		   player.chat("┬──┬ﾉ(° -°ﾉ)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("throw")){
		   player.chat("(ノಠ ∩ಠ)ノ彡( \\o°o)\\");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("erika")){
		   player.chat("༼☉ɷ⊙༽");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("donger")){
		   player.chat("ヽ༼ຈل͜ຈ༽ﾉ");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("wannago")){
		   player.chat("(ง •̀_•́)ง");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("snip")){
		   player.chat("( ＾◡＾)っ✂╰⋃╯");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("lilgimme")){
		   player.chat("(づ｡◕‿‿◕｡)づ");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("kirk")){
			player.chat("(◐ω◑ )");
			return true;
		}
		else{
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be used by a player.");
			}
		}
		return false;
	}
}
