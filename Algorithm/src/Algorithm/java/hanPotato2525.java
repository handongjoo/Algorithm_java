package Algorithm.java;

import java.util.Scanner;

public class hanPotato2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int hour = A + (B+C)/60;
		int minutes = (B+C) % 60;
		
		if (hour > 23) {
			System.out.println(hour - 24 + " " + minutes);
		} else if (hour <= 23) {
			System.out.println(hour + " " + minutes);
		}
	}
}
