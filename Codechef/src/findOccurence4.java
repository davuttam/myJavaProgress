import java.util.*;
public class findOccurence4 {
		   public static void main(String[] args)
		   {
		      
			   Scanner input=new Scanner(System.in);
			   
			   int t=input.nextInt();
			   while(t!=0)
			   {
			   int count=0;
		      String s=new String();
		      s=input.next();
		      for(int i=0;i<s.length();i++)
		    	  if(s.charAt(i)=='4')
		    		  count++;
		      System.out.println(count);
			  t--;
			   }
			   
		   }
}
