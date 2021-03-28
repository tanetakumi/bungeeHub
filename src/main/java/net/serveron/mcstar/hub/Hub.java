package net.serveron.mcstar.hub;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public final class Hub extends Plugin {

    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new HubCommand(this));
    }

    @Override
    public void onDisable() {
    }
}
