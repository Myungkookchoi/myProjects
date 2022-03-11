package mk.home.alone;

import java.util.Scanner;

public class AB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("시간 입력");
		int h = sc.nextInt();
		System.out.println("분 입력");
		int m = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();
		int a = (h*3600+m*60+s);
		int b = (m*60+s);
		//경우의 수
		// 3600의 배수 = x시간
		// 3600의 배수가 아니면 x시간 y분 or x시간 y분 z초
		// 3600보다 작은경우
		// 60분 배수 = y분
		// 60분의 배수가 아님 = y분 z초 or z초
		
		if(a>3600) {
			if(b>60) {
				if(s>0)		
					System.out.println(h + "시간 " + m + "분 " + s + "초는 " + a + "초 입니다.");
			}else if(b==60)

			}
		System.out.println(h + "시간 " + m + "분 " + s + "초는 " + a + "초 입니다.");
		sc.close();

	}

}