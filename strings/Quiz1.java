package strings;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * "Have a nice day Have a nice day Have a nice day" 
		 * 위 문자열에서 a의 위치를 저장 하여 출력 하시오. 
		 * 결과 : 1, 5, 13, 17, 21, 29, 33, 37, 45
		 */
		String data = "Have a nice day Have a nice day Have a nice day" ;
		int[] indexs = new int[data.length()];
		int index = 0;
		
		for(int i = 0; i < data.length(); i++) {
			if(data.charAt(i) == 'a') {
				indexs[index++] = i;
			}
		}
		
		for(int i = 0;  i < index; i++)
			System.out.print(indexs[i] + " ");
	}

}




