//Find out cube of a given Number?
 
 import java.util.Scanner;

class  CubeofNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the Num:");
		int n = sc.nextInt();

		//Logic

		int cube= n*n*n;

		System.out.println("Cube of given num is:" + cube);
	}
}
