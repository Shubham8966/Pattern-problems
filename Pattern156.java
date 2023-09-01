/*
5
45
345
2345
12345
2345
345
45
5
*/

public class Pattern156 
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=((n*2)-1);i++)
		{
			if(i<=n)
				for(int j=i;j>=1;j--)
					System.out.print(n-j+1);
			else
				for(int j=i;j<=((n*2)-1);j++)
					System.out.print(j-n+1);
			System.out.println();
		}
	}
}
