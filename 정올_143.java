package 정올;

import java.util.Scanner;

// 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램
public class For_143 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();

		// 위쪽
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < ((2 * (line - i)) - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 아래
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < (line - i - 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < ((2 * i) +1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
