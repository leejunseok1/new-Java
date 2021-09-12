public class For_548 {
	public static void main(String[] args) {
		for (int i = 2; i < 5; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.printf("%d * %d = %2d   ",i,j,i*j);
			}
			System.out.println();
		}
	}

}
//-----------------130
package 정올;

import java.util.Scanner;

public class For_130 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		if(x <= 10) {
			x = sc.nextInt();
			for (int i = 0; i < x; i++) {
				System.out.println("JUNGOL");
			}
		}
	}
}
//---------------131
package 정올;

import java.util.Scanner;

public class For_131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > y) {
			for (int i = y; i <= x; i++) {
				System.out.print(i + " ");
			}
		} else if (y > x) {
			for (int j = x; j < y; j++) {
				System.out.print(j + " ");
			}
		}

	}

}
//-----------------132
public class For_132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			if (i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
