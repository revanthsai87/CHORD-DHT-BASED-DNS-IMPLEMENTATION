package myapp.driver;
/**
 * This is the driver program which will be called by monitor
 * program by passing different parameters.
 * 
 *
 */
 import java.util.*;

import _cache.driver.LRU;
 //import _com.driver.DriverHelper;
// import _in.driver.*;
public class Driver {
	/**
	 * Driver main program.
	 * @param args
	 */
	
	//For supporting Cname Reord
	// Write separate function for content in main
	//
	public static  _com.driver.DriverHelper h1;
	public static _in.driver.DriverHelper h2;
	public static _org.driver.DriverHelper h3;
	public static _edu.driver.DriverHelper h4;
	public static _net.driver.DriverHelper h5;
	public static _MX.driver.DriverHelper h6;
	public static _IP1.driver.DriverHelper ip1=new _IP1.driver.DriverHelper();
	public static _IP2.driver.DriverHelper ip2=new _IP2.driver.DriverHelper();
	public static _IP3.driver.DriverHelper ip3=new _IP3.driver.DriverHelper();
	public static _IP4.driver.DriverHelper ip4=new _IP4.driver.DriverHelper();
	public static _IP5.driver.DriverHelper ip5=new _IP5.driver.DriverHelper();
	//public static _cache.driver.LRU cache;
	public Driver() {
		
	}
	public static void _in_helper(String s) {
		
		String re= h2.runQueries(s);
		if(re==null)
			return;
		if(re.toLowerCase().contains(".com")) {
			_com_helper(re);
			
			}
			else if(re.toLowerCase().contains(".in"))
			{
				_in_helper(re);
		
			}
			else if(re.toLowerCase().contains(".org")) {

				_org_helper(re);
			}
			else if(re.toLowerCase().contains(".edu")) {
           _edu_helper(re);
		
				
			}
			else if(re.toLowerCase().contains(".net")) {
            _net_helper(re);
			}
			else {
			LRU.insertToCache(s, re);
			}
		

	}
public static void _com_helper(String s) {
	String re=h1.runQueries(s);
	if(re==null)
		return;
		//if(re!=null) {
			if(re.toLowerCase().contains(".com")) {
			_com_helper(re);
			
			}
			else if(re.toLowerCase().contains(".in"))
			{
				_in_helper(re);
		
			}
			else if(re.toLowerCase().contains(".org")) {

				_org_helper(re);
			}
			else if(re.toLowerCase().contains(".edu")) {
           _edu_helper(re);
		
				
			}
			else if(re.toLowerCase().contains(".net")) {
            _net_helper(re);
			}
			else {
				LRU.insertToCache(s, re);
				//LRU.printCacheEntries();
			//	System.out.println("NEED TO IMPLEMENT THIS AGAIN");
			}

		//}
	}
public static void _org_helper(String s) {
	String re=h3.runQueries(s);
	//if(re!=null) {
	if(re==null)
		return;
	if(re.toLowerCase().contains(".com")) {
		_com_helper(re);
		
		}
		else if(re.toLowerCase().contains(".in"))
		{
			_in_helper(re);
	
		}
		else if(re.toLowerCase().contains(".org")) {

			_org_helper(re);
		}
		else if(re.toLowerCase().contains(".edu")) {
       _edu_helper(re);
	
			
		}
		else if(re.toLowerCase().contains(".net")) {
        _net_helper(re);
		}
		else {
			LRU.insertToCache(s, re);
		//	System.out.println("NEED TO IMPLEMENT THIS AGAIN");
		}
	//}

}

public static void _edu_helper(String s) {
	String re=h4.runQueries(s);
	if(re==null)
		return;
	//if(re!=null) {
	if(re.toLowerCase().contains(".com")) {
		_com_helper(re);
		
		}
		else if(re.toLowerCase().contains(".in"))
		{
			_in_helper(re);
	
		}
		else if(re.toLowerCase().contains(".org")) {

			_org_helper(re);
		}
		else if(re.toLowerCase().contains(".edu")) {
       _edu_helper(re);
	
			
		}
		else if(re.toLowerCase().contains(".net")) {
        _net_helper(re);
		}
		else {
			LRU.insertToCache(s, re);
		//	System.out.println("NEED TO IMPLEMENT THIS AGAIN");
		}
	//}

}
public static void _net_helper(String s) {
	String re=h5.runQueries(s);
	if(re==null)
		return;
	//if(re!=null) {
	if(re.toLowerCase().contains(".com")) {
		_com_helper(re);
		
		}
		else if(re.toLowerCase().contains(".in"))
		{
			_in_helper(re);
	
		}
		else if(re.toLowerCase().contains(".org")) {

			_org_helper(re);
		}
		else if(re.toLowerCase().contains(".edu")) {
       _edu_helper(re);
	
			
		}
		else if(re.toLowerCase().contains(".net")) {
        _net_helper(re);
		}
		else {
			LRU.insertToCache(s, re);
		//	System.out.println("NEED TO IMPLEMENT THIS AGAIN");
		}
	//}
}
public static void  Initalize() {
	
	//IP1 INITIALIZATION
	_IP1.driver.Driver d11=new _IP1.driver.Driver();
	d11.Initialization();
	ip1.createBootStrapNode(16);
	ip1.createNNodes(8);
	ip1.insertData();
	//IP2 INITIALIZATION
	_IP2.driver.Driver d12=new _IP2.driver.Driver();
	d12.Initialization();
		ip2.createBootStrapNode(16);
		ip2.createNNodes(8);
		ip2.insertData();
		//IP3 INITIALIZATION
		_IP3.driver.Driver d13=new _IP3.driver.Driver();
		d13.Initialization();
		ip3.createBootStrapNode(16);
		ip3.createNNodes(8);
		ip3.insertData();
		//IP4 INITIALIZATION
		_IP4.driver.Driver d14=new _IP4.driver.Driver();
		d14.Initialization();
		ip4.createBootStrapNode(16);
		ip4.createNNodes(8);
		ip4.insertData();
		//IP5 INITIALIZATION
		_IP5.driver.Driver d15=new _IP5.driver.Driver();
		d15.Initialization();
		ip5.createBootStrapNode(16);
		ip5.createNNodes(8);
		ip5.insertData();
	//COM TLD Initialization
	h1 = new _com.driver.DriverHelper();
	_com.driver.Driver d=new _com.driver.Driver();
	d.Initialization();
	h1.createBootStrapNode(16);
	h1.createNNodes(8);
	h1.insertData();
	//MX record initialization
	h6=new _MX.driver.DriverHelper();
	_MX.driver.Driver d1=new _MX.driver.Driver();
	d1.Initialization();
	h6.createBootStrapNode(16);
	h6.createNNodes(8);
	h6.insertData();
	
	// IN TLD Initialization
	h2=new _in.driver.DriverHelper();
	_in.driver.Driver d2=new _in.driver.Driver();
	d2.Initialization();
	h2.createBootStrapNode(16);
	h2.createNNodes(8);
	h2.insertData();
	
	//ORG TLD Initialization
	h3=new _org.driver.DriverHelper();
	_org.driver.Driver d3=new _org.driver.Driver();
	d3.Initialization();
	h3.createBootStrapNode(16);
	h3.createNNodes(8);
	h3.insertData();
	
	//EDU TLD Initialization
	h4=new _edu.driver.DriverHelper();
	_edu.driver.Driver d4=new _edu.driver.Driver();
	d4.Initialization();
	h4.createBootStrapNode(16);
	h4.createNNodes(8);
	h4.insertData();
	
	//NET TLD INITALIZATION
	h5=new _net.driver.DriverHelper();
	_net.driver.Driver d5=new _net.driver.Driver();
	d5.Initialization();
	h5.createBootStrapNode(16);
	h5.createNNodes(8);
	h5.insertData();
	
	

}
public static void Exit() {
	ip1.shutDownAllNodes(1);
	ip2.shutDownAllNodes(1);
	ip3.shutDownAllNodes(1);
	ip4.shutDownAllNodes(1);
	ip5.shutDownAllNodes(1);
	h1.shutDownAllNodes(1);
	h2.shutDownAllNodes(1);
	h3.shutDownAllNodes(1);
	h4.shutDownAllNodes(1);
	h5.shutDownAllNodes(1);
	h6.shutDownAllNodes(1);
}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("STARTING ALL SERVERS");
		Initalize();
		boolean flag=true;
		while(flag) {
			System.out.println("Please Choose option:\n1.DNS Query\n2.Exit");
			Scanner sc = new Scanner(System.in);
			try {
			int m=sc.nextInt();
			if(m==1) {
	System.out.println("Enter DOMAIN NAME :");
		
		String s=sc.next();
		//cache=new _cache.driver.LRU();
		String ans=LRU.checkCache(s);
		if(ans!=null) {
			System.out.println("Record Fetched from Cache\n IP value is "+ ans);
		}
		else if (s.toLowerCase().indexOf("mail.")==0) {
//			 h6=new _MX.driver.DriverHelper();
//			_MX.driver.Driver d=new _MX.driver.Driver();
//			d.Initialization();
//			h6.createBootStrapNode(16);
//			h6.createNNodes(8);
//			h6.insertData();
			h6.runQueries(s);
		}
		else if(s.toLowerCase().contains(".com")) {
//			h1 = new _com.driver.DriverHelper(args);
//			_com.driver.Driver d=new _com.driver.Driver();
//			d.Initialization();
//			h1.createBootStrapNode(16);
//			h1.createNNodes(8);
//			h1.insertData();
			_com_helper(s);
		//	helper.runQueries(s);
		}
		else if(s.toLowerCase().contains(".in"))
		{
//			h2=new _in.driver.DriverHelper(args);
//			_in.driver.Driver d=new _in.driver.Driver();
//			d.Initialization();
//			h2.createBootStrapNode(16);
//			h2.createNNodes(8);
//			h2.insertData();
			_in_helper(s);
			//help.runQueries(s);
			//System.out.println("NEED TO IMPLEMENT");
	
		}
		else if(s.toLowerCase().contains(".org")) {

//			h3=new _org.driver.DriverHelper(args);
//			_org.driver.Driver d=new _org.driver.Driver();
//			d.Initialization();
//			h3.createBootStrapNode(16);
//			h3.createNNodes(8);
//			h3.insertData();
			_org_helper(s);
			//help.runQueries(s);
		}
		else if(s.toLowerCase().contains(".edu")) {

	
//			h4=new _edu.driver.DriverHelper(args);
//			_edu.driver.Driver d=new _edu.driver.Driver();
//			d.Initialization();
//			h4.createBootStrapNode(16);
//			h4.createNNodes(8);
//			h4.insertData();
			_edu_helper(s);
			//help.runQueries(s);
		}
		else if(s.toLowerCase().contains(".net")) {

//		h5=new _net.driver.DriverHelper(args);
//			_net.driver.Driver d=new _net.driver.Driver();
//			d.Initialization();
//			h5.createBootStrapNode(16);
//			h5.createNNodes(8);
//			h5.insertData();
			_net_helper(s);
			//help.runQueries(s);
		}
		
		else {
			System.out.println("NO RECORDS FOUND");
		}
			}
			else {
				flag=false;
			
				Exit();
				System.out.println("**** Terminating all servers **** \nBye!!");
			
			}
			}
			catch(Exception e) {
				System.out.println("Entered Input is wrong please enter correct option:");
				continue;
			}

		 
		}
		return;
	}

}