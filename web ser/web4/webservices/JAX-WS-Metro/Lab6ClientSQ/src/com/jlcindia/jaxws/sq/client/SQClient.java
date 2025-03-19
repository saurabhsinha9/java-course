package com.jlcindia.jaxws.sq.client;

/*
 * http://www.webservicex.net/stockquote.asmx?WSDL
 * 
 */
public class SQClient {

	public static void main(String[] args) {
		StockQuote sq=new StockQuote();
		StockQuoteSoap sqs=sq.getStockQuoteSoap();
		String s=sqs.getQuote("INFI");
		System.out.println(s);
		s=sqs.getQuote("ATX");
		System.out.println(s);
		

	}

}
