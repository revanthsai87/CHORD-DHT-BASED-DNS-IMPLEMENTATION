package _in.driver;
/**
 * This is the driver program which will be called by monitor
 * program by passing different parameters.
 * 
 *
 */
 import java.util.*;
 
public class Driver {
	/**
	 * Driver main program.
	 * @param args
	 */

public Driver(){
	
}
	public void  Initialization() {
		de.uniba.wiai.lspi.chord.service.PropertiesLoader.loadPropertyFile();
		int successor_list_size =1;
		double stabalization_delay_float = 2;
		double check_pre_delay_float = 1; 
		double fix_finger_delay_float = 2; 
		System.setProperty("de.uniba.wiai.lspi.chord.service.impl.ChordImpl.StabilizeTask.interval",
				"" + (int)(stabalization_delay_float*10));
		System.setProperty("de.uniba.wiai.lspi.chord.service.impl.ChordImpl.FixFingerTask.interval",
				"" + (int)(fix_finger_delay_float*10));
		System.setProperty("de.uniba.wiai.lspi.chord.service.impl.ChordImpl.CheckPredecessorTask.interval",
				"" + (int)(check_pre_delay_float*10));
		System.setProperty("de.uniba.wiai.lspi.chord.service.impl.ChordImpl.successors", "" + successor_list_size);
		// Create BootStrap Node
	}
public void _IP1_Helper(_IP1.driver.DriverHelper d,String s) {
		d.runQueries(s);
	}
public void _IP2_Helper(_IP2.driver.DriverHelper d,String s) {
		d.runQueries(s);
	}
public void _IP3_Helper(_IP3.driver.DriverHelper d,String s) {
	d.runQueries(s);
}
public void _IP4_Helper(_IP4.driver.DriverHelper d,String s) {
	d.runQueries(s);
}
public void _IP5_Helper(_IP5.driver.DriverHelper d,String s) {
	d.runQueries(s);
}
	public void _LEVEL3_Helper(int n,String s) {
		if(n==1) {
			_IP1.driver.DriverHelper helper = new _IP1.driver.DriverHelper();
			//_IP1.driver.Driver d=new _IP1.driver.Driver();
			//d.Initialization();
			helper.createBootStrapNode(16);
			helper.createNNodes(8);
			helper.insertData();
			_IP1_Helper(helper, s);
		//	helper.runQueries(s);
		}
		else if(n==2)
		{
			_IP2.driver.DriverHelper help=new _IP2.driver.DriverHelper();
		//	_in.driver.Driver d=new _in.driver.Driver();
			//d.Initialization();
			help.createBootStrapNode(16);
			help.createNNodes(8);
			help.insertData();
			_IP2_Helper(help,s);
			//help.runQueries(s);
			//System.out.println("NEED TO IMPLEMENT");
	
	}
		else if(n==3) {
		_IP3.driver.DriverHelper help=new _IP3.driver.DriverHelper();
		
		help.createBootStrapNode(16);
		help.createNNodes(8);
		help.insertData();
		_IP3_Helper(help,s);
		
		}
		else if(n==4) {
		_IP4.driver.DriverHelper help=new _IP4.driver.DriverHelper();
		
		help.createBootStrapNode(16);
		help.createNNodes(8);
		help.insertData();
		_IP4_Helper(help,s);
		
		}
		else if(n==5) {
		_IP5.driver.DriverHelper help=new _IP5.driver.DriverHelper();
		
		help.createBootStrapNode(16);
		help.createNNodes(8);
		help.insertData();
		_IP5_Helper(help,s);
		
		}

		else {
			System.out.println("NEED TO IMPLEMENT THIS AGAIN");
		}

	}
	public void LEVEL3_HELPER() {
		
	}												   
	
	public static void main(String[] args) {
		}
			
			
			
		
		
	
}