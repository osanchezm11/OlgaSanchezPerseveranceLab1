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
	Command command;
	
	/**
	 * This method will be used to issue a command to a rover.
	 * Will take the command and the rover name as inputs.
	 * @param command
	 * @param rover
	 * @return
	 */
	
	public Engineer(String name, Command command)
	{
		this.name = name;
		this.command = command;
	}
	
	public boolean issueCommand()
	{
		command.description = "Move Perseverance to Location X";
		System.out.println("Engineer " + name + " has issued a Command...");
		System.out.println("Command Description: " + command.description);
		delay(1500);
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
