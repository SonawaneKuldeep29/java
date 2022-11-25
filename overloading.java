class demo51
{
	void print(int x)
	{
		System.out.println("first print function is called");
	}
	void print(int x,int y)
	{
		System.out.println("second print function is called");
	}
}
public class overloading {

	public static void main(String[] args) {
		demo51 obj=new demo51();
		obj.print(5);
		obj.print(4, 5);
	}

}
