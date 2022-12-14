package com.mygdx.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import java.util.Scanner;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import com.mygdx.game.MyGdxGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument

/**This is the runner class
 * 
 */
public class DesktopLauncher {



	public static void main (String[] arg) {

		System.out.println("Player One's Controls: W, S\nPlayer Two's Controls: I, K");
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(144);
		config.setTitle("My GDX Game");
		new Lwjgl3Application(new MyGdxGame(), config);



	}





}
