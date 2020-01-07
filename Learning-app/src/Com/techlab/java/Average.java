package Com.techlab.java;

public class Average {
	public static void main(String[] args) {
		
		System.out.println(args[0] + " "+args[1]);
		int a[] = { 10, 60, 50 };
		float totalmarks = 300;
		int sum = 0, average = 0;
		float per =0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		average = sum / a.length;
		per = ((sum / totalmarks) * 100);
		System.out.println("percentage" + per);

		System.out.println("sum" + sum);
		System.out.println("average" + average);

		if (a[0] > a[1] && a[0] > a[2]) {
			System.out.println("a[0] is maximum");
		} else if (a[1] > a[0] && a[1] > a[2]) {
			System.out.println("a[1] is maximum");
		} else {
			System.out.println("a[2] is maximum");
		}

	}
}
