import java.util.*; 
public class communication {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		int t=input.nextInt();
		
		while(t!=0)
		{
		
			int x1,x2,h1,y1,y2,h2,r;
			double result1,result2,result3;
			r=input.nextInt();
			x1=input.nextInt();
			y1=input.nextInt();
			
			h1=input.nextInt();
			h2=input.nextInt();
			
			x2=input.nextInt();
			y2=input.nextInt();
			
			
			
			result1=Math.sqrt(Math.pow((Math.abs(x1-h1)),2)+ Math.pow((Math.abs(y1-h2)),2));
			
			result2=Math.sqrt(Math.pow((Math.abs(x2-h1)),2)+ Math.pow((Math.abs(y2-h2)),2));
		
			result3=Math.sqrt(Math.pow((Math.abs(x1-x2)),2)+ Math.pow((Math.abs(y1-y2)),2));
			
			if((result1<=r && result2<=r) || (result3<=r) )
				System.out.println("yes");
			else
				System.out.println("no");
			
			
		t--;
		}
	}
}
