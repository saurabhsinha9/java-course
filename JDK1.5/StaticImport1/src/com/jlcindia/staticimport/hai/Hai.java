package com.jlcindia.staticimport.hai;

import static java.lang.Math.PI;
import java.lang.System.*;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Hai {
public void m1(){
	System.out.println(PI);
	System.err.println("this is with err");
	//long l=currentTimeMillis();//without static import
	long l=currentTimeMillis();
	System.out.println(l);
	System.out.println("-----");
	int ar[]={25,8,12,6,99,105,63,0,5};
	for(int i:ar){
		System.out.println(i);
	}
	System.out.println("-----");
	sort(ar);
	for(int i:ar){
		System.out.println(i);
	}
}
}
