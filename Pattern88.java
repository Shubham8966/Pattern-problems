/*
onlie
mkhd
jgc
fb
a
*/
public class Pattern88
{
	public static void main(String[] args) 
	{
	
				int n=5;
				int count=(n*(n+1)/2);
				for(int i=1;i<=n;i++)
				{
					int c=count;
					for(int j=i;j<=n;j++)
					{
						System.out.print((char)(c+96));
						c-=j;
					}
					System.out.println();
					count-=i+1;
				}

		}

}