package inheritance5;

// 추상메서드들을 갖고 있는 클래스를 인터페이스라고 함
public interface IEmployee {
	/*
	 * public abstract void method1();
	 * public abstract는 생략 가능
	 */
	void method1();
	void method2();
	int getSalary();
	
	/*
	 * 상수와 같은 형식의 데이터를 변수로 만들어 쓸때 사용함.
	 * public static final double PI = 3.14;
	 * public static final는 생략 가능
	 */
	double PI = 3.14;
	
}














