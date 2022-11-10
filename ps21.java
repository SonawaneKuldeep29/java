abstract class demoa
{
	int a,b;
	void get()
	{
		a=20;
		b=20;
	}
	abstract public void show();
}
class demob extends demoa
{
	public void show()
	{
		System.out.println(a+b);
	}
}
public class ps21 {

	public static void main(String[] args) {
		demob obj=new demob();
		obj.get();
		obj.show();
	}

}
