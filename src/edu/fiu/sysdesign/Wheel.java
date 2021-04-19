/**
 * 
 */
package edu.fiu.sysdesign;

import java.util.Random;

/**
 * @author Olga
 *
 */
public class Wheel 
{
	String material;
	int diameter;
	
	/**
	 * Will make the rover move forward by x steps 
	 * Returns true if rover moves successfully
	 * @param steps
	 * @return
	 */
	public boolean moveForward(int steps)
	{ 
		System.out.println("Moving forward " + steps + " feet...");
		delay(1200);
		System.out.println("Checking for obstacles...\n");
		delay(2000);
		return true;
	}
	
	/**
	 * Will make the rover move backward by x steps
	 * Returns true if rover moves successfully
	 * @param steps
	 * @return
	 */
	public boolean moveBackward(int steps)
	{
		delay(1500);
		System.out.println("Moving backward " + steps + " feet...");
		return true;
	}
	
	/**
	 * Will make the rover turn left by x degrees
	 * Returns true if rover turns successfully
	 * @param degree
	 * @return
	 */
	public boolean turnLeft(int degree)
	{
		delay(1500);
		System.out.println("Turning left " + degree + " degrees...");
		return true;
	}
	
	/**
	 * Will make the rover turn right by x degrees
	 * Returns true if rover turns successfully
	 * @param degree
	 * @return
	 */
	public boolean turnRight(int degree)
	{
		delay(1500);
		System.out.println("Turning right " + degree + " degrees...");
		return true;
	}
	
	public boolean avoidObstacle()
	{
		System.out.println("Analyzing new route...");
		delay(1500);
		moveBackward(3);
		if (leftOrRight())
			turnLeft(160);
		else
			turnRight(220);
		System.out.println("Checking for obstacles...\n");
		delay(2000);
		return true;
	}
	
	public boolean leftOrRight()
	{
		Random rand = new Random();
		return rand.nextBoolean();
	}
	
	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
