/*
1
1A
1B1
1C1D
1E1F1
*/

class Pattern145
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print((char)(count+++64));
			System.out.println();
		}
	}
}