import java.util.Scanner;

interface demo9
{
	void read();
	 void display();
}
class demo91 implements demo9
{
	int a,b,c;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		a=sc.nextInt();
		
		System.out.println("enter 2nd number");
		b=sc.nextInt();
	}
	public void display()
	{
		c=a+b;
		System.out.println("addition is :-"+c);
	}
}
public class ps9 {

	public static void main(String[] args) {
    demo91 d1=new demo91();
    d1.read();
    d1.display();
	}

}