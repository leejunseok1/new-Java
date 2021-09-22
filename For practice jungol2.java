package 정올;

import java.util.Scanner;

// 100이하의 자연수n을 입력
// n개의 정수를 입력
// 평균을 출력
// 평균은 반올림하여 소수 둘째자리까지 출력
public class For_133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //자연수
		int x = 0; // 담을 그릇
		double sum = 0; // 합계
		if(num<=100 && num>=0) {
			for (int i = 0; i < num; i++) {
				x = sc.nextInt();
				sum += x;
			}
		}
		double avg = (double)(sum/num);
		System.out.printf("%.2f", avg);
	}

}
