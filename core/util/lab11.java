import java .util.*;

public class lab11{
public static void main(String args[]){
System.out.println(Locale.getDefault());
System.out.println("\n");
System.out.println("\n");

Locale locales[]=Locale.getAvailableLocales();//provide all language in the machine
for(int i=0;i<locales.length;i++){
System.out.print(locales[i]+",");
}
System.out.println("\n");
System.out.println("\n");


String countries[]=Locale.getISOCountries();
for(int i=0;i<countries.length;i++){
System.out.print(countries[i]+",");
}
System.out.println("\n");
System.out.println("\n");

String languages[]=Locale.getISOLanguages();
for(int i=0;i<languages.length;i++){
System.out.print(languages[i]+",");
}
System.out.println("\n");
System.out.println("\n");
System.out.println("***************************************");

Locale loc=new Locale("EN");
System.out.println(loc.getCountry());
System.out.println(loc.getDisplayCountry());
System.out.println(loc.getDisplayName());
System.out.println(loc.getVariant());
System.out.println(loc.getDisplayVariant());

System.out.println("***************************************");

Locale loc1=new Locale("EN","US");
System.out.println(loc1.getCountry());
System.out.println(loc1.getDisplayCountry());
System.out.println(loc1.getDisplayName());

}
}