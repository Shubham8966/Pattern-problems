/*
54321
4321
321
21
1
21
321
4321
54321
*/

public class Pattern166 
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=((n*2)-1);i++)
		{
			if(i<=n)
				for(int j=i;j<=n;j++)
					System.out.print(n-j+1);
			else
				for(int j=i;j>=n;j--)
					System.out.print(j-n+1);
			System.out.println();
		}
	}
}
