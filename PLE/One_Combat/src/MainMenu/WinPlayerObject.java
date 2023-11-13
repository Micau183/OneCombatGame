package MainMenu;

import java.awt.image.BufferedImage;
import java.io.IOException;

import src.manager.GameManager;
import system.AnimationManager;
import system.enumeration.SortingLayer;
import system.object.component.renderer.ImageUI;
import system.object.gameobject.GameObject;

public class WinPlayerObject extends GameObject {
	

	public String selectPath = "ressources/UI/Select/CurrentSelect/";
	
	private float scale;
	
	public WinPlayerObject() {
		super();
		this.sortingLayer = SortingLayer.UI;
		renderer = new ImageUI(this, transform);
		String currentSelect = GameManager.PlayerWinName;
		
		try {
			BufferedImage sprite = AnimationManager.loadSprites(selectPath + currentSelect + ".png", 1, 1)[0];
			((ImageUI) renderer).setSprite(sprite);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((ImageUI) renderer).setAnchorX(0.5f);
		((ImageUI) renderer).setAnchorY(0.5f);
	}
}
