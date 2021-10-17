package 정올;

import java.util.Scanner;

// 자연수 n을 입력받아 "출력예"와 같이 출력되는 프로그램
// 
public class For_142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < (n-1); i++) {
			for (int j = (n-1); j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
