package Reptile.GradleDiscordBot.command.commands;

import Reptile.GradleDiscordBot.command.CommandContext;
import Reptile.GradleDiscordBot.command.ICommand;
import net.dv8tion.jda.api.JDA;

public class PingCmd implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        JDA jda = ctx.getJDA();

        jda.getRestPing().queue(
                (ping) -> ctx.getChannel()
                        .sendMessageFormat("Reset ping: %sms", ping).queue()
        );
    }


    @Override
    public String getName() {
        return "ping";
    }
}
