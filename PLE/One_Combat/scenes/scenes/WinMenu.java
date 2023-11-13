package scenes;

import MainMenu.WinBackground;
import MainMenu.WinPlayerObject;
import MainMenu.Button.MenuButtonObject;
import system.scene.MainScene;

public class WinMenu extends MainScene {
	//Add GameObject in Constructeur
	 @Override
	    public void load() {
		 gameObjects.add(new WinBackground());
		 gameObjects.add(new MenuButtonObject());
		 gameObjects.add(new WinPlayerObject());
	 }
}
