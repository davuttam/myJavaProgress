import java.util.Scanner;
public class funct {
		public static void main(String args[])
		{
			
			Scanner in=new Scanner(System.in);
			
			int  x1=in.nextInt(),y;
			int    x2=in.nextInt();
			
			funct test1=new funct();
			
			System.out.println( "hello out");
			
			//y=funct(x1,x2);
			y=test1.functn(x1,x2);
			
			System.out.println(y);
		}
		
		public int functn(int lent,int brdth){
			
			int g;
			g=lent*brdth;
			
			 return g;
			
		}
	}
