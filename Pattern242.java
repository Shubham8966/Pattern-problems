
public class Pattern242
{

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				for(int k=1;k<=n;k++)
				{
						for(int l=1;l<=n;l++)
					{
							if((i%2!=0&&k%2!=0)||(i%2==0&&k%2==0))
						System.out.print("*");
							else
								System.out.print(" ");
					}
				System.out.print(" ");
				}
			System.out.println();	
			}
		System.out.println();
		}
	}

}
