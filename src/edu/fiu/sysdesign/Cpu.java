/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Olga
 *
 */
public class Cpu 
{
	String memory;
	String clockSpeed;
	
	/**
	 * This method will reset the Rover
	 */
	public void resetSystem()
	{
		
	}
	
	/**
	 * This method can clear the memory of the Rover
	 */
	public void clearMemory()
	{
		
	}
	
	public boolean activateNavigationSystem()
	{
		System.out.println("Activating navigation systems...\n");
		return true;
	}
	
	/**
	 * This method will take a Command as input
	 * and process it.
	 * Will return true is successfully processed, 
	 * else would return false.
	 * @param command
	 * @return
	 */
	public boolean processCommand(Command command)
	{
		System.out.println("Processing Command...\n");
		return true;
	}
}
