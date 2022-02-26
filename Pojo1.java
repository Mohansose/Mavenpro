package com.Maven_Pro;

public class Pojo1 {
public static void main(String[] args) {
	Pojo obj=new Pojo();
	obj.setAge(25);
	int i = obj.getAge();
	System.out.println(i);
	obj.setName("mohan");
	String name = obj.getName();
	System.out.println(name);
}
}
