package Com.techlab.java;

public class FibonicCommand {
	public static void main(String[] args) {
		 int temp = 0;
		 int n1=Integer.parseInt(args[1]);
		 int n2= Integer.parseInt(args[2]);
		int n = Integer.parseInt(args[0]);
		System.out.print(n1 + "  " + n2);
		for (int i = 0; i < n; i++) {
			temp = n1 + n2;
			n1 = n2;
			n2 = temp;
			System.out.print(" " + temp);

		}
	}
}