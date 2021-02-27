package PlugHack.MainPack;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PlugHackMainC extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getCommand("flyp").setExecutor(new FlyHack());
        this.getServer().getPluginManager().registerEvents(new Events(this), this);
        this.getCommand("scaffold").setExecutor(new ScaffoldCommand(this));
        this.getCommand("speed").setExecutor(new Speed(this));
        this.getCommand("nofall").setExecutor(new NoFall(this));

        this.getCommand("velocity").setExecutor(new Velocity(this));
        this.getCommand("godp").setExecutor(new God(this));
        int pluginid =  10504;
        Metrics metrics = new Metrics(this, pluginid);
        this.saveDefaultConfig();
        Bukkit.getLogger().info("  _____   _                  _    _               _    ");
        Bukkit.getLogger().info(" |  __ \\| |                | |  | |             | |   ");
        Bukkit.getLogger().info(" | |__) || | _   _   __ _   | |__| |  __ _   ___ | | __");
        Bukkit.getLogger().info(" |  ___/ | || | | | / _` |  |  __  | / _` | / __|| |/ /");
        Bukkit.getLogger().info(" | |     | || |_| || (_| |  | |  | || (_| || (__ |   < ");
        Bukkit.getLogger().info(" |_|     |_| \\__,_| \\__,  | |_|  ||\\__,_|\\___||_|\\_\\");
        Bukkit.getLogger().info("                     __/ |                             ");
        Bukkit.getLogger().info("                    |___/                              ");
        Bukkit.getLogger().info("A JuicySeals creation!");
        Bukkit.getLogger().info("");
    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info("  _____   _                  _    _               _    ");
        Bukkit.getLogger().info(" |  __ \\ | |               | |  | |             | |   ");
        Bukkit.getLogger().info(" | |__) || | _   _   __ _   | |__| |  __ _   ___ | | __");
        Bukkit.getLogger().info(" |  ___/ | || | | | / _` |  |  __  | / _` | / __|| |/ /");
        Bukkit.getLogger().info(" | |     | || |_| || (_| |  | |  | || (_| || (__ |   < ");
        Bukkit.getLogger().info(" |_|     |_| \\__,_| \\__,  | |_|  ||\\__,_|\\___||_|\\_\\");
        Bukkit.getLogger().info("                     __/ |                             ");
        Bukkit.getLogger().info("                    |___/                              ");
        Bukkit.getLogger().info("A JuicySeals creation!");

    }







}

