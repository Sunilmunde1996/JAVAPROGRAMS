package loops;

public class Ttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=5; i>0; i--)
		{	 
			for (int j=0; j<6-i; j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i; k++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}

	}

}
 