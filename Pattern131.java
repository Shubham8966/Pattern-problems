/*
55555
44445
33345
22345
12345
*/

class Pattern131
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
				if(i>j)
					System.out.print(i);
				else
					System.out.print(j);
			System.out.println();
		}
	}
}