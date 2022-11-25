import java.util.Scanner;
class demo41
{
	int a,b,c,sum;
	void input()
	{
		a=5;
		b=5;
	}
	demo41(int x)
	{
		c=x;
	}
	void output()
	{
		sum=a+b+c;
		System.out.println(sum);
	}
	protected void finalized()
	{
		System.out.println("inside demo41 class");
		System.out.println("object getting distroyed");
	}
}
public class consfinalizemetod {

	public static void main(String[] args) {
		demo41 obj=new demo41(5);
		obj.input();
		obj.output();
		System.out.println("inside main metod");
	}

}
