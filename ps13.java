import java.util.Scanner;

class fibo
{
	int num,n1=0,n2=1,i,f;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.println("enter number");
		num=sc.nextInt();
	}
	void display()
	{
		System.out.print(n1);
		
		for(i=1;i<=num;i++)
		{
			f=n1+n2;
			n1=n2;
			n2=f;
			System.out.print(" "+n1);
		}
	}
}
public class ps13 {

	public static void main(String[] args) {
		fibo obj=new fibo();
		obj.read();
		obj.display();
	}

}
