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
	public static  _com.driver.DriverHelper h1=new _com.driver.DriverHelper();
	public static _in.driver.DriverHelper h2=new _in.driver.DriverHelper();
	public static _org.driver.DriverHelper h3=new _org.driver.DriverHelper();
	public static _edu.driver.DriverHelper h4=new _edu.driver.DriverHelper();
	public static _net.driver.DriverHelper h5=new _net.driver.DriverHelper();
	public static _MX.driver.DriverHelper h6=new _MX.driver.DriverHelper();
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
		
			LRU.insertToCache(s, re);
		

	}
public static void _com_helper(String s) {
	String re=h1.runQueries(s);
	if(re==null)
		return;
	
				LRU.insertToCache(s, re);

	}
public static void _org_helper(String s) {
	String re=h3.runQueries(s);
	if(re==null)
		return;
	
			LRU.insertToCache(s, re);


}

public static void _edu_helper(String s) {
	String re=h4.runQueries(s);
	if(re==null)
		return;
	
			LRU.insertToCache(s, re);
	

}
public static void _net_helper(String s) {
	String re=h5.runQueries(s);
	if(re==null)
		return;
	
			LRU.insertToCache(s, re);
	
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
	_com.driver.Driver d=new _com.driver.Driver();
	d.Initialization();
	h1.createBootStrapNode(16);
	h1.createNNodes(8);
	h1.insertData();
	//MX record initialization
	_MX.driver.Driver d1=new _MX.driver.Driver();
	d1.Initialization();
	h6.createBootStrapNode(16);
	h6.createNNodes(8);
	h6.insertData();
	
	// IN TLD Initialization
	_in.driver.Driver d2=new _in.driver.Driver();
	d2.Initialization();
	h2.createBootStrapNode(16);
	h2.createNNodes(8);
	h2.insertData();
	
	//ORG TLD Initialization
	_org.driver.Driver d3=new _org.driver.Driver();
	d3.Initialization();
	h3.createBootStrapNode(16);
	h3.createNNodes(8);
	h3.insertData();
	
	//EDU TLD Initialization
	_edu.driver.Driver d4=new _edu.driver.Driver();
	d4.Initialization();
	h4.createBootStrapNode(16);
	h4.createNNodes(8);
	h4.insertData();
	
	//NET TLD INITALIZATION
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
			System.out.println("Please Choose option:\n1.DNS Query\n2.Admin\n3.Exit");
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
			else if(m==2){
				System.out.println("Choose what you want to perform\n1.Add Node\n2.Delete Node");
				int k=sc.nextInt();
				if(k==1){
					System.out.println("Choose level where you want to perform operation\n1.At TLD\n2.At Level 3");
					int l=sc.nextInt();
					if(l==1){
						System.out.println("Choose level where you want to perform operation\n1- .com server\n2- .in server" +
								"\n3- .org server\n4- .edu server\n5- .net server\n6- MX server");
						int p=sc.nextInt();
						if(p==1){
							h1.createAdditionalNode();
						}
						else if(p==2){
							h2.createAdditionalNode();
						}
						else if(p==3){
							h3.createAdditionalNode();
						}
						else if(p==4){
							h4.createAdditionalNode();
						}
						else if(p==5){
							h5.createAdditionalNode();
						}
						else {
							h6.createAdditionalNode();
						}
					}
					else{
						System.out.println("Choose level where you want to perform operation\n1- IP server1\n2- IP server2" +
								"\n3- IP server3\n4- IP server4\n5- IP server5");
						int p=sc.nextInt();
						if(p==1){
							ip1.createAdditionalNode();
						}
						else if(p==2){
							ip2.createAdditionalNode();
						}
						else if(p==3){
							ip3.createAdditionalNode();
						}
						else if(p==4){
							ip4.createAdditionalNode();
						}
						else if(p==5){
							ip5.createAdditionalNode();
						}
						else {

						}
					}
				}
				else{
					System.out.println("Choose level where you want to perform operation\n1.At TLD\n2.At Level 3");
					int l=sc.nextInt();
					if(l==1){
						System.out.println("Choose level where you want to perform operation\n1- .com server\n2- .in server" +
								"\n3- .org server\n4- .edu server\n5- .net server\n6- MX server");
						int p=sc.nextInt();
						if(p==1){
							h1.delete_activenode();
						}
						else if(p==2){
							h2.delete_activenode();
						}
						else if(p==3){
							h3.delete_activenode();
						}
						else if(p==4){
							h4.delete_activenode();
						}
						else if(p==5){
							h5.delete_activenode();
						}
						else {
							h6.delete_activenode();
						}
					}
					else{
						System.out.println("Choose level where you want to perform operation\n1- IP server1\n2- IP server2" +
								"\n3- IP server3\n4- IP server4\n5- IP server5");
						int p=sc.nextInt();
						if(p==1){
							ip1.delete_activenode();
						}
						else if(p==2){
							ip2.delete_activenode();
						}
						else if(p==3){
							ip3.delete_activenode();
						}
						else if(p==4){
							ip4.delete_activenode();
						}
						else if(p==5){
							ip5.delete_activenode();
						}
						else {

						}
					}
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