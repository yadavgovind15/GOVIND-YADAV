package Com.techlab.java;

public class MostFrequentlyRepeated {
	
	public static void main(String[] args) {
		int a[] = { 1, 3, 1, 5, 4, 1, 6, 4, 1, 8 };
		int count = 0,temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
				if (temp<count)
					temp= a[i];
			}
		}
		System.out.println("Repeated element is:" + temp );
		System.out.println( " Number of repeated times :"  + count);
	}
}
