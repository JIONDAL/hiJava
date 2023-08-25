package loopWhile;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int select;
		while (true) {
			System.out.println("\n==== 가위 바위 보 게임 ====");
			System.out.println("1.가위 / 2.바위 / 3.보 / 0.종료");
			System.out.print("선택 > ");

			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (select < 1 || select > 3) {
				System.out.println("확인 후 다시 입력하세요.");
				continue;
			}

			int com = (int) (Math.random() * 3 + 1);
			System.out.println("com : " + com);

			System.out.println(" ==== 결과 ==== ");

			switch (select) {
			case 1:
				System.out.println("당신은 가위를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("당신은 바위를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("당신은 보를 선택하셨습니다.");
				break;
			}

			if (com == 1) {
				System.out.println("컴퓨터는 가위를 선택했습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터는 바위를 선택했습니다.");
			} else if (com == 3) {
				System.out.println("컴퓨터는 보를 선택했습니다.");
			}

			if (select == com) {
				System.out.println("비겼습니다.");
			} else if ((select == 1 && com == 3) || (select == 2 && com == 1) || (select == 3 && com == 2)) {
				// 사용자의 승리조건 : 가위 > 보 || 바위 > 가위 || 보 > 바위
				System.out.println("이겼습니다.");
			} else {// 컴퓨터의 승리
				System.out.println("졌습니다.");
			}
		}
	}
}



