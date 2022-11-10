import java.io.*;
import java.util.Scanner;

public class ps11 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 1 num:-");
		a=sc.nextInt();
		System.out.println("enter 2 num:-");
		b=sc.nextInt();
		
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero operation cannot possible.");
		}
	}

}
