package com.jlcindia.spring.aop;

public class TxService {
	static{
		System.out.println("TxService  -S.B");
	}
	public TxService(){
		System.out.println("TxService  -D.C");
	}
	public void begin(){
		System.out.println("TxService.....begin()");
	}
	public void commit(){
		System.out.println("TxService.....commit()");
	}
	public void rollback(){
		System.out.println("TxService.....rollback()");
	
	}
}
