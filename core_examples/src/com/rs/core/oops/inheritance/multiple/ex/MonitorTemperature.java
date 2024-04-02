package com.rs.core.oops.inheritance.multiple.ex;

	
	interface Location1{
		void monitorTemperature1();
	}
	interface Location2{
			void monitorTemperature2();
		
	}
 class TemperatureMonitor implements Location1,Location2 {
	 public void monitorTemperature1() {
		 System.out.println("Monitoring temperature at Location 1");
	 }
	 public void monitorTemperature2() {
		 System.out.println("Monitoring temperature at Location 2");
	 } 
 }
 
 2'public class Main{
		
	public static void main(String[] args) {
	 
	TemperatureMonitor monitor = new MonitorTemperatureMonitor();
	
		
		

	}

}
