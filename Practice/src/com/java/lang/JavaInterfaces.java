package com.java.lang;

interface Interface1{
	public void Imethod1();
}
interface Interface2 extends Interface1 {
	public void Imethod2();
}
public class JavaInterfaces implements Interface2{
	/* This class is only implementing the Interface2 but it can also to implement all the methods 
	 * of Interface1 because the interface Interface2 extends Interface1.
	 */
	public void Imethod1(){
		System.out.println("This is the Implementation of Method 1.");
	}
	public void Imethod2(){
		System.out.println("This is the Implementation of Method 2.");
	}
	public static void main(String args[]){
		Interface2 obj = new JavaInterfaces();
		obj.Imethod2();
	}
}