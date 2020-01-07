package Com.techlab.java;

public class CommandFriut {
	public static void main(String[] args) {
		
int n= Integer.parseInt(args[0]);
switch ("fruits") {
case "Apple":
	System.out.println("I like Apple");
	break;
case "Banana":
	System.out.println("I Like Banana");
	break;
case "Guava":
	System.out.println("i like Guava ");
	break;
case "Mango":
	System.out.println("I  like Mango");

	default: System.out.println("i Like some other Fruit");
	break;
	}
}
}
