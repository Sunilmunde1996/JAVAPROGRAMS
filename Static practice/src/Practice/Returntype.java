package Practice;

public class Returntype {
                    

	public  void  test1() {
		String result="hello";
		System.out.println(result);
	//	return result;// no return value in void prsent
	
	}
	public int Test2() {
		int sunil=9;
		int sanket =9;
		int result=sunil+sanket;
		return result;
		
	}
	public static void main(String[] args) {
		Returntype obj=new Returntype();
		obj.test1();
    int e= obj.Test2();
   System.out.println(e);
		
		
		
	}
		
		
	
	
		
		
	  
		 
}
		 
	 
	 
	 
	

	


