package arrays;

import java.util.Random;

public class Quiz8 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[][] arr = new int[5][5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10);
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(26) + 97;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print((char)arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}











