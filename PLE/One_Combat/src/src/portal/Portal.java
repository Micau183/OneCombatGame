package src.portal;

import java.io.IOException;

import Character.Components.CharacterLocomotion;
import src.manager.GameManager;
import src.portal.Components.PortalAction;
import src.portal.Components.PortalCondition;
import src.portal.Components.PortalEntity;
import src.portal.Components.PortalTeleport;
import system.object.component.animation.Animator;
import system.object.component.renderer.SpriteRenderer;
import system.object.gameobject.GameObject;

public class Portal extends GameObject{
	
	private float scale = 2f;
	private float width = 0.44f;
	private float height = 0.88f;
	
	public Portal twin = null;
	public int direction = 0;
	
	public Portal(float x, float y, int direction) throws IOException {
		super();

		this.width*=scale;
		this.height*=scale;
		this.transform.setScale(scale);
		
		this.transform.setPositionX(x);
		this.transform.setPositionY(y);
		
		this.direction = direction;
		
		this.renderer = new SpriteRenderer(this, this.transform);
		this.animator = new Animator(this, this.transform, "Portal", (SpriteRenderer) this.renderer);
		//this.renderer = new RectRenderer(this, this.transform, Color.BLUE, width, height);
		
		
		this.components.add(new CharacterLocomotion(this, this.transform));
		this.components.add(new PortalTeleport(this, this.transform, this, direction));
		this.components.add(new PortalEntity(this, this.transform, GameManager.instance.gameSettings.portalAutomate));
		this.components.add(new PortalAction(this, this.transform));
		this.components.add(new PortalCondition(this, this.transform));
	}

}
