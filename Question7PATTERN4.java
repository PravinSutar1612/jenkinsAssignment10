package Assignment2;
/*     *
      ***
    *****
  *******
*********
 * 
 */
public class Question7PATTERN4 
{
	public static void main(String[] args) 
	{
		int k=0;
		for(int i=1;i<=9;i=i+2)
		{
			k=k+1;
			for(int j=k;j<5;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
