/**
 * 
 */
package edu.fiu.sysdesign;

import java.util.Random;

/**
 * @author Olga
 *
 */
public class Antenna implements SelfCheckCapable 
{
	String frequency;
	int size;
	int transmissionRate;
	
	/**
	 * This method will be used to transmit data.
	 * Data that needs to be transmitted will be the input.
	 * Returns true if successfully transmitted.
	 * @param data
	 * @return
	 */
	public boolean transmitData(String data)
	{
		return true;
	}
	
	/**
	 * This method can be used to receive commands and process them.
	 * @param lsOfCommands
	 * @return
	 */
	public boolean receiveData()
	{
		System.out.println("Antenna trying to receive command..");
		delay(1500);
		if (receivedOrNot())
		{
			System.out.println("Received command successfully! Please wait while its processed.\n");
			delay(1500);
			return true;
		}
		else
		{
			System.out.println("Not able to receive command due to unknown issues. Perform a system check!\n");
			delay(1500);
			return false;
		}
	}

	@Override
	public String getComponentName() 
	{
		// TODO Auto-generated method stub
		return "antenna status";
	}

	@Override
	public boolean selfCheck() 
	{
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.24);
	}

	@Override
	public boolean runSelfCheck() 
	{
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
	public boolean receivedOrNot()
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
