package src.platform;

import Interfaces.IAction;
import Interfaces.IAction.RELDIRECTION;
import src.platform.actions.PlatformMove;
import src.platform.actions.PlatformSplit;
import system.Time;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;
import system.physics.FlatVector;

public class PlatformActions extends MonoBehavior implements IAction {

	private PlatformMove platformMove;
	private PlatformSplit platformSplit;

	public PlatformActions(GameObject g, Transform t) {
		super(g, t);
	}
	
	public void start() {
		platformMove = gameObject.getComponent(PlatformMove.class);
		platformSplit = gameObject.getComponent(PlatformSplit.class);
	}

	@Override
	public void Move(RELDIRECTION d) {
		
	}

	@Override
	public void Move(ABSDIRECTION d) {
		
	}

	@Override
	public void Jump() {
		
	}

	@Override
	public void Dash(RELDIRECTION d) {

	}

	@Override
	public void Dash(ABSDIRECTION d) {

	}

	@Override
	public void Hit() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Hit(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Hit(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Attack(RELDIRECTION d) {

	}

	@Override
	public void Attack(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void BigAttack(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void BigAttack(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}
	@Override
	public void Egg() {
		platformSplit.splitPlatform();
	}

	@Override
	public void Egg(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Egg(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Get(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Get(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Explode() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pick(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pick(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pop() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Pop(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pop(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Power() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Protect() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Store() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Turn(ABSDIRECTION d) {
		// TODO Auto-generated method stub
	}

	@Override
	public void Turn(RELDIRECTION d) {
		platformMove.turn(d);
	}

	@Override
	public void Throw(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Throw(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Wait() {
		
	}

	@Override
	public void Wizz() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Wizz(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Wizz(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Move() {
		platformMove.run();
	}

	@Override
	public void Get() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Throw() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Dash() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void BigAttack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pick() {
		// TODO Auto-generated method stub

	}

}
