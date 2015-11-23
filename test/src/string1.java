import java.util.*;
public class string1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		
		/* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            
            double number = Double.parseDouble(input);
            int number2 = Integer.parseInt(input);
            
            System.out.println("Square root of input number " +  input + " is: " + Math.sqrt(number));
            
            //Not really necessary in this case but since we want to 
            //write clean code...
            reader.close();
		 * 
		 * 
		 */
		
		//String crax=new String();
	     int n=in.nextInt();
	     
	     int crax[]=new int[n];
		
		
		int sum=0;
		
		for(int j=0;j<n;j++)
		   crax[j]=in.nextInt();
		
		
		for(int i:crax)
			 sum=sum+i;
		
		System.out.println(sum);
		
	}
}
