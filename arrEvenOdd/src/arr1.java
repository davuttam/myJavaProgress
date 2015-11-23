import java.util.*;
public class arr1 {
	public static void main(String[] args){
		
		Scanner inp=new Scanner(System.in);
		int n,i;
		n=inp.nextInt();
		
		int arr[]=new int[n] ;
		for(i=0;i<arr.length;i++){
			
			arr[i]=inp.nextInt();
		}
		
	     Arrays.sort(arr);
		
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
