package methodExam;

import java.util.ArrayList;
import java.util.HashMap;
// Data Access Object
public class QuizDAO3 {
	private HashMap<String, QuizDTO3> members = new HashMap<>();

	public void put(QuizDTO3 quizDto) {
		members.put(quizDto.getId(), quizDto);
	}
	
	public QuizDTO3 get(String id) {
		QuizDTO3 dto = members.get(id);
		return dto;
	}
	
	public void remove(String id) {
		members.remove(id);
	}
	
	public ArrayList<QuizDTO3> values() {
		ArrayList<QuizDTO3> list = new ArrayList<>( members.values() );
		return list;
	}

	public void update(QuizDTO3 quizDto) {
		members.put(quizDto.getId(), quizDto);
	}
}








