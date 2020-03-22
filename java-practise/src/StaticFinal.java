class Baleno {
	
	public final static int CONST_DECLARE = 21;
	public static int count = 0;
	
	int create_obj;
	
	static int  number;
	
	public Baleno() {
		System.out.println("count now: "+count);
		count++;
	}
	
	
	public void method1() {
		System.out.println("non static variable : "+ this.create_obj);
	}
	
	public static void staticMethod() {
		System.out.println("Static method");
	}
	
	public static void staticMethod2() {
		System.out.println("static variable : "+number);
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
		
		System.out.println("constant is : " + Baleno.CONST_DECLARE);
		
		// normal method
		Baleno obj2 = new Baleno();
		obj2.create_obj = 5;
		obj2.method1();
		

	}

}
