package Com.techlab.java;

public class StringCommand { 
	public static void main(String[] args) {
		String query=args[0];

		String[] str = query.split("[// , ., @, ]");

		System.out.println("company name is :" + str[2]);
		 
		System.out.println("Developer name is :" + str[4]);
		System.out.println(str.length);
		
		
	}

}
