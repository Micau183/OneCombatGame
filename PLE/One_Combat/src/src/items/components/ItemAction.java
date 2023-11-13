package src.items.components;

import Interfaces.IAction;
import Interfaces.IAction.ABSDIRECTION;
import Interfaces.IAction.RELDIRECTION;
import system.Time;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;
import system.physics.FlatVector;

public class ItemAction extends MonoBehavior implements IAction {

	private ItemBehavior itemBehavior;
	
	public ItemAction(GameObject g, Transform t) {
		super(g, t);
	}
	
	public void start() {
		itemBehavior = gameObject.getComponent(ItemBehavior.class);
	}

	@Override
	public void Move(RELDIRECTION d) {
		FlatVector dir = FlatVector.times(RELDIRECTION.toVector(d), Time.deltaTime);
		transform.setPosition(FlatVector.plus(transform.position, dir));
	}

	@Override
	public void Move(ABSDIRECTION d) {
		FlatVector dir = FlatVector.times(ABSDIRECTION.toVector(d), Time.deltaTime);
		transform.setPosition(FlatVector.plus(transform.position, dir));
	}

	@Override
	public void Move() {
		transform.position.x += 1f * Time.deltaTime;
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
		// TODO Auto-generated method stub
		
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
		itemBehavior.checkPlayers();	
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
		itemBehavior.death();
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
