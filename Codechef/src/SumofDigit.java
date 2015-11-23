import java.util.*;
public class SumofDigit {
	public static void main(String[] args)
		{

		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t!=0)
		{
		
		String s=new String();
		 long sum=0;
		 
		 s=input.next();
		 
		 for(int i=0;i<s.length();i++)
			  sum=sum+(s.charAt(i)-'0');
			 
			 	
		 System.out.println(sum);
		
		 t--;
		}
		
	  }
}
