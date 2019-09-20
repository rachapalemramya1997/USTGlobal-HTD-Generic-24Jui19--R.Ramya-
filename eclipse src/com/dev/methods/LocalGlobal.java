package com.dev.methods;

public abstract class LocalGlobal {
	

			public static int j=0;	//we use this in another package we write public
			static MethodExample me = new MethodExample();
			
			public static void main(String[] args) {
			
			
			j=calcArea(6);
			System.out.println("Area of square: "+j);
			int area1 = me.areaRec(6,7);
			System.out.println("Area of rectangle : "+area1);

		}
		public static int calcArea(int side) {
			j=side*side;
			int n= me.areaRec(4, 8);
			System.out.println("area of rectangle : "+n);
			return j;
		}
		public int areaRec(int len, int width) {
			int area = len*width;
			return area;
		}
	

}
