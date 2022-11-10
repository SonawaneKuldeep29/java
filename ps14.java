import java.util.Scanner;

class arms
{
	int n,i,sum=0,r,temp;
	Scanner sc=new Scanner(System.in);

	void read()
	{
		System.out.println("enter number");
		n=sc.nextInt();
		temp=n;
	}
	void display()
	{
		while(n>0)
		{
			r=n%10;
			sum = sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.print("number is Armstrog");
		}
		else
		{
			System.out.print("number is not Armstrog");
		}
	}
}
public class ps14 {

	public static void main(String[] args) {
		arms obj=new arms();
		obj.read();
		obj.display();
	}

}
