package com.NAME.testmodule;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TestListener implements Listener {
    @EventHandler
    public void onLogin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
    }
}
