package arrays;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("생성할 배열의 길이를 입력 : ");
		int count = sc.nextInt();
		
		int[] arr = new int[count];
		System.out.println(arr.length + "개의 배열이 생성되었습니다.");
		
		System.out.println("데이터를 입력하세요.");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 데이터 :  ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("배열 데이터 : ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("입니다.");
	}
}











