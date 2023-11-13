package src.platform;

import Interfaces.IAction.ABSDIRECTION;
import Interfaces.IAction.RELDIRECTION;
import Interfaces.ICondition;
import src.platform.actions.PlatformHealth;
import src.platform.actions.PlatformMove;
import src.platform.actions.PlatformSplit;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;

public class PlatformConditions extends MonoBehavior implements ICondition {
	
	private PlatformHealth platformHealth;
	private PlatformMove platformMovement;

	public PlatformConditions(GameObject g, Transform t) {
		super(g, t);
	}
	public void start() {
		platformMovement = gameObject.getComponent(PlatformMove.class);
		platformHealth = gameObject.getComponent(PlatformHealth.class);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isNotEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gotPower() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAdversaire() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean True() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean hasTeammate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasMissile() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Key(int c) {
		switch (c) {
		case 49: //Key(1)
			boolean res = platformHealth.health <= 0;
			return res;
			
		case 50: //Key(2)
			boolean result = platformMovement.isAtEndOfCourse();
			return result;
		
		default: 
			return false;
		
		}
	}

	@Override
	public boolean MyDir(RELDIRECTION d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean MyDir(ABSDIRECTION d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Cell(ABSDIRECTION d, TYPE t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gotStuff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Closest(TYPE t, ABSDIRECTION d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Closest(TYPE t, RELDIRECTION d) {
		// TODO Auto-generated method stub
		return false;
	}
}
