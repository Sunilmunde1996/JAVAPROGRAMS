package Practice;

public class Reversename {

	 public static void Reverse () {
		String a="Sunil";
		 int len=a.length();
		 System.out.println(a);
		 for (int i=len-1;i>=0;i--)
		 { 
			 System.out.print(a.charAt(i));
		 }
		     
		 
		 }
	 public static void main(String[] args) {
		 Reversename.Reverse();
		// Reversename.Reverse(" ");
		 
		
	}
}
