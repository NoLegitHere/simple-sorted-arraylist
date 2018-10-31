package me.nolegithere.soul.events;

import com.darkmagician6.eventapi.events.Event;

// Simple Event for keybinding
public class EventKey implements Event {
	
	private int key;
	
	public EventKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
}
