package loopFor;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력 받아 작은 수 ~ 큰 수의 합계를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		int begin, end, total = 0;
		
		System.out.print("두 수 : ");
		begin = sc.nextInt();
		end = sc.nextInt();
		
		if(begin > end) {
			int tmp = end;
			end = begin;
			begin = tmp;
		}
		
		for(int i = begin; i <= end; i++) {
			total += i;
		}
		System.out.println(begin + " ~ " + end + "의 합계 : " + total);
		
		/*
		 * 수를 입력 받아 소수인지 아닌지 판별해서 출력하세요.
		 */
		System.out.print("수 : ");
		int data = sc.nextInt();
		
		boolean result = true;
		for(int i = 2; i < data; i++) {
			if(data % i == 0)
				result = false;
		}
		
		if(result == true) {
			System.out.println(data + "는/은 소수이다.");
		}else {
			System.out.println(data + "는/은 소수가 아니다.");
		}
		
		String message = data + "는/은 소수이다.";
		for(int i = 2; i < data; i++) {
			if(data % i == 0)
				message = data + "는/은 소수가 아니다.";
		}
		System.out.println(message);
	}

}







