//Write java program to convert cgpa to percentage ?

import java.util.Scanner;

class CgpatoPercentage  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the CGPA:");

		float cgpa = sc.nextFloat();

		//Logic

		float percentage = cgpa*9.5f;

		System.out.println("CGPA to Percentage is=" +percentage);

	}
}
