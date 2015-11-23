import java.util.*;
import java.lang.*;
import java.io.*;

public class array {
	public static void main(String args[]) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[100005];
		int arr2[]=new int[100005];
		int res[]=new int[size];
		int i=0,j=0,sum=0,x,y=0;
		
		for(int k=0;k<size;k++)
		{
			arr[k]=in.nextInt();
		}
		
	//	for(int k=0;k<size;k++)
		//{
			//System.out.println("heelo"+ arr[k]);
		//}
		
		Arrays.sort(arr);
		
		
		//arr1[0]=0;
		
	
		while (arr[0]/(i+1)!=0)
		{
			
			x=arr[0]/(i+1);
			
			if((i==0) || (arr1[i-1]!=x) )
			{
				
				arr1[i]=x;
			
			}
			i++;
		}
		
	
		//System.out.println("hello" + arr[1]);
		
		while (arr[1]/(j+1)!=0)
		{
			             
			x=arr[1]/(j+1);
			               if((j==0) || (arr2[j-1]!=x))
							{
							arr2[j]=x;
							}
		               j++;
		}
		
	//	System.out.println("hi"+ arr[0]);
		
		
		for(i=0;i<arr1.length;i++)
		{
		 for(j=0;j<arr2.length;j++)
		 {
			 if(arr1[i]==arr2[j])
			 {
				 y=arr1[i];
				 break;
			 }
			
		 }
		 if(y==arr1[i])
		 {
			 break;
		 }
		}
		
		System.out.println("hi hello"+ arr[0]);
		
		for(i=0;i<arr.length;i++)
		{
			j=1;
			while(j>0)
			{
				if(arr[i]/j==y)
				{
					res[i]=j;
					break;
				}
				j++;
			}
		}
		
		System.out.println(y);
		
		for(i=0;i<res.length;i++)
			System.out.println(res[i]);
		
		
		for(int counter: res)
		{
			sum+=counter;
		}

		System.out.println("result of min"+ sum);
}

}
