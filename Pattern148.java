/*
*****
****
***
**
*
**
***
****
*****
*/

class Pattern148
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=i;j>=0;j--)
				System.out.print("*");
			System.out.println();
		}
	}
}