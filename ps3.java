import java.util.Scanner;

class stroperation
{
	String s1="welcome";
	String s2="home";
	String s3="home";
	
	void read()
	{
	int length = s1.length();
	String joinstr=s1.concat(s2);
	boolean result1=s1.equals(s2);
	boolean result2=s2.equals(s3);
		
		System.out.println("length of s1 String is :-" + length);
		System.out.println("addition of two string is :-"+joinstr);
		System.out.println("str 1 or str 2 are same :-"+result1);
		System.out.println("str 2 or str 3 are same :-"+result2);
	}
}
public class ps3 {

	public static void main(String[] args) {
		stroperation obj=new stroperation();
		obj.read();
	}

}