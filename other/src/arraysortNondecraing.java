import java.util.*;
public class arraysortNondecraing {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		
		int arr[]=new int[size];
		int i,temp=0,temp1,y=1,x=1,count=0;
		
		
		for(i=0;i<size;i++)
			arr[i]=in.nextInt();
		
		Arrays.sort(arr);
	
		
		for(i=0;i<arr.length;i++)
			{
				if(arr[i]>=0)
				{
					temp=i;
					break;
				}
			}
		
		temp1=temp-1;
		
		//for(i=1;i<=arr.length;i++)
		i=1;
		while(count<arr.length)	
		{
			
			if((i%2==0) && (x==1))
			{
				System.out.println(arr[temp]);
				count++;
				temp++;
				if(temp>arr.length){
					
					x=0;
				}
			}
			else
			{
				if(y==1)
				{
					System.out.println(arr[temp1]);
				   count++;
					temp1--;
					if(temp1<0)
						y=0;
						
					
				}
			}
		
			i++;
		}
		
				
		
		
	}
}
