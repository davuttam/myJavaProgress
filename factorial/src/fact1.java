
public class fact1 {
	public int fact2(int name){
		
		if(name==0)
		{
			return 1;
		}
		else
		{
			return name*fact2(name-1);
		}
	}

}
