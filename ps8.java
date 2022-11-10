import java.util.Scanner;

class demo8
{
	int a;
	public void get()
	{
    Scanner sc=new Scanner(System.in);
  
    System.out.print("enter number");
	a=sc.nextInt();
	}
}
class derived extends demo8
{
     void put()
	{
	System.out.println("entered number is :-"+a);
	}
}
public class ps8 {

	public static void main(String[] args) {
		derived d1=new derived();
		d1.get();
		d1.put();
	}

}
