package com.NAME.testmodule;

import net.year4000.utilities.bukkit.MessageUtil;
import net.year4000.utilities.bukkit.commands.Command;
import net.year4000.utilities.bukkit.commands.CommandContext;
import net.year4000.utilities.bukkit.commands.CommandException;
import net.year4000.utilities.bukkit.commands.CommandPermissions;
import org.bukkit.command.CommandSender;

public final class TestCommands {
    @Command(
        aliases = {"test", "tst"},
        desc = "Description fo the command."
    )
    @CommandPermissions({"permission.node"})
    public static void command(CommandContext args, CommandSender sender) throws CommandException {
        sender.sendMessage(MessageUtil.message("&7Hello &6 %s &7!", sender.getName()));
        sender.sendMessage(ConfigSetting.get().getName());
    }

    @Command(
        aliases = {"test2", "tst2"},
        desc = "Description fo the command."
    )
    public static void commandTwo(CommandContext args, CommandSender sender) throws CommandException {
        sender.sendMessage(MessageUtil.message("&6Hello &7 %s &6!", sender.getName()));
        sender.sendMessage(ConfigSetting.get().getName());
    }
}
