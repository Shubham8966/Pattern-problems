/*
1
00
111
0000
11111
*/

class Pattern137
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
				if(i%2==0)
					System.out.print(0);
				else
					System.out.print(1);
			System.out.println();
		}
	}
}