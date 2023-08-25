package variables;

public class Exam9 {
	public static void main(String[] args) {
		byte b = 97;
		short s = 20;
		char c = 'A';
		
		float f = 1.23f;

		s = b;
		c = (char)b; // char(0 ~ 65535),  byte(-128 ~ 127)
		s = (short)c; // char(0 ~ 65535), short(-32768 ~ 32767) 
		double d = 5.11;
		f = (float)5.11;
		f = (float)d;
	}
}













