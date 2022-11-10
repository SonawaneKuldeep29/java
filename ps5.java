import java.util.Scanner;

class demo5
{
	void input(int x)
	{
		System.out.println("first function is called");
	}
	void input(int a,int b)
	{
	System.out.println("Second function is called");	
	}
}
public class ps5 {
	public static void main(String[] args) {
    demo5 d1=new demo5();
    d1.input(4);
    d1.input(4,5);
	}

}
