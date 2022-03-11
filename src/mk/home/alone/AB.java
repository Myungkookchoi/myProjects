package mk.home.alone;

import java.util.Scanner;

public class AB {

	public static void main(String[] args) {

		System.out.println("문제 5. 입력 받은 숫자의 절대값을 출력하는 프로그램을 만들어 보자.");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double a1 = Math.abs(a);
		System.out.println(a1);
		sc.close();
	}

}