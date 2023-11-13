package src.platform.actions;

import java.util.Random;

import Interfaces.IAction.RELDIRECTION;
import Interfaces.IPlatformMovement;
import system.Time;
import system.object.component.monobehavior.MonoBehavior;
import system.object.component.transform.Transform;
import system.object.gameobject.GameObject;
import system.physics.FlatVector;

public class PlatformMove extends MonoBehavior implements IPlatformMovement{
	
	// Platform Movement
	private float speed = 10f;
	private float moveInput;	// -1 s'il va a gauche, 1 s'il va a droite
	private boolean isMovementXAxis = true;
	
	private float runCounter = 199;
	private float runCounterMax = 200;

	public PlatformMove(GameObject gameObject, Transform transform, float speed) {
        super(gameObject, transform);
        this.speed = speed;
	}
	
	@Override
	public void start(){
		Random rand = new Random();
		int randType = rand.nextInt(4);
		switch(randType) {
			case 0:
				this.moveInput = 1;
				this.isMovementXAxis = true;
				
			case 1:
				this.moveInput = -1;
				this.isMovementXAxis = true;
				
			case 2:
				this.moveInput = 1;
				this.isMovementXAxis = false;
				
			default:
				this.moveInput = -1;
				this.isMovementXAxis = false;
		}
		
	}
	
	public void run() {
		float movement = Time.deltaTime * this.speed * this.moveInput;
		if(this.isMovementXAxis) {
			gameObject.getRigidbody().move(new FlatVector(movement, 0));
		}
		else {
			gameObject.getRigidbody().move(new FlatVector(0, movement));
		}
		this.runCounter++;
	}
	
	public boolean isAtEndOfCourse() {
		if(this.runCounter == this.runCounterMax) {
			this.runCounter = 0;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setMoveInput(float move) {
		this.moveInput = move;
	}
	
	public void turn(RELDIRECTION d) {
		this.reverseMovement();
	}
	
	public void reverseMovement() {
		if(this.moveInput == 1) {
			this.moveInput = -1;
		}
		else {
			this.moveInput = 1;
		}
	}
}
