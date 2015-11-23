import java.util.*; 
public class newclass{
	public static void main(String[] args){
		
		Scanner out=new Scanner(System.in);
		System.out.println("Enter degree in Celsius");
		
		double celsius = out.nextDouble();
		
		double fahrenheit = celsius * (9/5) + 32;
		
		System.out.println(celsius + " celsius is " + fahrenheit + "degree in fahrenheit");
		
	}

}
