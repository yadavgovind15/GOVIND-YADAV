package Com.techlab.java;

public class ObjectProgram {
	public static void main(String[] args) {
		MethodA();
	}

	static void MethodA() {
		System.out.println("method A is called");
		MethodA();

	}

	  static void MethodB() { System.out.println("method B is called"); }
	  
	  static void MethodC() { System.out.println("method C is called");
	   MethodA();
	  }

}
