package Logical_Programs;

import java.util.Arrays;

public class C_Array_Equal_or_Not_03 
{
	public static void main(String[]args)
	{
		int [] A = {10,20,30,40,50};
		int [] B = {20,40,60,80,100};
		int [] C = {10,20,30,40,50};

		System.out.println(Arrays.equals(A, B));	//false
		System.out.println(Arrays.equals(B, C));	//false
		System.out.println(Arrays.equals(A, C));	//true
			
	}


}
