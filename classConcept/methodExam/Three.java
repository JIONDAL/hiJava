package methodExam;

public class Three {
	private int data;
	
	public void setData(int data) {
		this.data = data;
		// this : 자기 자신, Three 인스턴스, 예약어
		// this는 자기자신의 인스턴스의 참조 값
		/*
		 *  Three three = new Three();
		 *  this == three
		 */
	}

	public int getData() {
		return data;
	}

	public boolean result() {
		if(data % 3 == 0)
			return true;
		
		return false;
	}

}












