/*
    A
   AbA
  AbCbA
 AbCdCbA
AbCdEdCbA
 AbCdCbA
  AbCbA
   AbA
    A  
*/

public class Pattern202
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			for(int j=i-1;j>=1;j--)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			for(int j=i-1;j>=1;j--)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			System.out.println();
		}
	}
}