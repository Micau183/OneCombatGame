package src.portal.Components;

import Interfaces.IAction.ABSDIRECTION;
import Interfaces.IAction.RELDIRECTION;
import Interfaces.ICondition;
import system.InputManager;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;

public class PortalCondition extends MonoBehavior implements ICondition{

	private PortalTeleport portalTeleport;
	
	public PortalCondition(GameObject g, Transform t) {
		super(g, t);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		portalTeleport = gameObject.getComponent(PortalTeleport.class);
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isNotEmpty() {
		return false;
	}

	@Override
	public boolean gotPower() {
		return false;
	}

	@Override
	public boolean hasAdversaire() {
		return false;
	}

	@Override
	public boolean True() {
		return true;
	}

	@Override
	public boolean hasTeammate() {
		return false;
	}

	@Override
	public boolean hasMissile() {
		return false;
	}

	@Override
	public boolean Key(int c) {
		switch (c) {
		case 49: // Key(1) canTelleport
			return portalTeleport.canTeleport();
		default:
			return InputManager.IsPressed(c);
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
