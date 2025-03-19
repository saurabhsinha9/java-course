enum Colors {
 WHITE, BLACK, RED, YELLOW, BLUE;  //; is required here.
 
 public String toString() {
   //only capitalize the first letter
   String s = super.toString();
   return s.substring(0, 1) + s.substring(1).toLowerCase();
 }
}
public class EnumTest5 {

    public static void main(String[] args) {
        
        Colors col=Colors.RED;
        
        System.out.println(col);
        
        
    }

}