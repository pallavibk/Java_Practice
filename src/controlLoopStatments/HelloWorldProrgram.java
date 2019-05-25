package controlLoopStatments;

class HelloWorldProrgram {
	
	class inner
	{
		public  void  fun1()
		{
			System.out.println("inner class");
		}
	}
	
	

	//YOU CAN DECLARE MAIN WITH 
	
	// main function With public keyWord 
		public static  void main(String[] args) 
	{
    
		System.out.println("Hello World program");
	
	//	inner obj=new inner();
		
	}
	
	//main function  With default keyWord ANS : YOU CAN DECLARE MAIN WITH DEFAULT BUT U CANOT RUN MAIN WITH DEFAULT IE U GET ERROR 
	/*static void main(String[] args) 
	{
      
		System.out.println("Hello World program");
		
	*/
	
	//main function With PRIVATE keyWord ANS : YOU CAN DECLARE MAIN WITH PRIVATE BUT U CANOT RUN MAIN WITH PRIVATE IE U GET ERROR 
	/*private static void main(String[] args) 
	{
		      
			System.out.println("Hello World program");*/
	
			
			
	//main function With protected keyWord ANS : YOU CAN DECLARE MAIN WITH PROTECETED BUT U CANOT RUN MAIN WITH PROTECTED IE U GET ERROR 
	/* protected static void main(String[] args) {

		System.out.println("Hello World program");
    */
		
		
	
		/*//main method should alWays be void not int
		public static  int main(String[] args) 
		{
		    
			System.out.println("Hello World program");
		 return 0;
		}
		*/
		
	/*	//method inside methods is not alloWed in java
	 public static	void fun1()
		{
			System.out.println("sub method inside main");
		}*/		
		
}



