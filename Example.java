class Example {
	
	//static variable
	static int a = 10;
	static int b = 20;

	//non static variable
	int x = 30;
	int y = 40;
	
					//parameter var
	static void m1(int p, int q){
		//local varable
		int m = 50;
		int n = 60;
		System.out.println("m1");
		//System.out.println(p);
		//System.out.println(q);
	}

							//parameter var
	public static void main(String[] args) {
		System.out.println("main mathod");

		//local variables
		int r = 101;
		int s = 102;

		//here e1 and e2 is also local variables of Example types
		Example e1 = new Example();
		Example e2 = new Example();

		m1(55, 65);
		m1(85, 95);
	}//main end
}//class end
