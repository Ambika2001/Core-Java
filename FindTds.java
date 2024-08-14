//Write java program to accept one salary then find out 10 % of TDS?

import java.util.Scanner;

class FindTds  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the Salary:");

		int slary = sc.nextInt();

		//Logic           TypeCasting

		float tds = slary * 10f/ 100;      
		
		//int into float

		System.out.println(" 10% of TDS is = "+ tds);
	}
}
