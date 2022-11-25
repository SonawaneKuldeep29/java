import java.util.Scanner;
class strop
{
	void print()
	{
	String s1="welcome";
	String s2="home";
	String s3="WELCOME";
	String s4="home";
	
		
	int len=s1.length();
	String joinstr=s1.concat(s2);
	boolean res1=s1.equals(s2);
	boolean res2=s2.equals(s4);
	String upper=s1.toUpperCase();
	String lower=s3.toLowerCase();
	
	System.out.println(" str len= "+len);
	System.out.println("join string :-"+joinstr);
	System.out.println("result first :-"+res1);
	System.out.println("result second :-"+res2);
	System.out.println("string in upper case "+upper);
	System.out.println("string in lower case "+lower);
	}
}
public class stringoperations {

	public static void main(String[] args) {
		strop obj=new strop();
		obj.print();
	}

}
