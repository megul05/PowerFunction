package PowerFunction;

import java.util.*;

public class PowerFunction {
	
	public static int powerMod(int a,int number,int m)
	{
		if(number == 0)
		{
			return 1;
		}
		int p = powerMod(a,number/2,m);
		if(number%2 ==0)
		{
			return (p*p)%m;
		}
			return (p*p*a)%m;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int number = scan.nextInt();
		int m = scan.nextInt();
		int result = powerMod(a,number,m); 
		System.out.println(result);

		

	}

}
