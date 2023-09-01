/*
AbCdEdCbA
 bCdEdCb
  CdEdC
   dEd
    E
   dEd
  CdEdC
 bCdEdCb
AbCdEdCbA
*/

public class Pattern203
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
				System.out.print(" ");
			for(int j=i;j<=n;j++)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			for(int j=n-1;j>=i;j--)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=n-i+1;j<=n;j++)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			for(int j=n-1;j>=n-i+1;j--)
				System.out.print((char)(j+((j%2!=0)?64:96)));
			System.out.println();
		}
	}
}