import java.util.Scanner;

class demo
{
	public void get()
	{
	int num,i,fact=1;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
	System.out.println("factorial of given number is "+fact);
	}
}
public class ps1 {
	public static void main(String[] args) {
		demo d1=new demo();
		d1.get();
	}
}