///Write a java program to find out perimeter of Circle?

import java.util.Scanner;

//Perimeter of circle = 2 pie r

class  PerimeterofCircle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the radius:");
		int r = sc.nextInt();

		//Logic

		double perimeter = 2 * 3.14 * r;

		System.out.println("Perimeter of circle is =" +perimeter);
	}
}
