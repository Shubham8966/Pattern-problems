/*
o
nj
mif
lhec
kgdba
*/
public class Pattern71
{
	public static void main(String[] args) 
	{
	
				int n=5;
				int count=(n*(n+1)/2);
				for(int i=n;i>=1;i--)
				{
					int c=count;
					for(int j=n;j>=i;j--)
					{
						System.out.print((char)(c+96));
						c-=j-1;
					}
					System.out.println();
					count--;
				}

		}

}