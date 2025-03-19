package com.jlc.EFS;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab2 {

	public static void main(String[] args) {
		int arr[]=new int[]{12,43,45,57,60};//static array declaration
		
		//using simple for loop
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
		//using Enhanced for loop
		for(int i:arr){
			System.out.println(i);
		}
		System.out.println("-----");
		int ar[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i[]:ar){
			System.out.println(i);
			for(int y:i){
				System.out.println(y);
			}
		}
		System.out.println("---------");
		System.out.println("3rd dimension-start");
		int ar1[][][]=new int[4][5][6];
		for(int i[][]:ar1){
			System.out.println(i);
			for(int y[]:i){
				System.out.println(y);
				for(int z:y){
					System.out.println(z);
				}
			}
		}
		System.out.println("3rd dimension-end");
		System.out.println("----------");
		String str[]=new String[5];
		str[0]="I";
		str[1]="we";
		str[4]="hum";
		for(String s:str){
			System.out.println(s);
		}
		System.out.println("----------");
		ArrayList al=new ArrayList();
		al.add("sri");
		al.add(99);
		al.add(12.03);
		al.add(78965423);
		al.add(789653.0078965);
		al.add(true);
		System.out.println(al);
		//using iterator
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("------*****");
		//using EFL
		for(Object o:al){
			System.out.println(o);
		}
	}

}
