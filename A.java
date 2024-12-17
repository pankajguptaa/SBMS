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
		System.out.println("H class ");
		public void m1(){
			//logic is remaing

		}
		 
	}
}


