package com.jlcindia.enums;

enum Days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}


public class Lab1 {
	
	public static void main(String[] args) {
		
		Days d1=Days.FRIDAY;
		System.out.println(d1.ordinal());
		if(d1==Days.SATURDAY){
			System.out.println("ok");
		}else{
			System.out.println("Not OK");
		}
		Days dd[]=Days.values();
		for(Days d:dd){
			System.out.println(d+"\t"+d.ordinal());
		}
		show(Days.MONDAY);
		show(Days.FRIDAY);
	}

	private static void show(Days d) {
		switch(d){
			case MONDAY:
				System.out.println("Monday");
			case TUESDAY:
				System.out.println("Tuesday");
				break;
			case FRIDAY:
				System.out.println("Friday");
				break;
		}
	}

}
