package com.techlab.variabledemo;

public class FruitTest {
	public static void main(String[] args) {
		String [] fruit = new String[4] ;
		fruit[0]=(args[0]);
		fruit[1]=(args[1]);
		fruit[2]=(args[2]);
		fruit[3]=(args[3]);
		
		switch (fruit[2] ){
		case "apple":
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
