package 정올;

import java.util.Scanner;

//10이하의 과목수 n이 주어진다.
//정수로 주어진 n개 과목의 점수를 입력받음
// 실수 평균을 구하여 출력
// 평균이 80점이상이면 pass
// 80점미만이면 fail이라고 출력
//평균은 반올림하여 소수첫째자리까지 출력
public class For_546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		double sum = 0;
		if(n <= 10) {
			int x = 0;
			for (int i = 0; i < n ; i++) {
				x = sc.nextInt();
				sum += x;
			}
		}
		double avg = (double)(sum/n);
		System.out.println("avg : " + avg);
		
		if(avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		
	}

}
