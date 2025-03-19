class lab17{
public static void main(String args[]){
//char to Character
Character ch2=new Character('A');
System.out.println("char to Character\t:"+ch2);
//Character to char
char ch=ch2.charValue();
System.out.println("Character to char\t:"+ch2);
//Character to String
String str=ch2.toString();
System.out.println("Character to String\t:"+str);
//char to String
String st=Character.toString('B');
System.out.println("char to String using toString of Character\t:"+st);
String st2=String.valueOf('C');
System.out.println("char to String using valueOf of String\t:"+st2);
Character ch3=new Character('D');
Character ch4=new Character('D');
System.out.println("ch2\t:"+ch2);
System.out.println("ch3\t:"+ch3);
System.out.println("ch4\t:"+ch4);
System.out.println("ch3==ch4\t:"+(ch3==ch4));
System.out.println("ch3.equals(ch4)\t:"+ch3.equals(ch4));
System.out.println("ch3.compareTo(ch4)\t:"+ch3.compareTo(ch4));
System.out.println("ch3.compareTo(ch2)\t:"+ch3.compareTo(ch2));
}
}