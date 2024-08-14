////Write a java program to find out Area of Circle?
import java.util.Scanner;
class  AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		int r =sc.nextInt();
		//Logic
		float area = 3.14f * r * r;
		System.out.println("Area of Circle is =" +area);
	}
}
