class lab40{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
int a[]=new int[n];
}
}
/*
compile and run successfully
*/
/*
error comes if we pass sm wrong value at run time
1)java lab40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
2)java lab40 xx
Exception in thread "main" java.lang.NumberFormatException: For input string: "xx"
3)java lab40 -1
Exception in thread "main" java.lang.NegativeArraySizeException
4)java lab40 0
ok------>empty array
5)int a[]=new int[10.9];
found:double
required:int
6)int a[]=new int[99999999999999999999999999];
integer number too large
*/