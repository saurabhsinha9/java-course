package com.jlcindia.main;

import static com.jlc.hello.Hello.*;
import static com.jlc.hai.Hai.*;

import com.jlc.hai.Hai;
import com.jlc.hello.Hello;

public class Lab1 {
public static void main(String[] args) {
System.out.println("Accessing Hello class static member using static import");
System.out.println(a);
//System.out.println(b);

m1();
Hello.m2();//ambiguous

//m4();
System.out.println("Accessing Hai class static member using static import");
System.out.println(x);
//System.out.println(y);
Hai.m2();//ambiguous
m3();
//m5();
}
}
