package ink.anh.example;

import org.bukkit.plugin.java.JavaPlugin;

public class ExampleLangPlugin extends JavaPlugin {
	
    private static ExampleLangPlugin instance;
    private GlobalManager manager;


    public static ExampleLangPlugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        manager = GlobalManager.getManager(instance);

        this.getCommand("example").setExecutor(new ExampleCommand(this));
    }

	public GlobalManager getManager() {
		return manager;
	}
}
