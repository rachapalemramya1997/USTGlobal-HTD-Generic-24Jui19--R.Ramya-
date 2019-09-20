package com.dev.constructor;

import com.dev.methods.LocalGlobal;
import com.dev.methods.MethodExample;

public class Demo {

	public Demo() {
		
	}

	public static void main(String[] args) {	//importing method from method example
		int i = MethodExample.calcArea(3);
		System.out.println(i);
		
		System.out.println(LocalGlobal.j);

	}

}
