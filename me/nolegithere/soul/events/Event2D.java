package me.nolegithere.soul.events;

import com.darkmagician6.eventapi.events.Event;

import net.minecraft.client.gui.ScaledResolution;

public class Event2D implements Event {
	
	// ScaledResolution for later
	private ScaledResolution scaledResolution;
	
	public Event2D(ScaledResolution scaledResolution) {
		this.scaledResolution = scaledResolution;
	}
	
	// optional because you could change private in private ScaledResolution scaledResolution to public
	
	public ScaledResolution getScaledResolution() {
		return scaledResolution;
	}
	
	public void setScaledResolution(ScaledResolution scaledResolution) {
		this.scaledResolution = scaledResolution;
	}
	
}
