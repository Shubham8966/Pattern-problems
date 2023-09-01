/*
0
11
000
1111
00000
*/

class Pattern138
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
				if(i%2==0)
					System.out.print(1);
				else
					System.out.print(0);
			System.out.println();
		}
	}
}