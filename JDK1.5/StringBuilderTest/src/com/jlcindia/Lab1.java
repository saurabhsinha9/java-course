package com.jlcindia;

public class Lab1 {
public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(0);
        StringBuilder builder3 = new StringBuilder(100);
        StringBuilder builder4 = new StringBuilder("JLC");
        
        System.out.println(builder1.capacity());
        System.out.println(builder2.capacity());
        System.out.println(builder3.capacity());
        System.out.println(builder4.capacity());
        
}
}
