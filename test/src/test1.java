import java.util.*;
import java.io.*;
public class test1 {
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		
		//int size=in.nextInt();
		int arr[]=new int[50];
		int x;
		
		for(int i=0;i<4;i++)
		{
			arr[i]=in.nextInt();
		}
		
		for(int i=0;i<8;i++)
			System.out.println(arr[i]);
		
	
		x=arr[0]/2;
		System.out.println(x);
		
		while(arr[0]/2!=0)
		{
			System.out.println("hi");
			arr[0]=arr[0]/2;
		}
	
	
	}  
	
}
