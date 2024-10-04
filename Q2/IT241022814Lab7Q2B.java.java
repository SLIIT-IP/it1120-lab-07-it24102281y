public class IT24102281Lab7Q2B
{
	public static void main(String[] args) 
	{
		int x, y;
		for(x = 1; x < 6; x=x+1)
		{
			System.out.print(x+" - ");
			for(y = 1; y <= x; y=y+1)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}