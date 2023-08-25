package methodExam;

public class Absolute {
	private int data;
	
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	
	public int getAbs() {
		if(data < 0)
			return data * -1;
		
		return data;
	}
	
	
}
