import java.util.*;
public class Ifclass {
		public static void main(String args[]){
			System.out.println("ENTER the value of hello");
			Scanner hello=new Scanner(System.in); 
			int v=hello.nextInt();
			Ifclass ifobject1=new Ifclass();
			ifobject1.method1(v);
			
	}
		
		public void method1(int x){
			
		
		if(x>=70){
			System.out.println("above than 70 or Gretest number");
		}
		else if(x>=50)
		{
			System.out.println("above than 50");
		}
		else{
			System.out.println("less than 50");
		}
		                 }
}
