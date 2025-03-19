class lab15{

			public static void main(){
			System.out.println("main()");
			//main(); //it cause stack overflow error
			}

			public static void main(int x){
			System.out.println("main(int x)");
			}

			public static void main(String as){
			System.out.println("main(String as)");
			}

			public static void main(String args[]){
			System.out.println("main(String args[])");
			main();
			main(10);
			main("saurabh");

			}

}