import java.util.Scanner;

//자연수 n을 입력 받고
//1부터 홀수를 차례대로 더해나가면서
//합이 n이상이면 그 떄까지 더해진 홀수의 개수
// 그 합을 출력
public class For_549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		for (int i = 0; sum < n; i++) {
			if (i % 2 == 1) {
				sum += i;
				cnt++;
			}
		}
		System.out.printf("%d %d", cnt,sum);
	}

}
//-------------------------------------------
package 정올;

import java.util.Scanner;

public class For_634 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
