
public class Pattern251 
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1)
					if(j%2!=0)
						System.out.print("X");
					else 
						System.out.print("O");
				else
				{
				if(i==n)
					if(j<=2)
					System.out.print(((j%2==0)?"X":"O"));
					else
						System.out.print(" ");
				else
					if(j==1||j==n)
						System.out.print(((i%2!=0)?"X":"O"));
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
