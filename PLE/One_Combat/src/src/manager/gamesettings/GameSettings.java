package src.manager.gamesettings;

import java.util.ArrayList;

import system.physics.FlatVector;

public class GameSettings {

	public float time;

	public FlatVector[] spawnPoint = { new FlatVector(0, 0), new FlatVector(5, 0), new FlatVector(-5, 0),
			new FlatVector(10, 0), new FlatVector(15, 0), new FlatVector(20, 0), new FlatVector(25, 0),
			new FlatVector(-10, 0), new FlatVector(-15, 0), new FlatVector(-20, 0), new FlatVector(10, -20),
			new FlatVector(15, 0), new FlatVector(25, 0), new FlatVector(5, -20) };
	/*
	 * 
	 * Player information
	 */
	public float numberPlayer = 2;
	public String[] playerAutomates = { "Player1", "Player2" };

	/*
	 * 
	 * Bot information
	 */

	public float numberCharacterAi = 2;

	public String[] characterAiAutomates = { "StrongBot" };

	// Weak bot informations
	public int maxBotMedium = 2;
	public int maxBotWeak = 2;
	public int maxBotChien = 2;
	
	public String mediumBotAutomate = "Mediumbot";
	public String weakBotAutomate = "Weakbot";
	public String chienAutomate = "Chien";
	public String platformAutomate = "Platform";

	// Platform
	public int initialPlatformNumber = 2;
	public int maximalPlatformNumber = 10;

	// Portal
	public String portalAutomate = "Portal";

	// Ronces
	public String roncesAutomate = "Ronces";
	
	//Tile
	public String tileAutomate = "Tile";
	
	//Items
	public String itemAutomate = "Item";

}
