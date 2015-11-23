import java.util.*;
public class reversenumber {
	public static void main(String[] args){
		
		Scanner input =new Scanner(System.in);
		int t=input.nextInt();
		while(t!=0)
		{
			//String str1=new String();
			
			 int n=input.nextInt();
			 int rem,rev=0;
			 //String rev=new StringBuffer(str1).reverse().toString();
			
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			
			System.out.println(rev);
			
			t--;
		}
	}
}
