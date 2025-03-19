package com.jlc.util;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Lab9 {

	public static void main(String[] args) {
		int x[]={4,7,2,3,6,1,8};
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		for(int i:x){
			System.out.println(i);
			pq.offer(i);
		}
		System.out.println(pq);
		for(int i:x){
			System.out.println(" "+pq.poll());//printed in sorted order
		}
		PQSort pqs=new PQSort();
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(8,pqs);
		System.out.println(pq1);
		System.out.println("--");
		for(int i:x){
			pq1.offer(i);
			System.out.println(i);
		}
		
		System.out.println("--");
		System.out.println(pq1);
		System.out.println(pq1.size());
		System.out.println(pq1.peek());
		System.out.println(pq1);
		System.out.println(pq1.poll());
		System.out.println(pq1);
		System.out.println(pq1.size());
		for(int i:x){
			System.out.print(" "+pq.poll());//printed in sorted order
		}
	}

}

 class PQSort implements Comparator<Integer>{

	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}
	
}