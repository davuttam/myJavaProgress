import java.util.*;
public class coal {
	public static void main(String[] args)
	{
		Scanner inp=new Scanner(System.in);
		
		int t=inp.nextInt();
		
		while(t!=0)
		{
		int n=inp.nextInt();
		int i,count=1,ch=0;
		int arr[]=new int[n];
		int k=inp.nextInt();
			
		for(i=0;i<arr.length;i++)
			{
			 arr[i]=inp.nextInt();
			}
			
			//Arrays.sort(arr);
			
			for(i=0;i<(arr.length-1);i++)
			{
				if(Math.abs(arr[i]-arr[i+1])<k)
						{
					      count+=1;
						/*  if(ch==1)
						  {
							  ch=0;
						  }*/
						}
				/*	else
					{
						if(ch==0)
						{
						count+=1;
						//System.out.println("hi"+count);
						}
						ch=1;
					}*/
			}
			System.out.println(count);
			
			t--; 
		}
	  }
}
