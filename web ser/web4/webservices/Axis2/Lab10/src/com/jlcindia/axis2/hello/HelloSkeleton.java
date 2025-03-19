   package com.jlcindia.axis2.hello;
   
    public class HelloSkeleton{
        
         public GetMessageResponse getMessage(GetMessage gm){
                String nm=gm.getName();
                String msg="Hello! "+nm+" Welcome to JLC AXIS2 World";
                System.out.println(msg);
                GetMessageResponse gmr=new GetMessageResponse();
                gmr.set_return(msg);
                return gmr;
        }
     
    }
    