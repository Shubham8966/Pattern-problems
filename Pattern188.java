/*
123454321
 1234321
  12321
   121
    1
*/

public class Pattern188
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int j=i;j>=2;j--)
				System.out.print(j-1);
			System.out.println();
		}
	}
}
