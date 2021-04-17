package com.catsinred.cartercraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCarter implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args[0] == "spawn") {
                player.sendMessage("Waiting to be implemented.");
            } else {
                player.sendMessage("No input recieved.");
            }
        }
        return false;
    }
    
}
