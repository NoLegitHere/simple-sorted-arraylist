package me.nolegithere.soul.managers;

import java.util.ArrayList;
import java.util.List;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;

import me.nolegithere.soul.events.EventKey;
import me.nolegithere.soul.module.Module;
import me.nolegithere.soul.module.modules.*;

public class ModuleManager {
	
	public List<Module> modules = new ArrayList<Module>();
	
	public ModuleManager() {
		modules = new ArrayList<Module>();
		EventManager.register(this);
		
		modules.add(new TestModule());
		modules.add(new me.nolegithere.soul.module.modules.ArrayList());
	}
	
	public Module getModule(Class<? extends Module> clazz) {
		for(Module m : modules) {
			if(m.getClass() == clazz) {
				return m;
			}
		}
		return null;
	}
	
	@EventTarget
	public void onKey(EventKey e) {
		for(Module m : modules) {
			if(m.getKey() == e.getKey()) {
				m.toggle();
			}
		}
	}
	
}
