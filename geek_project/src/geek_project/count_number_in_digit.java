package geek_project;

import java.util.Scanner;

public class count_number_in_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Digit");
       int n=sc.nextInt();
       int count=0;
       while(n!=0)
       {
    	   n=n/10;
    	   count++;
       }
       System.out.println(count);
	}

}
