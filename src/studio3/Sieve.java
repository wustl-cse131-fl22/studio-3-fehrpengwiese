package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input value of n: ");
		int n = in.nextInt();
		boolean[] values = new boolean[n];
		//boolean[] index;
		int check;
		for (int i = 0; i < values.length; i++) 
		{
			values[i] = true;
		}

		for (int j = 1; j <= n^0.5;  )
		{
			if (values[k]%2 != 0) {
				index[index2] = k;
			}
			k++;
		}
		
		
		
		
		
	}

}
//check = 2;
//while (check < values[i])
//{
//	if (values[i]%check != 0)
//	{
//		check++;
//	}
//}