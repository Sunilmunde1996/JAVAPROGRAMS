package sTATIC;

public class instancestatic {

	    static int a =10 ;
	    public static void sub() {
	    	int d=a;
	    	System.out.println(d);
	    }
	    
	    		
	    public void add() {
	    	int c=a;
	    	System.out.println(c);
	    	
	    }
	    public static void main(String[] args) {
	    	instancestatic obj=new instancestatic();
	    	obj.add();
	    	instancestatic.sub();
	    			
	    	
			
		}
	    	

	}


