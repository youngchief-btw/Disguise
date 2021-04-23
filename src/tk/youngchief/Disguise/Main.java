package tk.youngchief.Disguise;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    // public static void main(String[] args) {
        @Override
        public void onEnable() {
        // Register our command "nick" (set an instance of your command class as executor)
        this.getCommand("nick").setExecutor(new NickCommand());
    }
    // }
}