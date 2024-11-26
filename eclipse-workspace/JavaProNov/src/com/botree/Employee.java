package com.botree;






public class Employee {
	
	private int id;  // e instance variable
	String name;  //e
	int salary; // e
	static int age; //  static variable

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee() {
	
		System.out.println("employee constructor called...");
	}
	
    public Employee(int id) {
    	this.id=id;
    }
	
	
	  public boolean equals(Object obj) { 
	      
		  Employee e=(Employee) obj;
		
		  return (this.id==e.id && this.name.equals(e.name));
		  
	    }
	  
	  
	  public void test(int id,String name) {  // local variable
		 final int a=10;
		  
	  }


	@Override
	public String toString() {
		
		return this.id+" "+this.name;  
		
		// super keyword  
		// super()  call constructor of the super class
	}
	  
	  
	  

}
