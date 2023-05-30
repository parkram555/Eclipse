package com.practice;

public class SingletonClass {

	public static SingletonClass class1;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return (class1 == null) ? class1 = new SingletonClass() : class1;
	}

	public static void main(String[] args) {
		SingletonClass instance = SingletonClass.getInstance();
		System.out.println(System.identityHashCode(instance));
		
		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(System.identityHashCode(instance2));
	}
}
