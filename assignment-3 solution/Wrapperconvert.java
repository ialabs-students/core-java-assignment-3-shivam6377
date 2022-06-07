package com.Assignment;

public class Wrapperconvert {
	public static void main(String[] args){ 
		int object=10;
		convertToWrapper(object);
	}

	private static Integer convertToWrapper(int object) {
		Integer a=Integer.valueOf(object);
		
		if(a instanceof Integer) {
			System.out.println(a);
		}
		else
		{
			System.out.println("Give proper input");
		}
		 return a;
	}
}
