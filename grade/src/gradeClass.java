import java.util.*;
public class gradeClass {
	public static void main(String[] arrgs){
		Scanner input=new Scanner(System.in);
		int examwet=70;
		int labwet=20;
		int hwwet=10;
		double examscore;
		double labscore;
		double hwscore;
		double finalgrade;
		System.out.println("enter exam grade:");
		examscore=input.nextDouble();
		labscore=input.nextDouble();
		hwscore=input.nextDouble();
		//finalgrade=input.nextDouble();
		
		examscore=examscore*(examwet/100.0);
		System.out.println("your examscore"+ examscore);
		labscore=labscore*(labwet/100.0);
		hwscore=hwscore*(hwwet/100.0);
		
		finalgrade=examscore+labscore+hwscore;
		
		System.out.println("your final grade is" + finalgrade);
	}

}
