package mk.home.alone;
//문제 1. 숫자를 하나 입력 받아 홀수 인지 짝수 인지 구하는 프로그램을 구하여라.

//문제 2. 숫자 2개를 입력 받아 첫번째 숫자가 두번째 숫자의 배수인지 아닌지 출력하는
//프로그램을 구하여라.
//문제 3. a 원을 동전으로 바꾸면 500원짜리 몇 개 100원짜리 몇 개가 되는가?
//문제 4. 500원짜리 n개 100원짜리 m개 총 얼마인가?
//문제 5. n초를 입력 받아 시분초로 바꿔보자.
//문제 6. n시간 m분 l초는 총 몇초인가?

import java.util.Scanner;

public class TEST12 {
	public static void Q1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 2 == 0)
			System.out.println("짝수");
		else if (a % 2 == 1)
			System.out.println("홀수");
		else if (a == 0)
			System.out.println("a는 0");
		sc.close();
	}

	public static void Q2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			if (a % b == 0)
				System.out.println("a는 b의 배수입니다.");
			else if (a % b == 0)
				System.out.println("a는 b의 배수가 아닙니다.");
		} else if (a < b) {
			if (b % a == 0)
				System.out.println("a는 b의 배수입니다.");
			else if (b % a == 0)
				System.out.println("a는 b의 배수가 아닙니다.");
		}
		sc.close();

	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a / 500;
		int c = a % 500;
		int d = c / 100;
		if (c == 0)
			System.out.println(String.format("500원짜리 %d개가 필요합니다.", b));
		else if (b != 0)
			System.out.println(String.format("500원짜리 %d개와 100원짜리 %d개가 필요합니다", b, d));
		sc.close();
	}

	public static void Q4() {
		Scanner se = new Scanner(System.in);
		int a = se.nextInt();
		int b = a / 3600;
		int c = a % 3600;
		int d = c / 60;
		int e = c % 60;
		if (c == 0)
			System.out.println(b + "시간입니다.");
		else if (e == 0)
			System.out.println(b + "시간, " + d + "분 입니다.");
		else if (e != 0)
			System.out.println(b + "시간, " + d + "분, " + e + "초 입니다.");
		se.close();
	}

	public static void Q5() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a * 5;
		System.out.println(String.format("500원짜리 %d개는 100원짜리 %d개입니다.", a, b));
		sc.close();
	}

	public static void Q6() {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int m = sc.nextInt();
		int h = sc.nextInt();
		System.out.println(h + "시간 " + m + "분" + c + "초는 " + h * 3600 + m * 60 + c + "초 입니다.");
		sc.close();
	}

}
