/*
*   * 
*  ** 
* * * 
**  * 
*   * 
 */
public class Pattern248
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)//2
		{
			for(int j=i;j>1;j--)//2
				 if(j==i)//2
						System.out.print("*");
					else
						System.out.print(" ");
			System.out.print("*");
			for(int k=i;k<=n;k++)
				if(k==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
