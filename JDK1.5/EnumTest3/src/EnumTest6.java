enum Colour implements Runnable {
 WHITE, BLACK, RED, YELLOW, BLUE;
 
 public void run() {
   System.out.println("name()=" + name() +
       ", toString()=" + toString());
 }
  public String toString() {
   //only capitalize the first letter
   String s = super.toString();
   return s.substring(0, 1) + s.substring(1).toLowerCase();
 }
}



public class EnumTest6 {

    public static void main(String[] args) {
        
        for(Colour c : Colour.values()) {
			c.run();
		}

		for(Runnable r : Colour.values()) {
		 r.run();
		}
        
    }

}