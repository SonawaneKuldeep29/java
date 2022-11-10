import java.util.Scanner;

class cons
{
	int a,b,sum,c;
	Scanner sc=new Scanner(System.in);
	
	void read()
	{
		System.out.println("enter number 1:-");
		a=sc.nextInt();
		System.out.println("enter number 2:-");
		b=sc.nextInt();
	}
	cons(int x)
	{
		c = x;
	}
	void display()
	{
		sum=a+b+c;
		System.out.println("additoin of 3 number is :-"+sum);
	}
	protected void finalize()
	{
		System.out.println("inside the cons class");
		System.out.println("object getting distroyed");
	}
}
public class ps4
{
	public static void main(String[] args) {
		cons obj=new cons(50);
		obj.read();
		obj.display();
		System.out.println("inside main method");
	}
}