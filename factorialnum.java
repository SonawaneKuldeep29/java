import java.util.Scanner;
public class factorialnum {

	public static void main(String[] args) {
      int num,fact=1,i;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter number :- ");
      num=sc.nextInt();
      
      for(i=1;i<=num;i++)
      {
    	  fact=fact*i;
      }
      System.out.println("factorial number of "+num+" is :  "+fact);
	}

}
