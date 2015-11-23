import java.util.*;
public class test {
	public void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		int  x1=in.nextInt(),y;
		int    x2=in.nextInt();
		
		test test1=new test();
		
		System.out.println( "hello out");
		
		//y=funct(x1,x2);
		y=test1.funct(x1,x2);
		
		System.out.println(y + "out");
	}
	
	public int funct(int lent,int brdth){
		
		int g;
		g=lent*brdth;
		
		 return g;
		
	}
}
