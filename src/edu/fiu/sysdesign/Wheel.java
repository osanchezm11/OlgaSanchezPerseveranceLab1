/**
 * 
 */
package edu.fiu.sysdesign;

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
		return true;
	}
}
