package MainMenu.Button;

import system.GameSystem;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;

public class MenuButton extends Button{

	public MenuButton(GameObject g, Transform t) {
		super(g, t);
		spritePath = "ressources/UI/Button/MenuButton.png";
		spriteHoverPath = "ressources/UI/Button/MenuButtonHover.png";
		loadSprites();
	}

	@Override
	public void onClick() {
		GameSystem.system.sceneManager.loadScene(0);
	}
}
