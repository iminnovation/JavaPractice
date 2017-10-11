package com.java.lang;

class Constructors {
	  //Constructor
	Constructors() {
	    System.out.println("Constructor method.");
	  }
	 
	Constructors(int i) {
	    System.out.println("Parm Constructor method."+i);
	  }
	 
	  public static void main(String[] args) {
		  Constructors obj = new Constructors(); //creating object
		  Constructors obj1 = new Constructors(5);
	  }
	}