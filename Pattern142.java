/*
10101
0101
101
01
1
*/

class Pattern142
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			System.out.println();
		}
	}
}