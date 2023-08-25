package loopWhile;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 민수는 369게임이 N까지 규칙을 지키며 진행된다면 그때까지의 들은 박수의 횟수 가 총 몇 번인지 궁금했다.
		 예를 들어 N = 14라면, 3, 6, 9, 13에서 각각 한 번의 박수를 치게 되므로 총 4회
		 N = 36이라면 3, 6, 9, 13, 16. 19. 23. 26. 29. 30. 31. 32. 33. 34. 35, 36에서
		 박수를 치게 되는데 33, 36에서는 두 번 박수를 쳐야 하므로 총 18회가 된다.
		 1 이상의 정수 N에 대하여 369게임을 N까지 규칙을 지키며 진행된다면 그때까지 듣게 되는
		 박수의 총 횟수를 계산하여 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int end = sc.nextInt();
		int count = 0;
		
		for(int i = 3; i <= end; i++) {
			int tmp = i;
			while(true) {
				int j = tmp % 10;
				tmp /= 10;
				
				if(j == 3 || j == 6 || j == 9) {
					count++;
					System.out.println(i);
				}
				if(tmp == 0)
					break;
			}
		}
		
		System.out.println("1 ~ " + end + "까지의 총 횟수는 " + count + "번 입니다.");
	}
}



