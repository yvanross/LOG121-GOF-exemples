package Factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

import Factory.Enemy.BigUFOEnemyShip;
import Factory.Enemy.EnemyShip;
import Factory.Enemy.EnemyShipFactory;
import Factory.Enemy.RocketEnemyShip;
import Factory.Enemy.UFOEnemyShip;
import Utils.OutStream;

public class EnemyTest extends OutStream {
	EnemyShipFactory shipFactory = null;
	EnemyShip theEnemy = null;

	@Before
	public void init() {
		shipFactory = new EnemyShipFactory();
	}

	@Test
	public void UTest() {
		theEnemy = shipFactory.makeEnemyShip("U");
		assertTrue(theEnemy instanceof EnemyShip);
		assertTrue(theEnemy instanceof UFOEnemyShip);
		doStuffEnemy(theEnemy);
		assertEquals("UFO Enemy Ship is on the screen" + System.lineSeparator() +
		"UFO Enemy Ship is following the hero" + System.lineSeparator() +
		"UFO Enemy Ship attacks and does 20.0 damage to hero"+ System.lineSeparator() ,getOutput());
	}
	@Test
	public void RTest() {
		theEnemy = shipFactory.makeEnemyShip("R");
		assertTrue(theEnemy instanceof EnemyShip);
		assertTrue(theEnemy instanceof RocketEnemyShip);
		doStuffEnemy(theEnemy);
		assertEquals("Rocket Enemy Ship is on the screen" + System.lineSeparator() +
		"Rocket Enemy Ship is following the hero" + System.lineSeparator() +
		"Rocket Enemy Ship attacks and does 10.0 damage to hero"+ System.lineSeparator() ,getOutput());
	}
	@Test
	public void BTest() {
		theEnemy = shipFactory.makeEnemyShip("B");
		assertTrue(theEnemy instanceof EnemyShip);
		assertTrue(theEnemy instanceof BigUFOEnemyShip);
		doStuffEnemy(theEnemy);
		assertEquals("Big UFO Enemy Ship is on the screen"+System.lineSeparator() +
		"Big UFO Enemy Ship is following the hero" + System.lineSeparator() +
		"Big UFO Enemy Ship attacks and does 40.0 damage to hero"+ System.lineSeparator() ,getOutput());
		
	}

	// Executes methods of the super class

	public static void doStuffEnemy(EnemyShip anEnemyShip) {

		anEnemyShip.displayEnemyShip();

		anEnemyShip.followHeroShip();

		anEnemyShip.enemyShipShoots();

	}

}

/*
 * EnemyShip theEnemy = null;
 * 
 * // Old way of creating objects // When we use new we are not being dynamic
 * 
 * EnemyShip ufoShip = new UFOEnemyShip();
 * 
 * doStuffEnemy(ufoShip);
 * 
 * System.out.print("\n");
 * 
 * // -----------------------------------------
 * 
 * // This allows me to make the program more dynamic // It doesn't close the
 * code from being modified // and that is bad!
 * 
 * // Defines an input stream to watch: keyboard Scanner userInput = new
 * Scanner(System.in);
 * 
 * String enemyShipOption = "";
 * 
 * System.out.print("What type of ship? (U or R)");
 * 
 * if (userInput.hasNextLine()){
 * 
 * enemyShipOption = userInput.nextLine();
 * 
 * }
 * 
 * if (enemyShipOption == "U"){
 * 
 * theEnemy = new UFOEnemyShip();
 * 
 * 
 * } else
 * 
 * if (enemyShipOption == "R"){
 * 
 * theEnemy = new RocketEnemyShip();
 * 
 * } else {
 * 
 * theEnemy = new BigUFOEnemyShip();
 * 
 * }
 * 
 * doStuffEnemy(theEnemy);
 * 
 * // --------------------------------------------
 */
