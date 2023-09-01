/*
1
1F
1E1
1D1C
1B1A1
*/

class Pattern146
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;			
		if(n%2==0)
			count=(n/2)*(n/2);
		else
			count=((n-1)/2)*(((n-1)/2)+1);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				if(j%2!=0)
					System.out.print(1);
				else
				{
					System.out.print((char)(count+64));
					count--;
				}
			System.out.println();
		}
	}
}