package src.items.components;

import Interfaces.IAction.ABSDIRECTION;
import Interfaces.IAction.RELDIRECTION;
import Interfaces.ICondition;
import system.InputManager;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;

public class ItemCondition extends MonoBehavior implements ICondition {

	private ItemBehavior itemBehavior;
	
	public ItemCondition(GameObject g, Transform t) {
		super(g, t);
	}
	
	public void start() {
		itemBehavior = gameObject.getComponent(ItemBehavior.class);
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean isNotEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gotPower() {
		return !itemBehavior.isDisappearanceCooldown();
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
		case 49: // Key(1) canCheksPlayers
			return !itemBehavior.isDisappearanceCooldown();
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
