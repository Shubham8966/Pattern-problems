
public class Pattern241
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				if(i%2!=0)
						System.out.print(((j%2==0)?" ":"*"));
				else
					System.out.print(((j%2!=0)?" ":"*"));
			System.out.println();
		}
	}
}
