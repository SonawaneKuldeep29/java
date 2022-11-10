class parent
{
	void print()
	{
		System.out.println("first class function");
	}
}
class child extends parent
{
	@Override
	void print()
	{
		System.out.println("second class function");
	}
}
public class ps18 {

	public static void main(String[] args) {
		child objb=new child();
		objb.print();
	}

}
