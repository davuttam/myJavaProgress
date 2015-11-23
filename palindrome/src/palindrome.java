import java.util.Scanner;
public class palindrome {
	public static void main(String[] args){
		Scanner uttam=new Scanner(System.in);
		int rem,n,i,count=0,sum=0;
		
		int l=uttam.nextInt();
		int r=uttam.nextInt();
		
		for(i=l;i<=r;i++)
		{
	    int result=0;
		    n=i;
		while(n>0)
		{
		rem=n%10;
		result=result*10+rem;
		n=n/10;
		}
		
		if(result==i)
		{
			count++;
			sum=sum+i;
			
		}
	    }
		System.out.println("palindrome"+"  " + count +"sum of all palindrome"+ sum+1);
	}

}
