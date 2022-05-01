package sTATIC;

public class Nonstatic {

	   public void addition  ()          {
		   int a=20;
		   int b=30;
		   int c=a*b;
		   System.out.println(c); 
	   }
	             
	   public static void main(String[]args) { 
		   Nonstatic a=new Nonstatic();
		   a.addition();
		   Nonstatic c =  new Nonstatic();
		  a. addition();
		   
	  }
	   
	     
		 

	    

}
