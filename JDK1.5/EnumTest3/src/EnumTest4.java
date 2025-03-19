class Outer {
 public enum Color {
   WHITE, BLACK, RED, YELLOW, BLUE
 }
}

public class EnumTest4 {

    public static void main(String[] args) {
        
        
		int x=Outer.Color.WHITE.ordinal();
		System.out.println(x);
		x=Outer.Color.YELLOW.ordinal();
		System.out.println(x);
        
    }

}