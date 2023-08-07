package Algorithm.java;

import java.util.Scanner;

public class hanPotato2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int M = in.nextInt();
		
		if (H > 0 && M >= 45) {
			M = M-45;
		} else if (H > 0 && M < 45) {
			H = H-1;
			M = 60 - (45 - M);
		} else if (H == 0 && M >= 45) {
			M = M-45;
		} else if (H == 0 && M < 45) {
			H = 23;
			M = 60 - (45 - M);
		} 			
		System.out.println(H +" "+ M);

	}

}
