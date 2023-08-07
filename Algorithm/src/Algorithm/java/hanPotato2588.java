package Algorithm.java;

import java.util.Scanner;

public class hanPotato2588 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B/10)%10));
		System.out.println(A*((B/100)%10));
		System.out.println(A*B);
	}

}
