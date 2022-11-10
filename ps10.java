import java.util.Scanner;

class outer{

	void outermethod()
	{
		class inner
		{
			void innermethod()
			{
				System.out.println("it is a inner class");
			}
		}
	inner obj=new inner();
	obj.innermethod();
	}
}
public class ps10 {

	public static void main(String[] args) {
		outer oobj=new outer();
		oobj.outermethod();
	}

}
