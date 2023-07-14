
package Sam;

import java.util.Scanner;

public class polindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("123");
		int num = sc.nextInt();
		int orgnum = num;
		int rev = 0;
		while (num!=0) 
		{
			rev = rev*10+num%10;
			
			num = num/10;		
		}
		if (orgnum==num) 
		{
			
			System.out.println(orgnum + "polin");
			
		}
		else {
			System.out.println(orgnum +  "nooPolin");
			
		}
		
	}
}






