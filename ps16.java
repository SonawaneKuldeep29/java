import java.util.Scanner;
class perfectnum
{
	long sum=0,n;
	int b=1;
	Scanner sc=new Scanner(System.in);
	
	void read()
	{
		System.out.println("enter number");
		n=sc.nextInt();
	}
	void display()
	{
		while(b < n)
		{
			if(n%b==0)
			{
				sum = sum + b;
			}
			b++;
		}
		if(n==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}
	}
}
public class ps16 {
	public static void main(String[] args) {
		perfectnum obj=new perfectnum();
		obj.read();
		obj.display();
	}
}
