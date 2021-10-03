package 정올;

import java.util.Scanner;

public class For_552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < (2*(3-i)-1); j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
