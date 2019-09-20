package com.dev.methods;

public class MethodExample {

		static int j=0;
		static String str = " ";	//we declare variable like this 
		static char ch= ' ';
		static byte b=1;
	    static int area = 0;
		
		public static void main(String[] args) {
			
		MethodExample me = new MethodExample();
		
		int area=calcArea(6);
		System.out.println("Area of square: "+area);
		int area1 = me.areaRec(6,7);
		System.out.println("Area of rectangle : "+area1);

	}
	public static int calcArea(int side) {
		int area=side*side;
		return area;
	}
	public int areaRec(int len, int width) {
		int area = len*width;
		return area;
	}
}
