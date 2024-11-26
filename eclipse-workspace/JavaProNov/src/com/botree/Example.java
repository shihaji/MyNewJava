package com.botree;

public class Example extends Object {
	
	
	public static void main(String[] args) {  // jvm 
	  
		try {
		method1();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	 
    }
	
	
	public static  void method1() throws Exception {
		
		method2();
	}
	
    public static  void method2() throws Exception  {
		
    
      method3();
     
      
	}
    // method signature which says  method will throw an exception
    public static  void method3() throws Exception  {
		
    	int a=10;
    	
    	int b=0;
 
    	
    	if(b==0) {
    		throw new Exception("b is zero");  // throw will b used to manually throw an exception
    	}
    	
    	
    	int c=a/b;
    	
    	System.out.println(c);
    	
    
    	
	}
	
	
	
}





	


