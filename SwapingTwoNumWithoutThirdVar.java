//Swaping of two numbers without third variable ?

import java.util.Scanner;

class SwapingTwoNumWithoutThirdVar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the First Num:"); //20
		
		int a = sc.nextInt();

		System.out.println("Enter the Second Num:"); //30

		int b= sc.nextInt();

		//Swaping Logic

		a = a+b;                               //a = 20+30 = 50
		b = a-b;                               //b = 50-30 = 20
		a = a-b;                               //a = 50-20 = 30


		System.out.println("After Swaping a="+a+ "and b="+b);
	}
}
