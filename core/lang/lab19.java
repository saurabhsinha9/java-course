public class lab19{
public static void main(String args[])throws Exception{
//Runtime rt1=new Runtime();
Runtime rt=Runtime.getRuntime();
System.out.println(rt.availableProcessors());
System.out.println(rt.totalMemory());
System.out.println(rt.maxMemory());
System.out.println(rt.freeMemory());
System.out.println(rt.maxMemory()-rt.totalMemory());
rt.exec("notepad");
rt.exec("calc");

}
}