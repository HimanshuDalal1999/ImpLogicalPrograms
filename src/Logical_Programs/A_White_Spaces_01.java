package Logical_Programs;

public class A_White_Spaces_01 
{
	public static void main(String[]args)
	{
		String A = "A B C D E F G H I J K L M N O P Q R T S U V W X Y Z";
		int Count = 0;
		
		for(int i=0; i<=A.length()-1; i++)
		{
			char C = A.charAt(i);
			if(C==' ')
			{
				Count++;
			}
			
		}
		
		System.out.println(Count);
		
		}
}
