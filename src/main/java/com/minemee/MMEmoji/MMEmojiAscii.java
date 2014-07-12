package com.minemee.MMEmoji;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MMEmojiAscii {
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;  
		if(commandLabel.equalsIgnoreCase("mmemoji spam")){
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
		if(commandLabel.equalsIgnoreCase("mmemoji tableflip") || commandLabel.equalsIgnoreCase("mmemoji table")){
		   player.chat("(╯°□°）╯︵ ┻━┻");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji dtable")){
		   player.chat("┻━┻ ︵ヽ(`Д´)ﾉ︵﻿ ┻━┻");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji finger")){
		   player.chat("┌∩┐(◣_◢)┌∩┐");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji shrug")){
		   player.chat("¯\\_(ツ)_/¯");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji wtf")){
		   player.chat("(ಠ_ಠ)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji why")){
		   player.chat("ლ(ಠ益ಠლ)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji cool")){
		   player.chat("( •_•)");
		   player.chat("( •_•)>⌐■-■");
		   player.chat("(⌐■_■)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji cry")){
		   player.chat("(╥﹏╥)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji sad")){
		   player.chat("(╯︵╰,)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji dead")){
		   player.chat("(✖╭╮✖)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji dance")){
		   player.chat("♪┏(°.°)┛┗(°.°)┓┗(°.°)┛┏(°.°)┓ ♪");
		   return true;
		} 
		if(commandLabel.equalsIgnoreCase("mmemoji gimme")){
		   player.chat("༼ つ ◕_◕ ༽つ");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji bighit")){
		   player.chat("█▬█ █ ▀█▀");
		   return true;
		}  
		if(commandLabel.equalsIgnoreCase("mmemoji visualizer") || commandLabel.equalsIgnoreCase("mmemoji vis")){
		   player.chat("▇ ▅ █ ▅ ▇ ▂ ▃ ▁ ▁ ▅ ▃ ▅ ▅ ▄ ▅ ▇");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji bunny")){
		   player.chat("(\\_/)");
		   player.chat(" (^.^)");
		   player.chat("O(\")(\")");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji fixtable")){
		   player.chat("┬──┬ﾉ(° -°ﾉ)");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji throw")){
		   player.chat("(ノಠ ∩ಠ)ノ彡( \\o°o)\\");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji erika")){
		   player.chat("༼☉ɷ⊙༽");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji donger")){
		   player.chat("ヽ༼ຈل͜ຈ༽ﾉ");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji wannago")){
		   player.chat("(ง •̀_•́)ง");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji snip")){
		   player.chat("( ＾◡＾)っ✂╰⋃╯");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji lilgimme")){
		   player.chat("(づ｡◕‿‿◕｡)づ");
		   return true;
		}
		if(commandLabel.equalsIgnoreCase("mmemoji kirk")){
			player.chat("(◐ω◑ )");
			return true;
		}
		else{
			if (!(sender instanceof Player)) {
				sender.sendMessage("This command can only be run by a player.");
			}
		}
		return false;
	}
}
