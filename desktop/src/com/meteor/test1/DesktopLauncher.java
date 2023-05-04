package com.meteor.test1;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.meteor.test1.Test;


public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Drop");
		config.setWindowedMode(650, 960);
		config.useVsync(true);
		config.setForegroundFPS(240);
		new Lwjgl3Application(new Test(), config);
	}
}
