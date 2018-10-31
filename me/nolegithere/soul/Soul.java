package me.nolegithere.soul;

import com.darkmagician6.eventapi.EventManager;

import me.nolegithere.soul.managers.ModuleManager;

public class Soul {
	
	// Instance for the Client.jar
	public static final Soul instance = new Soul();
	
	// Module Manager
	public ModuleManager moduleManager;
	
	// When The Client Start
	public void startClient() {
		// To Load Module Manager
		moduleManager = new ModuleManager();
		
		// To Load Event Manager (By DarkMagician6)
		EventManager.register(this);
	}
	
	// When The Client Stop
	public void stopClient() {
		EventManager.unregister(this);
	}
	
}
