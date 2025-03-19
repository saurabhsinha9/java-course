package com.jlc.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner sc=null;
		int count=0;
		int sum=0;
		//write number to file
		try {
			FileWriter fout=new FileWriter("Numbers.txt");
			fout.write("10 20 30 40 50 done");
			fout.close();
			
			FileReader fir=new FileReader("Numbers.txt");
			sc=new Scanner(fir);
		} catch (Exception e) {
			e.printStackTrace();
		}
		while(sc.hasNext()){
			if(sc.hasNextInt()){
				sum+=sc.nextInt();
				count++;
			}else{
				String str=sc.next();
				if(str.equals("done")){
					break;
				}
			}
		}
		System.out.printf("Sum is of given %d numbers is %d",count,sum);
	}

}
