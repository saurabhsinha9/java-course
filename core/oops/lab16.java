class Hello{

			int fact(int n){
			if(n==0||n==1){
			return 1;
			}
			
			int x=n*fact(n-1);
			return x;
			}
			
}


class lab16{

			public static void main(String args[]){
			
					Hello h=new Hello();

					int a= Integer.parseInt(args[0]);
					
					if(a>=0){
					int f =h.fact( a);
					System.out.println(f);
					}
					
					else{
					System.out.println("please enter any positive number");
					
					}
					
			}
			
}