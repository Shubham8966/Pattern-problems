/*
1       1
12     21
123   321
1234 4321
123454321
 */
public class Pattern220
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			if(i==1)
			{
				for(int j=1;j<=n;j++)
					System.out.print(j);
				for(int j=n-1;j>=1;j--)
					System.out.print(j);
			}
			else
			{
				for(int j=1;j<=n-i+1;j++)
					System.out.print(j);
				for(int j=1;j<=(((i-1)*2)-1);j++)
					System.out.print(" ");
				for(int j=n-i+1;j>=1;j--)
					System.out.print(j);
			}
			System.out.println();
		}
	}
}
