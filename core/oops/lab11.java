class Arithmetic{

				void sum(byte a){
				System.out.println("sum(byte a)");
				}
				
				
				void sum(short a){
				System.out.println("sum(short a)");
				}
				
				void sum(int a){
				System.out.println("sum(int a)");
				}
				
				void sum(long a){
				System.out.println("sum(long a)");
				}
				
				void sum(float a){
				System.out.println("sum(float a)");
				}
				
				void sum(double a){
				System.out.println("sum(double a)");
				}
				
}
class lab11{

			public static void main(String arg[]){
			
						Arithmetic ar= new Arithmetic();
						
						byte b=10;
						ar.sum(b);
						
						short s=10;
						ar.sum(s);
						
						ar.sum(10);
						
						long l=10;
						ar.sum(l);
						
						float f= 10.0f;
						ar.sum(f);
						
						double d =10.0;
						ar.sum(d);
						
			}
			
}