package Practice;

public class Staticnonstatic {

	 public void multi (int a,int b)            {
		// int a=10;//
	//	 int b=11;//
		 
		 int c=a+b;
		 System.out.println(c);
	

	}
	 public static void main(String[] args) {;
		 Staticnonstatic obj=new Staticnonstatic();
		 obj.multi(10,11);
		
	}

}
