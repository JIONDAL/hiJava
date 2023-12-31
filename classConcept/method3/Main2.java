package method3;

public class Main2 {
	public static void main(String[] args) {
		/*
		 * static 
		 * : 프로그램이 시작 후 바로 준비됨
		 * 준비됨 == 메모리에 올려두어서 바로 실행 가능한 상태
		 * 사용목적 : 공용, 어디서든 바로 접근해서 사용하기 위해
		 * 장점 : 바로 접근해서 사용
		 * 단점 : 프로그램 시작부터 종료까지 메모리를 확보함.
		 * 
		 * new Sub2();
		 * 메모리에 Sub2안에 메서드를 모두 메모리 공간 확보
		 *  장점 : 필요한 순간에 메모리 공간 확보, 
		 *  사용되지 않으면 알아서 정리함(Garbage Collection)
		 *  단점 : 클래스가 갖고 있는 멤버들이 모두 메모리 공간 확보
		 */
		
		// static 예약어를 사용하지 않은 경우
//		Sub2.method1(); 사용 불가능
		Sub2 sub2 = new Sub2();
		Sub2 sub22 = new Sub2();
		Sub2 sub222 = new Sub2();
		sub2.method1();
		
		// static 예약어를 사용한 경우
		Sub2.method2();
		/*
		 *  new Sub2();
		 *  위와 같이 인스턴스를 생성 후에도 
		 *  사용가능하나  권장하지 않음.
		 */
		sub2.method2();
	}
}





