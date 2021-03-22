/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Olga
 *
 */
public class Engineer 
{
	String name;
	String position;
	int age;
	String department;
	
	/**
	 * This method will be used to issue a command to a rover.
	 * Will take the command and the rover name as inputs.
	 * @param command
	 * @param rover
	 * @return
	 */
	public boolean issueCommand(Command command, Rover rover)
	{
		return true;		
	}
	
	/**
	 * This method will monitor the rover and return any details
	 * @param rover
	 */
	public String monitorActivity(Rover rover)
	{
		String analysis = "";
		return analysis;
	}
}
