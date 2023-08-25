package arraylists;

import java.util.ArrayList;

public class Exam03 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		/*
		 * Wrapper Class
		  - Byte
		  - Short
		  - Character
		  - Integer
		  - Long
		  - Float
		  - Double
		 */
		
		Integer data1 = 10;
		Integer data2 = 20;
		int data5 = 100;
		
		Double data3 = 1.1;
		Double data4 = 2.2;
		
		list.add(10);
		list.add(data2);
		list.add(data5);
		System.out.println("리스트의 저장된 데이터 수 : " + list.size());
		for(int i = 0; i < list.size() ;i++)
			System.out.println("데이터 : " + list.get(i));

		for(int i : list) {
			System.out.println("데이터 : " + i);
		}
		
	}

}





