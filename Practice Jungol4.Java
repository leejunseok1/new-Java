package 정올;

import java.util.Scanner;

/*
 * 한개의 자연수를 입력받아
 * 그  수의 배수를 차례로 10개 출력
 * */
public class For_136 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (int i = 1; i <= 10; i++) {
		System.out.println(n*i+" ");
	}
	
	}

}
