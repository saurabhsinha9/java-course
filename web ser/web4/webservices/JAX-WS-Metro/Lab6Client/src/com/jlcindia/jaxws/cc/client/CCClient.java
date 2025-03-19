package com.jlcindia.jaxws.cc.client;
/*
 * http://www.webservicex.net/CurrencyConvertor.asmx?WSDL
 * */
public class CCClient {
	
	public static void main(String[] args) {
		CurrencyConvertor cc=new CurrencyConvertor();
		CurrencyConvertorSoap ccs=cc.getCurrencyConvertorSoap();
		double d1=ccs.conversionRate(Currency.USD, Currency.INR);
		System.out.println(d1);
		double d2=ccs.conversionRate(Currency.GBP, Currency.INR);
		System.out.println(d2);
		double d3=ccs.conversionRate(Currency.EUR, Currency.INR);
		System.out.println(d3);
	}

}
