package mk.home.alone;

import com.human.dto.Owner2;
import com.human.dto.Tree2;
import java.util.Scanner;

public class TEST01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요. >>");
		String name = sc.next();
		System.out.println("나이를 입력해주세요. >>");
		int age = sc.nextInt();
		System.out.println("전화번호를 입력해주세요. >>");
		String PN = sc.next();
		System.out.println("나무의 이름을 입력해주세요. >>");
		String tName = sc.next();
		sc.close();

		Owner2 o1 = new Owner2(name, age, PN);

		Tree2 t1 = new Tree2(tName, 4, 4, 50, 7, 200, o1);

		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. %s를 만드는데 %dGold가 필요합니다." + "\n"
						+ "이 나무의 주인은 %s이고, %d살이며, 전화번호는 %s입니다.",
				t1.name, t1.time, t1.exp, t1.all, t1.now, t1.name, t1.gold, o1.O_name, o1.O_age, o1.O_pn));

	}

}
