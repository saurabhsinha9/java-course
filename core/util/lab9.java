import java.util.*;

public class lab9{
public static void main(String args[]){
int arr[]={10,45,25,6,78,12,21};
int arr1[]={10,45,25,6,78,12,21};
int arr2[]={10,45,85,45,12,78,896};
System.out.println(Arrays.equals(arr,arr1));
System.out.println(Arrays.equals(arr,arr2));

for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+"\t");
}
System.out.println("\n");
for(int i=0;i<arr1.length;i++){
System.out.print(arr1[i]+"\t");
}
System.out.println("\n");
for(int i=0;i<arr2.length;i++){
System.out.print(arr2[i]+"\t");
}
System.out.println("\n");
System.out.println("\n**************************arr after sorting********************************");
System.out.println("\n");

Arrays.sort(arr);		//sort the array element--sort is static method in Array class
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+"\t");
}
System.out.println();
System.out.println(Arrays.binarySearch(arr,6));
System.out.println(Arrays.binarySearch(arr,9));
System.out.println(Arrays.equals(arr,arr1));
System.out.println(Arrays.equals(arr,arr2));
Arrays.fill(arr,32);
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+"\t");
}
System.out.println("\n");
Object ob[]={"jlc","india","sri","vas","white","red"};
for(int i=0;i<ob.length;i++){
System.out.print(ob[i]+"\t");
}
System.out.println("\n");
List list=Arrays.asList(ob);
Iterator it=list.iterator();
while(it.hasNext()){
System.out.println(it.next()+"\t");
}
System.out.println("\n");
Arrays.sort(ob);
for(int i=0;i<ob.length;i++){
System.out.print(ob[i]+"\t");
}
System.out.println("\n");
}
}