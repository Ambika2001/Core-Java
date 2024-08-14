//Swaping of two numbers ?

import java.util.Scanner;

class SwapingofNum
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first Num:");
		
		int a = sc.nextInt();

		System.out.println("Enter the Second Num:");

		int b = sc.nextInt();
		
		//Swaping Logic

		int temp =a;
		a=b;
		b=temp;

		System.out.println("After Swaping a ="+a+ " and b ="+b);
	}
}
