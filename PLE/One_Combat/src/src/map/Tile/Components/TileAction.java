package src.map.Tile.Components;

import Interfaces.IAction;
import system.Time;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;
import system.physics.FlatVector;

public class TileAction extends MonoBehavior implements IAction {

	private TileHealth tileHealth;

	public TileAction(GameObject g, Transform t) {
		super(g, t);
		// TODO Auto-generated constructor stub
	}

	public void start() {
		tileHealth = gameObject.getComponent(TileHealth.class);
	}

	@Override
	public void Move(RELDIRECTION d) {
		FlatVector dir = FlatVector.times(RELDIRECTION.toVector(d), Time.deltaTime);
		gameObject.getRigidbody().move(dir);
	}

	@Override
	public void Move(ABSDIRECTION d) {
		FlatVector dir = FlatVector.times(ABSDIRECTION.toVector(d), Time.deltaTime);
		gameObject.getRigidbody().move(dir);
	}

	@Override
	public void Move() {
		FlatVector dir = new FlatVector(1f * Time.deltaTime, 0f);
		gameObject.getRigidbody().move(dir);
	}

	@Override
	public void Jump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Dash() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Dash(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Dash(ABSDIRECTION d) {
		// TODO Auto-generated method stub

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
	public void Attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Attack(RELDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Attack(ABSDIRECTION d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void BigAttack() {
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
		tileHealth.egg();
	}

	@Override
	public void Egg(RELDIRECTION d) {

		tileHealth.egg();
	}

	@Override
	public void Egg(ABSDIRECTION d) {
		tileHealth.egg();
	}

	@Override
	public void Get() {
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
	public void Pick() {
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
		// TODO Auto-generated method stub

	}

	@Override
	public void Throw() {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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

}
