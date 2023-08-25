package variables;

public class Exam7 {
	public static void main(String[] args) {
		int data = 123, result;
		
		data = data + 10; // 123 + 10;
		
		char ch = 'D';
		ch = (char) (ch + 3);
		result = data + ch; // 133 + 'G'(71);
		
		System.out.println("data : " + data);
		System.out.println("ch : " + ch);
		System.out.println("ch : " + (int)ch);
		System.out.println("result : " + result);
	}
}













