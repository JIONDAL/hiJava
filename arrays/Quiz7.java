package arrays;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		int[] ages = new int[5];
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i+1+"번째 정보 입력");
			System.out.print("이름 : "); names[i] = sc.next();
			System.out.print("나이 : "); ages[i] = sc.nextInt();
		}
		
		for(int i = 0; i < ages.length-1; i++) {
			for(int j = i + 1; j < ages.length; j++) {
				if(ages[i] > ages[j]) {
					int tmp = ages[i];
					ages[i] = ages[j];
					ages[j] = tmp;
					
					String sTmp = names[i];
					names[i] = names[j];
					names[j] = sTmp;
				}
			}
		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(i+1+" 정보");
			System.out.println("이름 : " + names[i] + ", 나이 : " + ages[i] + "세");
		}
	}
}











