//Wrrite a java program to find out Square of a Given Number?
import java.util.Scanner;
class Example2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		//Logic
		int square= n*n;
			System.out.println("Square of a given Number is = "+square);
	}
}
