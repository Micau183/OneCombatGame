package src.Ronces.actions;

import java.util.ArrayList;

import Interfaces.IDamagable;
import system.Constante;
import system.Physics;
import system.Time;
import system.enumeration.Layer;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.rigidbody.Rigidbody;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;
import system.physics.FlatVector;

import src.bots.actions.*;

public class RoncesAttack extends MonoBehavior implements IDamagable {

	private float attackingTimer = 0;
	private float timer = 2.5f;
	private boolean isAttacking = false;
	private float DAMAGE = 10f;

	BotLocomotion BotLocomotion;

	public RoncesAttack(GameObject g, Transform t) {
		super(g, t);
	}

	@Override
	public void start() {
		BotLocomotion = gameObject.getComponent(BotLocomotion.class);
	}

	@Override
	public void update() {

		if (isAttacking) {
			if (attackingTimer > 0) {
				BotLocomotion.attack();
				attackingTimer -= Time.deltaTime;
			} else if (attackingTimer <= 0) {
				isAttacking = false;
				BotLocomotion.idle();
			}
		}

		// hit ?
		
		// en dehors de la map en x ?
		if (this.transform.getPositionX() > Constante.MAP_LENGTH
				|| this.transform.getPositionX() < -Constante.MAP_LENGTH) {
			death();
		}
		// en dehors de la map en y ?
		if (this.transform.getPositionY() > Constante.MAP_HEIGHT
				|| this.transform.getPositionY() < -Constante.MAP_HEIGHT) {
			death();
		}

	}
	
	public void hit() {
		
		if(isAttacking) return;
		
		FlatVector position = transform.position;
		ArrayList<Rigidbody> rbs = Physics.OverlapPolygon(position, 0.25f, 0.25f, Layer.Character);
		if (rbs.size() > 0) {
			for (Rigidbody rb : rbs) {
				IDamagable damagable = rb.gameObject.getComponent(IDamagable.class);
				if (damagable != null) {
					if (!isAttacking && damagable.canTakeDamage()) {
						isAttacking();
						damagable.setDamage(DAMAGE);
					}

				}
			}
		}
	}

	public void isAttacking() {
		isAttacking = true;
		attackingTimer = this.timer;
	}
	
	public boolean canAttack() {
		return !isAttacking;
	}

	@Override
	public boolean canTakeDamage() {
		return false;
	}

	@Override
	public void setDamage(float amount) {
		// TODO Auto-generated method stub
	}

	@Override
	public void death() {
		this.destroy();

	}

	@Override
	public void addHealth(float amount) {
		return;

	}
}