import java.util.Scanner;

public class factorial {
	public static void main(String args[])
	{
		
	   System.out.println("enter the Value");
	   
	   fact1 fact1Object=new fact1();
	   
	   Scanner nyk=new Scanner(System.in);
	   
	   int name=nyk.nextInt();
	   
	   int x=fact1Object.fact2(name);
	   
	   System.out.println(x );
	   
		
	}

}
