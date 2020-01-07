package com.techlab.variabledemo;

class AreaCirclewithmethod {
	public static void main(String[] args) {

		System.out.println();

		double r = radius(12);
		System.out.println("area " + r);

	}

	static double radius(int r) {
		double area = (3.14 * r * r);
		return area;
	}
}