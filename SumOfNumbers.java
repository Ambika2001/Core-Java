//Write a java program to perform sum of two  numbers ?
//write a java program to perform sum of two numbers ?

import java.util.Scanner; // package
class SumOfNumbers 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //import from package
		System.out.println("Enter First Number:"); 
		
		//input the number

		int a = sc.nextInt();

		System.out.println("Enter Second Number:");

		//input the number

		int b = sc.nextInt();
		
		//logic
		int c = a+b;

		//output

		System.out.println("sum of Two Numbers is = " +c);
	}
}
