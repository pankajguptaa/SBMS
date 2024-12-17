class A{
	public static void main(String[] args){
		System.out.println("A class.");		
	}
}
class B{
	public static void main(String[] args){
		System.out.println("B class.");
		A.main(new String[0]);
	}
}
class C{
	public static void main(String[] args) {
		System.out.println("C class ");
	}
}

class E{
	public static void main(String[] args) {
		System.out.println("E class ");
	}
}

class D{
	public static void main(String[] args) {
		System.out.println("D class ");
	}
}

class H{
	public static void main(String[] args) {
		
		//AA-101
		public void m1(){
			int i = 19;
			int j = 20;
			int k = 30;
			//logic is remaing
			System.out.println("H class ");
		}
		//AA-102
		public void m2(){
			String name = "Pankaj";
			String email = "pankajgupta211@gmail.com";
			String address = "New Delhi";
		}	 

	}
}


