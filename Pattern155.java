/*
5
54
543
5432
54321
5432
543
54
5
*/

public class Pattern155
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=((n*2)-1);i++)
		{
			if(i<=n)
				for(int j=1;j<=i;j++)
					System.out.print(n-j+1);
			else
				for(int j=1;j<=((n*2)-i);j++)
					System.out.print(n-j+1);
			System.out.println();
		}
	}
}
