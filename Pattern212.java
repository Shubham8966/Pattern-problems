/*
AAAAAAAAA
bbbb bbbb
CCC   CCC
dd     dd
E       E
 */
public class Pattern212
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				for(int j=1;j<=((n*2)-1);j++)
					System.out.print((char)(i+((i%2!=0)?64:96)));
			}
			else
			{
				for(int j=i;j<=n;j++)
					System.out.print((char)(i+((i%2!=0)?64:96)));
				for(int j=1;j<=(((i-1)*2)-1);j++)
					System.out.print(" ");
				for(int j=i;j<=n;j++)
					System.out.print((char)(i+((i%2!=0)?64:96)));
			}
			System.out.println();
		}
	}
}
