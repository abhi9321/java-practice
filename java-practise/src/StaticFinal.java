class Baleno {
	int create_obj;
	
	static int  number;
	
	public void method1() {
		System.out.println(this.create_obj);
	}
	
	public static void staticMethod() {
		System.out.println("Static method");
	}
	
	public static void staticMethod2() {
		System.out.println(number);
	}
	
}



public class StaticFinal {

	public static void main(String[] args) {
		
		// normal method
		Baleno obj = new Baleno();
		obj.create_obj = 5;
		obj.method1();
		
		// static method can be called without initializing object
		Baleno.staticMethod(); 
		
		//static variable
		Baleno.number = 10;
		Baleno.staticMethod2(); 
		
		
		
		


	}

}
