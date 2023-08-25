package operators;

public class Exam7 {

	public static void main(String[] args) {
		int data = 10;
		String result = (data >= 10 || data < 5) ? 
				"참일 때 반환할 문장" : "거짓일 때 반환할 문장";
		
		System.out.println(result);
		
		result = (data % 2 == 0) ? "짝수" : "홀수";
		System.out.println(data + " = " + result);

		data = 9;
		int total = (data % 2 == 0) ? --data : ++data ;
		System.out.println(data + " = " + total);
	}
}









