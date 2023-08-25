package operators;

public class Exam9 {

	public static void main(String[] args) {
		int data = 1;
		// shift 연산자(비트)
		/*
		0000 0001
		
		data = data << 1;
		0000 0010
		
		data <<= 1;
		0000 0100
		
		data <<= 3;
		0010 0000
		 */
		
		data = data << 1;
		System.out.println("1. data <<= 1 : " + data);
		data <<= 1;
		System.out.println("2. data <<= 1 : " + data);
		data <<= 3;
		System.out.println("3. data <<= 3 : " + data);
		
		
		/*
		0010 0000(32)
		
		data >>= 1;
		0001 0000(16)
		
		data >>= 1;
		0000 1000(8)
		 */
		System.out.println();
		data >>= 1;
		System.out.println("1. data >>= 1 : " + data);
		data >>= 1;
		System.out.println("2. data >>= 1 : " + data);
		data >>= 1;
		System.out.println("3. data >>= 1 : " + data);
	}
}









