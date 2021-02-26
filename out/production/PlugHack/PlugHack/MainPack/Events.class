package PlugHack.MainPack;

import com.sun.javafx.tk.quantum.MasterTimer;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.entity.ComplexLivingEntity;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.persistence.PersistentDataType;

import java.util.Collection;
import java.util.Objects;

public class Events implements Listener {
    PlugHackMainC plugin;
    public Events(PlugHackMainC plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
       if(!event.getPlayer().hasPlayedBefore()) {
           Player targetPlayer = event.getPlayer();
           targetPlayer.getPersistentDataContainer().set(new NamespacedKey(plugin, "scaffoldtoggle"), PersistentDataType.STRING, "false");
           targetPlayer.getPersistentDataContainer().set(new NamespacedKey(plugin, "nofall"), PersistentDataType.STRING, "false");
           targetPlayer.getPersistentDataContainer().set(new NamespacedKey(plugin, "speed"), PersistentDataType.STRING, "false");
        }
       }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        if(e.getPlayer().getPersistentDataContainer().get(new NamespacedKey(plugin,"scaffoldtoggle"), PersistentDataType.STRING) == "true") {
            Block block = e.getPlayer().getLocation().subtract(0, 1, 0).getBlock();

        if(block.getType() == Material.AIR) {
            Material configblock = Material.valueOf(plugin.getConfig().getString("scaffold_block"));
            block.setType(configblock);
            }
        }
    }
    @EventHandler
    public void onEntityDamageEvent(final EntityDamageEvent e) {
        if(Objects.requireNonNull(e.getEntity()).getPersistentDataContainer().getOrDefault(new NamespacedKey(plugin,"nofall"), PersistentDataType.STRING, "false").equals("true")) {
           if(e.getEntity() instanceof Player) {
               if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                    e.setCancelled(true);
               }
           }


        }
    }
    @EventHandler
    public void PotionSplashEvent(PotionSplashEvent e) {
        for(LivingEntity ent : e.getAffectedEntities()){
            if(ent.getPersistentDataContainer().getOrDefault(new NamespacedKey(plugin,"noeffect"), PersistentDataType.STRING, "false").equals("true")) {
                ent.getActivePotionEffects().clear();
            }
        }
    }
}

