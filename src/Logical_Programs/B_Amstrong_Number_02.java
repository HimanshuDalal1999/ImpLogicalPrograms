package Logical_Programs;

public class B_Amstrong_Number_02
{
	public static void main(String[] args) 

	{
			
			int NUM = 371;
			int SUM = 0;
			
			for(int i=NUM; i>0; i = i/10)
			{
				int REM = i % 10;
				SUM = SUM + (REM*REM*REM);
			}
			
			if(NUM==SUM)
			{
				System.out.println(" Given Number "+NUM+" is Amstrong Number ");
			}
			else
			{
				System.out.println(" Given Number "+NUM+ " is NOT Amstrong Number ");
			}
			
			
		}


}
