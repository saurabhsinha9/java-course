package com.jlc.util;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		double sum=0.0;
		System.out.println("Enter the numbers");
		while(sc.hasNext()){
			if(sc.hasNextDouble()){
				sum+=sc.nextDouble();
				count++;
			}else{
				String str=sc.next();
				if(str.equals("done")){
					break;
				}
			}
		}
		System.out.printf("Sum is of given %d numbers is %f",count,sum);
	}

}
