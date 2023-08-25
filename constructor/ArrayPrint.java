package constructor;

public class ArrayPrint {
	/*
	 * 오버로딩(over loding)
	 * 메서드 또는 생성자에서 사용되고 있음
	 * 매개변수의 개수가 다르다면 동일한 이름으로 작성가능
	 * 매개변수의 개수가 같으면 자료형으로 구분되어야 함
	 * 매개변수의 같고, 자료형이 같을 때 변수이름으로는 구분할 수 없음
	 */
	
	public void print(int[] arr) {
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public void print(String[] arr) {
		for(String s : arr)
			System.out.print(s + " ");
		System.out.println();
	}

	public void print(double[] arr) {
		for(double d : arr)
			System.out.print(d + " ");
		System.out.println();
	}

}
