package Logical_Programs;

public class F_Prime_Number_06 
{
	public static void main(String[]args)
	{
		int NUM = 11;
		int CNT = 0;
		
		for(int i=2; i<NUM; i++)
		{
			if(NUM%i==0)
			{
				CNT++;
				break;
			}
		}
		
		if(CNT==1)
		{
			System.out.println(" Given Number "+NUM+" is NOT prime Number");
		}
		else
		{
			System.out.println(" Given Number "+NUM+" is PRIME Number");
		}	
		
	}



}
