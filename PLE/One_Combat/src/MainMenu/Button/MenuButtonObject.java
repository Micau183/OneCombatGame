package MainMenu.Button;

import system.enumeration.SortingLayer;
import system.object.component.renderer.ImageUI;
import system.object.gameobject.GameObject;

public class MenuButtonObject extends GameObject {

	public float width;
	public float height;
	public float scale = 1.5f;

	public MenuButtonObject() {
		super();
		sortingLayer = SortingLayer.UI;
		transform.setScale(scale);
		renderer = new ImageUI(this, transform);
		components.add(new MenuButton(this, transform));
		((ImageUI)renderer).setAnchorX(0.5f);
		((ImageUI)renderer).setAnchorY(0.8f);
	}
}
