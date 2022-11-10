import java.util.Scanner;

class palindrome
{
	int n,i,rev=0,rem,temp;
	Scanner sc=new Scanner(System.in);

	void read()
	{
		System.out.println("enter number");
		n=sc.nextInt();
		temp=n;
	}
	void display()
	{
		while(n!=0)
		{
			rem=n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.print("number is palindrome");
		}
		else
		{
			System.out.print("number is not palindrome");
		}
	}
}
public class ps15 {

	public static void main(String[] args) {
		palindrome obj=new palindrome();
		obj.read();
		obj.display();
	}
}