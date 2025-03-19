class lab18{
public static void main(String args[]){
char ch=args[0].charAt(0);
switch(ch){
case 'a':
case 'A':
case 'e':
case 'E':
case 'i':
case 'I':
case 'o':
case 'O':
case 'u':
case 'U':
System.out.println("vowel");break;
default :System.out.println("consonant");
}
}
}