/**
 * 
 */
package edu.fiu.sysdesign;

import java.util.List;

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
	public String receiveData(List<Command> lsOfCommands)
	{
		String data = "";
		return data;
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

}
