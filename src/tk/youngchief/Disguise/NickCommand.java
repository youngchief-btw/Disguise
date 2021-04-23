package tk.youngchief.Disguise;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCommand implements CommandExecutor {
    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args[1] == "set") {
                player.setDisplayName(args[2]);
                player.setPlayerListName(args[2]);
            } else if (args[1] == "clear") {
                player.setDisplayName(player.getName());
                player.setPlayerListName(player.getName());
            }
            return true;
        } else {
            return false;
        }
    }
}