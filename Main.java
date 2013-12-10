package Pokemobs;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: MayoDwarf
 * Date: 12/9/13
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main extends JavaPlugin {
    public String title = new String(ChatColor.WHITE + "["+ ChatColor.BLUE+" Pokemobs "+ChatColor.WHITE+"]"+ChatColor.RESET);
      public void onEnable() {
        System.out.println(title + "This plugin was created by MayoDwarf & MROMGITSRYAND");
           File f1 = new File(getDataFolder(), "plugins"+File.separator+"Pokemobs");
           File f2 = new File(getDataFolder(), "plugins"+File.separator+"Pokemobs"+File.separator+"Accounts");
          if(!f1.exists()) {
            f1.mkdir();
          }
          if(!f2.exists()) {
                f2.mkdir();
          }
      }
    public void onDisable() {
        System.out.println(title + "This plugin was created by MayoDwarf & MROMGITSRYAND");
    }
    public void onJoin(Player p) {
        p.sendMessage(title+ChatColor.YELLOW+"This plugin was created by MayoDwarf & MROMGITSRYAND");
        File player = new File(getDataFolder(), "plugins"+File.separator+"Pokemobs"+File.separator+"Accounts"+File.separator+p.getName()+".yml");
        if(!player.exists()) {
            try {
                player.createNewFile();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
