package operators;

public class Exam8 {

	public static void main(String[] args) {
		int data1 = 55, data2 = 22, or = 0, and = 0, xor = 0;
	/*	
		0011 0111
		0001 0110
	or	------------
		0011 0111
		
		===========================
		0011 0111
		0001 0110
	and	------------
		0001 0110	
		
		===========================
		0011 0111
		0001 0110
	xor	------------
		0010 0001			
	*/	
		or = data1 | data2;
		and = data1 & data2;
		xor = data1 ^ data2;
		
		System.out.println("data1 | data2 = " + or);
		System.out.println("data1 & data2 = " + and);
		System.out.println("data1 ^ data2 = " + xor);
	}
}









