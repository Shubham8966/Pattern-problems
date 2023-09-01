/*
*  ****   
*  *   
*  *   
*******
   *  *
   *  *
****  *
 */
public class Pattern245 
{
	public static void main(String args[])
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			if(i==1||i>=((n/2)+1))
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		
		for(int i=1;i<=(n/2)-1;i++)
		{
			for(int j=1;j<=n;j++)
				if(j==1||j==((n/2)+1))
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
			System.out.print("*");
		System.out.println();
		
		for(int i=1;i<=(n/2)-1;i++)
		{
			for(int j=1;j<=n;j++)
				if(j==((n/2)+1)||j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
			if(i<=((n/2)+1)||i==n)
				System.out.print("*");
			else
				System.out.print(" ");
		System.out.println();
	}
}
