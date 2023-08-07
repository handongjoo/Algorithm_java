package Algorithm.java;

import java.util.Scanner;

public class hanPotato9498 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		
		String result = (score >= 90) ? "A" : 
							(score >= 80) ? "B" :
							(score >= 70) ? "C" :
							(score >= 60) ? "D" : "F";
		System.out.println(result);

	}

}
