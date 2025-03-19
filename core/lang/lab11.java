public class lab11{
public static void main(String args[]){
String str="jlcindiajlc";
String ss1="hello";
System.out.println(ss1.concat("jlc"));
System.out.println(str);
System.out.println(str.replaceFirst("jlc","JLC"));
System.out.println(str.replaceAll("jlc","JLC"));
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");

String sss="i am sri.now i am in jlc class.Listening the class.";
String ss[]=sss.split("");
for(int i=0;i<ss.length;i++){
System.out.println(ss[i]);
}
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");

String ss4[]=sss.split("am");
for(int i=0;i<ss4.length;i++){
System.out.println(ss4[i]);
}
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");


int x=99;
String s=String.valueOf(x);
System.out.println(s);
System.out.println(s.length());
System.out.println("***************");
System.out.println("***************");
System.out.println("***************");

String ssss="aaBBBcDDeeFAA";
System.out.println(ssss.matches("a*B*cD*e*FA*"));
System.out.println(ssss.matches("a*BcD*e*FA*"));

System.out.println("***************");
System.out.println("***************");
System.out.println("***************");
/*
str=str.replaceFirst("i","I");
System.out.println(str);
//System.out.println(str.regionMatches(0,"India",0,5));//(begining index of mainString,Substring,beginIndex of Substring,Last index of Substring)
System.out.println(str.regionMatches(3,"India",0,5));
System.out.println(str.regionMatches(3,"india",1,4));
System.out.println(str.regionMatches(4,"india",1,4));
System.out.println(str.regionMatches(3,"india",0,5));
System.out.println(str.regionMatches(true,3,"india",0,5));//true to ignore the case
*/
}
}