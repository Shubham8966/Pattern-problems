/*
54321
44321
33321
22221
11111
*/

class Pattern132
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
				if(i>j)
					System.out.print(j);
				else
					System.out.print(i);
			System.out.println();
		}
	}
}