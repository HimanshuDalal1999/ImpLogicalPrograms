package Multiplication;

public class MultiplicationofTwoNumbers
{
	public static void main(String[]args)
	{
		int A = 10;
		int B = 5;
		int S = 0;
		
		for(int i=1; i<=B; i++)
		{
			S = S+A; //0+10=10, 10+10=20, 20+10=30, 30+10=40, 40+10=50;
		}
		
		System.out.println("Multiplication of Two Numbers is : "+S);
		
	}


}
