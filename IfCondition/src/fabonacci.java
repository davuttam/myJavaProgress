import java.util.*;
public class fabonacci {
public static void main(String args[]){
	int x=1,y=2,n,result=1;
			  long j=2;
	Scanner temp=new Scanner(System.in);
	System.out.println("enter the no. of series");
	n=temp.nextInt();
	if(n==2)
		{
		result=2;
		System.out.println("this is result \t"+result);
		}
	else
	{
	for(int i=2;i<n && result<=4000000 ;i++)
	{
		result=x+y;
		if(result%2==0)
		{
		   j= j + result;
			
		}
			
		x=y;
		y=result;
	}
	System.out.println("this is result \t" +j);
	}
	}
}
