package me.nolegithere.soul.module;

import com.darkmagician6.eventapi.EventManager;

import net.minecraft.client.Minecraft;

// Module class
public class Module {
	
	// Module class method
	
	private String name;
	private int key;
	private boolean toggled;

	// Minecraft instance
	public static Minecraft mc = Minecraft.getMinecraft();
	
	public Module(String name, int key) {
		this.name = name;
		this.key = key;
		this.toggled = false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public void onEnable() {
		EventManager.register(this);
	}
	
	public void onDisable() {
		EventManager.unregister(this);
	}
	
	public boolean isToggled() {
		return toggled;
	}
	
	public void setToggled(boolean toggled) {
		this.toggled = toggled;
	}
	
	public void toggle() {
		if(toggled) {
			toggled = false;
			onDisable();
		} else {
			toggled = true;
			onEnable();
		}
	}
	
}
