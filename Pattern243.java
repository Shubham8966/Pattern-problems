
public class Pattern243
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
					if((i%2!=0&&k%2!=0)||(i%2==0&&k%2==0))
					for(int l=1;l<=n;l++)
						if(j==1 || j==n || l==1 || l==n)
						System.out.print("*");
						else
						System.out.print(" ");
					else
						for(int m=1;m<=n;m++)
						System.out.print(" ");
				}
			System.out.println();	
			}
		System.out.println();
		}
	}

}
