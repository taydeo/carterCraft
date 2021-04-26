package com.catsinred.cartercraft.traits;

import com.catsinred.cartercraft.CarterCraft;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.trait.Trait;
import net.md_5.bungee.api.ChatColor;

public class CarterTraits extends Trait {
    private CarterCraft plugin = null;
    private boolean isCarterAngry = false;

    public CarterTraits() {
        super("CarterTraits");
        plugin = JavaPlugin.getPlugin(CarterCraft.class);
    }

    public boolean checkCarterStatus() {
        return isCarterAngry;
    }

    @EventHandler
    public void onHit(net.citizensnpcs.api.event.NPCDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();

            player.sendMessage(ChatColor.translateAlternateColorCodes((char) 0x0026, "&cYou made Jimmy Carter angry."));
        }
    }

    @Override
	public void onSpawn() {
        npc.data().set(NPC.PLAYER_SKIN_TEXTURE_PROPERTIES_METADATA, "ewogICJ0aW1lc3RhbXAiIDogMTYxOTQ2MDIxMjM0OSwKICAicHJvZmlsZUlkIiA6ICIzOWEzOTMzZWE4MjU0OGU3ODQwNzQ1YzBjNGY3MjU2ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZW1pbmVjcmFmdGVybG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMxMzFhN2FhYzVhNGYxNWRmNmYxZmVhOWIyYTg2NzJlMjk2MmUxMTkyNmMxMGEwMmI1ZGFjODUxOTk0OWM5Y2MiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==");
        npc.data().set(NPC.PLAYER_SKIN_TEXTURE_PROPERTIES_SIGN_METADATA, "o9rF0WDlLuNYr6YDOomVV4Pxru0BO4ex+EJtAY5q2oqVAKCF7TETdB1R50mEq+8GURSiE/lxoLnb838iIvBC/mpQNdjuvTBgDxeb5tLCAuK9A9l2ZbI4+xztk98uoyY/T+n9xXqNKILpmOqwfXoGQGsEJBv4uigzK40vwXJRuDUXnsod8btjyBnuNyaGJwIKcvHfBtpjWU+ZK14SVHCR6Y00H3WTDAtzC6ZVRZHYwr9NWW510H9bUw1ylYyEWQmPHjN1nzAejH2Ym/1Sd7J5+8RcGRCHGGg6rmQ61BCxheSNUXYZ3G0zDBGAF2e5LVERgZl2nU4H/t7mtFeBANkAKkrP/p/PUSl4uhZEsbZjNgxWON1YOA59yNcw3G8pk0OvYKL675uv34KtCL3yEYEFqHZd7opXkp5HaBknJZAHkMSWEcSidInhzIAMZ3p3H+vayTz/Gk9J1C5xJwuhTL3YM1yN10gmQnPOUEorFAct9jpLUiKnYRPCujK2MFK9PG/tQfJLieI8fT0d/N4VvdYkM/qIAHn4vXt2Kx428psdm9/jJ/xJc1iMxVCRAbobMroDxMInzEjXrj3HGYwzh6g14BbE8CNraeSsZPqdvtXH4MhDCTzILXAT+3YaTohSyE3XFj/9GlkuZwlXVM0VgYlBV0tC5RhzGUZlPEyIW251pvM=");
    }
}
