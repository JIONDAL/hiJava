package arraylists;

import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(1.1);
		list.add("문자열");
		list.add('문');
		
		System.out.println("데이터 : " + list.get(0));
		System.out.println("데이터 : " + list.get(1));
		System.out.println("데이터 : " + list.get(2));
		System.out.println("데이터 : " + list.get(3));

		Object data1 = 1;
		Object data2 = 1.1;
		
		int data3 = (int)data1;
		double data4 = (double)data2;
		
	}

}





