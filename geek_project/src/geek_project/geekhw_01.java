package geek_project;

public class geekhw_01 {

	public static void main(String[] args) {
		int num1=500;
		int num2=2000;
		int num3=1000;
		// gretest number between three numbers
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1);
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println(num2);
		}
		else if(num3>num2 && num3>num1)
		{
			System.out.println(num3);
		}
	}

}
