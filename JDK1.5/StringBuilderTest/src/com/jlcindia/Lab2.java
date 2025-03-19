package com.jlcindia;

public class Lab2 {
	public static void main(String[] args) {
		StringBuilder br=new StringBuilder("jlc");
		System.out.println(br);
		br.append(true);
		System.out.println(br);
		int index = br.indexOf("true");
		System.out.println(index);
        br.insert(index, "india");
        System.out.println(br.toString());
        String c="java";
        br.append(c);
        System.out.println(br);
         br.delete(index, index + c.length());
         System.out.println(br);
	}	
}
