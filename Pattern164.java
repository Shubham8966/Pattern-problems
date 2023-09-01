/*
11111
2222
333
44
5
44
333
2222
11111
*/

public class Pattern164 
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=((n*2)-1);i++)
		{
			if(i<=n)
				for(int j=i;j<=n;j++)
					System.out.print(i);
			else
				for(int j=i;j>=n;j--)
					System.out.print((n*2)-i);
			System.out.println();
		}
	}
}
