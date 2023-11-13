package system;

import java.awt.Cursor;
import java.awt.Graphics;
import java.util.ArrayList;

import scenes.GameScene;
import scenes.MainMenu;
import scenes.WinMenu;
import system.scene.IScene;

public class SceneManager {
	
	private int sceneIndex = 0;
	private ArrayList<IScene> scenes = new ArrayList<IScene>();
	
	public SceneManager() {
		scenes.add(new MainMenu());
		scenes.add(new GameScene());
		scenes.add(new WinMenu());
	}
	
	public void start() {
		scenes.get(sceneIndex).load();
		scenes.get(sceneIndex).start();
	}
	
	public void update() {
		scenes.get(sceneIndex).update();
	}
	
	public void render(Graphics g) {
		scenes.get(sceneIndex).render(g);
	}
	
	public void loadScene(int index) {
		//chexk index
		if(index < 0 || index >= scenes.size()) return;
		//Reset cursor 
		GameSystem.system.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		//end scene
		scenes.get(sceneIndex).end();
		sceneIndex = index;
		start();
	}
	
	public IScene getCurrentScene() {
		return scenes.get(sceneIndex);
	}
	
	public int getCurrentIndexScene() {
		return sceneIndex;
	}
}