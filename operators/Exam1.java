package operators;

public class Exam1 {

	public static void main(String[] args) {
		int data1 = 9, data2 = 2;
		int total = data1 + data2;
		
		System.out.println(data1 + " + " + data2 + " = " + (data1 + data2));
		System.out.println(data1 + " - " + data2 + " = " + (data1 - data2));
		System.out.println(data1 + " * " + data2 + " = " + (data1 * data2));
		System.out.println(data1 + " / " + data2 + " = " + (data1 / data2)); // 몫
		System.out.println(data1 + " % " + data2 + " = " + (data1 % data2)); // 나머지
		
		/*
		 x % 2 = 0
		 x % 3 = 0
		 x % 4 = 0
		 x % 5 = 0
		 
		 x % 3 = 0,1,2
		 x % 4 = 0,1,2,3
		 x % 5 = 0,1,2,3,4
		 x % 100 = 0~99
		 
		 x % 7 = 7(0~6)
		 
		 7 % (2~6) = 0이 아닌 나머지, 소수다.
		 8 % (2~7) = 0이 나머지로 나온다면 소수가 아니다.
		 
		 8 % 1~8 = 나머지가 0, 약수
		 8 % 1 = 0
		 8 % 2 = 0
		 8 % 3 = 2
		 8 % 4 = 0
		 8 % 5 = 3
		 8 % 6 = 2
		 8 % 7 = 1
		 8 % 8 = 0
		 */
	}

}







