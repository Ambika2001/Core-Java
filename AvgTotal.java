//Write a java program to accept 6 marks of a student then find out total and average ?

import java.util.Scanner;

class  AvgTotal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		int [] marks = new int[6];

		int total = 0;

		 // Accepting 6 marks from the user

		for (int i =0; i<6; i++)
		{
		
		System.out.println("Enter marks" + (i+1) +":");

		marks[i] = sc.nextInt();

		total += marks[i];
		}

		//calculating average

		float average = total / 6f;

		//Displaying Total and Average

		System.out.println("Total marks:" + total);
		System.out.println("Average marks:" + average);
	}
}
