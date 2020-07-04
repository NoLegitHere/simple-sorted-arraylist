package me.nolegithere.soul.module.modules;

import java.awt.Color;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.lwjgl.input.Keyboard;

import com.darkmagician6.eventapi.EventTarget;

import me.nolegithere.soul.Soul;
import me.nolegithere.soul.events.Event2D;
import me.nolegithere.soul.module.Module;

public class ArrayList extends Module {

	public ArrayList() {
		super("ArrayList", Keyboard.KEY_K);
	}
	
	@EventTarget
	public void onRender(Event2D e) {
		// if you dont want this show on debug screen
		if(mc.gameSettings.showDebugInfo)
			return;
		
		int y = 4;
        List<Module> modules = new CopyOnWriteArrayList<>();
        for (Module mod : Soul.instance.moduleManager.modules) {
        	if(mod.isToggled()) {
        		modules.add(mod);
        	}
        }
        modules.sort(Comparator.comparingDouble(m -> mc.fontRendererObj.getStringWidth(m.getName())));
        for(Module m : modules) {
        	String suffix = m.getName();
        	float x = e.getScaledResolution().getScaledWidth() - mc.fontRendererObj.getStringWidth(m.getName()) - 2;
        	mc.fontRendererObj.func_175063_a(suffix, x, y, getRainbow(5000, -15 * y));
        	y += 9.5;
        }
	}
	
	private int getRainbow(int speed, int offset) {
        float hue = (System.currentTimeMillis() + offset) % speed;
        hue /= speed;
        return Color.getHSBColor(hue, 1f, 1f).getRGB();
    }

}
