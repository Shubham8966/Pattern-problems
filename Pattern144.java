/*
    1
   01
  101
 0101
10101
*/

class Pattern144
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			System.out.println();
		}
	}
}