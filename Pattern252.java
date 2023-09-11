/*
 * * * 
*     *
*     *
*     *
*     *
 * * * 
      *
 */
public class Pattern252 
{
	public static void main(String args[])
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n-1)
					System.out.print((j%2==0)?"*":" ");
				else
					if(i==n)
						System.out.print((j==n)?"*":" ");
					else
					System.out.print((j==1 || j==n)?"*":" ");
			}
			System.out.println();
		}
	}
}
