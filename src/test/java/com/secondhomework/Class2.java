package com.secondhomework;

public class Class2 {
	public static void main(String[] args) {
		
	Class2 obj = new Class2();
	obj.Ahsan("Ahsan Sheikh.");
	obj.Ahsan("Mohsin Sheikh.");
	obj.Ahsan("Eshaal.");
	
	add(4,5);
		
	}
	
	void Ahsan(String a) {
		System.out.println("My name is " + a);
	}
	
	static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	
}
