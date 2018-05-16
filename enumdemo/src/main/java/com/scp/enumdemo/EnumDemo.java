package com.scp.enumdemo;


/**
 * Hello world!
 *
 */
interface demo{
	abstract void saveData();
}
public class EnumDemo 
{
	public enum Days{
		monday,tuesday,wensday,thursday,friday,saturday,sunday;
		
		Days(){
			System.out.println("Inside constructor of enum");
		}
		//toString and ordinal method
		public void print(Days day){
			System.out.println("Value" + day.toString());
			System.out.println("Ordinal" + day.ordinal());
		}
		
	
	}
    public static void main( String[] args )
    {
         
        //values method
        Days[] days=Days.values();
        for (Days day : days) {
			System.out.println(day.name());
		}
        
        switchEnum(Days.monday);
        
        
        
        
    }
	private static void switchEnum(Days day) {
		
		//switch case using enum available from java 1.5
		switch(day){
		case monday:
			System.out.println(day.name());
			break;
		case tuesday:
			System.out.println(day.name());
			break;
		case wensday:
			System.out.println(day.name());
			break;
		case thursday:
			System.out.println(day.name());
			break;
		case friday:
			System.out.println(day.name());
			break;
		case saturday:
			System.out.println(day.name());
			break;
		case sunday:
			System.out.println(day.name());
			break;
		
		}
		
	}
}
