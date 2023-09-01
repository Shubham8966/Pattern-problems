/*
*****
*   *
*   *
*   *
*****
*/
public class Pattern240 
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==n)
				for(int j=1;j<=n;j++)
					System.out.print("*");
			else
				for(int j=1;j<=n;j++)
						System.out.print((j==1 || j==n)?"*":" ");
			System.out.println();
		}
	}
}
