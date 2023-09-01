/*
k
lg
mhd
nieb
ogfca
*/
public class Pattern72
{
	public static void main(String[] args) 
	{
	
				int n=5;
				int count=(n*(n-1)/2)+1;
				for(int i=n;i>=1;i--)
				{
					int c=count;
					for(int j=n;j>=i;j--)
					{
						System.out.print((char)(c+96));
						c-=j;
					}
					System.out.println();
					count++;
				}

		}

}