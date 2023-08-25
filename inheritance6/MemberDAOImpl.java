package inheritance6;

import java.util.ArrayList;

public class MemberDAOImpl implements IMemberDAO{
	private ArrayList<String> emails;
	private ArrayList<String> names;
	private ArrayList<String> mobiles;
	
	public MemberDAOImpl() {
		emails = new ArrayList<>();
		names = new ArrayList<>();
		mobiles = new ArrayList<>();
	}

	@Override
	public void insert(String email, String name, String mobile) {
		if(emails.contains(email) == false) {
			emails.add(email);
			names.add(name);
			mobiles.add(mobile);
			System.out.println(email + "님 정보가 등록되었습니다.");
		}else {
			System.out.println("이미 등록된 정보입니다.");
		}
	}

	@Override
	public void selectEmail(String email) {
		int index = emails.indexOf(email);
		if(index != -1) {
			System.out.println("이메일 : " + emails.get(index));
			System.out.println("이름 : " + names.get(index));
			System.out.println("전화번호 : " + mobiles.get(index));
		}else {
			System.out.println("등록된 정보가 아닙니다.");
		}
	}

	@Override
	public void selectAll() {
		if(emails.isEmpty() == false) {
			for(int i = 0; i < emails.size(); i++) {
				System.out.println("이메일 : " + emails.get(i));
				System.out.println("이름 : " + names.get(i));
				System.out.println("전화번호 : " + mobiles.get(i));
			}
		}else {
			System.out.println("등록 후 이용하세요.");
		}
	}

	@Override
	public void delete(String email) {
		int index = emails.indexOf(email);
		if(index != -1) {
			emails.remove(email);
			names.remove(index);
			mobiles.remove(index);
			System.out.println(email + "님 정보가 삭제되었습니다.");
		}else {
			System.out.println("등록된 정보가 아닙니다.");
		}
	}

	@Override
	public void update(String email, String name, String mobile) {
		int index = emails.indexOf(email);
		if(index != -1) {
			names.set(index, name);
			mobiles.set(index, mobile);
			System.out.println(email + "님 정보가 수정되었습니다.");
		}else {
			System.out.println("등록된 정보가 아닙니다.");
		}
	}
	
}









