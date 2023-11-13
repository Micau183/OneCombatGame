package MainMenu;

import system.enumeration.SortingLayer;
import system.object.component.renderer.ImageUI;
import system.object.gameobject.GameObject;

public class WinBackground extends GameObject{
	
	public WinBackground() {
		super();
		sortingLayer = SortingLayer.BackgroundUI;
		transform.setScale(2);
		renderer = new ImageUI(this, transform, "ressources/Menu/Background_win.png");
		((ImageUI) renderer).setAnchorX(0.5f);
		((ImageUI) renderer).setAnchorY(0.7f);
	}
}
