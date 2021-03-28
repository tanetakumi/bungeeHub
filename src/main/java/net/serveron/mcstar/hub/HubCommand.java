package net.serveron.mcstar.hub;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class HubCommand extends Command {
    private final Hub hubPlugin;

    public HubCommand(Hub hubPlugin) {
        super("hub");
        this.hubPlugin = hubPlugin;

    }
    public void execute(CommandSender sender, String[] args) {
        if ((sender instanceof ProxiedPlayer)) {
            ProxiedPlayer p = (ProxiedPlayer) sender;
            p.connect(ProxyServer.getInstance().getServerInfo("lobby"));
        }
    }
}
