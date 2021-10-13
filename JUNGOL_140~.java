package 정올;

import java.util.Scanner;

//정수 20개를 입력받아서 그 합고 평균을 출력하도
//0이 입력되면 20개 이력이 끝나지 않았더라도
//그때까지 입력된 합과 평균을 출력하는 프로그램 작성
//평균은 소수부분은 버리고 정수만 출력
//0이 입력된 경우 0을 제외한 합과 평균을 구한다.
public class For_140 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0, count = 0;
		int avg= 0;
		
		for (int i = 0; i < 20; i++) {
			num = sc.nextInt();
			if(num == 0)
				break;
			count++;
			sum += num;
		}
		avg = sum/count;
		System.out.print(sum + " " + avg);
	}
}
//------------------------
import java.util.Scanner;

//1부터 100까지의 정수 중 한개를 입력받아
//100보다 작은 배수들을 차례로 출력하다가
//10의 배수가 출력되면 프로그램을 종료하도록
public class For_141 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		int mul = 1;
		
		while(true) {
			if(((num*mul)%10) == 0) {
				System.out.print(num * mul + " ");
				break;
			}else if(100 <= (num*mul)) {
				break;
			}
			System.out.print(num *mul + " ");
			mul++;
		}
	}

}
