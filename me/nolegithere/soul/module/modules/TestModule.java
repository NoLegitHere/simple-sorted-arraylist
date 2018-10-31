package me.nolegithere.soul.module.modules;

import org.lwjgl.input.Keyboard;

import me.nolegithere.soul.module.Module;

public class TestModule extends Module {

	public TestModule() {
		super("TestModule", Keyboard.KEY_R);
	}
	
	@Override
	public void onEnable() {
		super.onEnable();

		System.out.println("This is a test module!");
		return;
	}

}
