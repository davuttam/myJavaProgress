import java.util.*;
public class sumFirstNlast {
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		
		while(t!=0)
		{
			
		  String str1=new String(); 
	      str1=input.next();
	      
	      int result=(str1.charAt(0)-'0') + (str1.charAt(str1.length()-1)-'0');
	      
	      System.out.println(result);
	      
	      t--;
		  
		  
		}
		
	}
}
