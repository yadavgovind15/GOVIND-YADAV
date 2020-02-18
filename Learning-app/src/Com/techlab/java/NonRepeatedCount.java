package Com.techlab.java;

public class NonRepeatedCount {
	public static void main(String[] args) {
		int array1[] = { 1, 3, 5, 7, 9, 12, 16, 1,3,14, 5 };
		int count;
		for (int i = 0; i < array1.length; i++) {
			count = 0;
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] == array1[j] && i != j) {
					count++;
				}
			}
			if(count==0)
				System.out.print(array1[i]+" ");
		
		}
	}

}
