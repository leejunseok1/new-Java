package 정올;

import java.util.Scanner;

public class For_543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 2; i <= a; i+=2) {
			System.out.println(i);
		}
	}

}
//---------------------------------------------
package 정올;

import java.util.Scanner;

public class For_544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		
		int sum = 0;
		for (int i = a; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
	}

}
//------------------------------------
package 정올;

import java.util.Scanner;

public class For_545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < 10; i++) {
			 a = sc.nextInt();
			 if (a % 3 ==0) {
				
				 b++;
			 }
			 
			 if (a % 5 ==0) {
			
				 c++;
			 }
		}
	System.out.println("Multiple of 3 : " + b);
	System.out.println("Multiple of 5 : " + c);
	}

}
