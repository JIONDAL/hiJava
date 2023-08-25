package operators;

public class Exam6 {

	public static void main(String[] args) {
		int data1, data2, data3;

		data1 = 10;
		data2 = ++data1;

		data1 = 10;
		data3 = data1++;
		
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		System.out.println("data3 = " + data3);
		data1 = 10;
		data2 = 20;
		
		int total = ++data1 + data2++;
		System.out.println("total : " + total);
		System.out.println("data2 = " + data2);
		
		for(int i = 0; i < 10; ++i) {
			System.out.println(i);
		}
	}
}









