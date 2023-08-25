package strings;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * "It is a fun java programming" 문자열에서 
		 * 'a'의 개수와 'g'개수와 문자(공백을 제외한)의 총 개수를 출력하시오.
		 */
		
		String data = "It is a fun java programming";
		int aCount = 0, gCount = 0, spaceCount = 0;
		
		for(int i = 0; i < data.length(); i++) {
			if(data.charAt(i) == 'a') {
				aCount++;
			}else if(data.charAt(i) == 'g') {
				gCount++;
			}else if(data.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		
		System.out.println("a의 개수 : " + aCount);
		System.out.println("g의 개수 : " + gCount);
		System.out.println("알파벳의 개수 : " + (data.length() - spaceCount));
		System.out.println("문자열 길이 : " + data.length());
		
	}

}




