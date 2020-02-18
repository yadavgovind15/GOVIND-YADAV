package Com.techlab.java;

public class Arrays {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 3 };
		int temp = 0;
		//for (int i = 0; i < a.length; i++) {
		//	for (int j = 0; j < a.length-3; j++) {
		for(int x:a) {
			for(int y:a) {
			//	if (x < y) {
//temp=x;
//x=y;
temp=y;
				}
			}
		}
		System.out.println(temp);

	}

	}

