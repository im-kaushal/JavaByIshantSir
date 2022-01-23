

import java.util.*;

class countDigits {

	
	static int countDigits(int x)
	{
		int res = 0;

		while(x > 0)
		{
				x = x / 10;

				res++;
		}	

		return res;
	}

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		

		System.out.println("There are " +countDigits(number) +" digits in your number");

	}
}