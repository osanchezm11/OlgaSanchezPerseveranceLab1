/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Olga
 * 
 * This is the main class of the project. 
 * The rover can be controlled from this class. 
 *
 */
public class Rover 
{
	String name;
	int weight;
	int dimension;
	String purpose;

	/**
	 * This method can be used to power on the rover
	 * Will return true if rover is powered on
	 * @return
	 */
	public boolean powerOn()
	{
		return true;
	}
	
	/**
	 * This method can be used to power off the rover
	 * Will return true if the rover is powered off
	 * @return
	 */
	public boolean powerOff()
	{
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Camera imagingCamera = new Camera();
		imagingCamera.runSelfCheck();
		
		Antenna uhf = new Antenna();
		uhf.runSelfCheck();
	}
}
