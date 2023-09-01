/*
10101
1010
101
10
1
*/

class Pattern141
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			System.out.println();
		}
	}
}