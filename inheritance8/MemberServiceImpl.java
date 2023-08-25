package inheritance8;

import java.util.ArrayList;

public class MemberServiceImpl implements IMemberService{
	private MemberDaoImpl memberDao;
	private int index;
	
	public MemberServiceImpl() {
		memberDao = new MemberDaoImpl();
	}
	
	@Override
	public void insert(String email, String name, String mobile) {
		index = memberDao.findIndexByEmail(email);
		if(index == -1) {
			MemberDTO member = new MemberDTO();
			member.setEmail(email);
			member.setMobile(mobile);
			member.setName(name);
			
			memberDao.insert(member);
			System.out.println(email + "은/는 등록되었습니다.");
		}else {
			System.out.println(email + "은/는 등록된 정보입니다.");
		}
	}

	@Override
	public void selectEmail(String email) {
		index = memberDao.findIndexByEmail(email);
		if(index != -1) {
			MemberDTO member = memberDao.selectEmail(index);
			System.out.println("이메일 : " + member.getEmail());
			System.out.println("이름 : " + member.getName());
			System.out.println("전화번호 : " + member.getMobile());
		}else {
			System.out.println("등록된 정보가 아닙니다.");
		}
	}

	@Override
	public void delete(String email) {
		index = memberDao.findIndexByEmail(email);
		if(index != -1) {
			memberDao.delete(index);
			System.out.println(email + "님 정보가 삭제되었습니다.");
		}else {
			System.out.println("등록된 정보가 아닙니다.");
		}
		
	}
	@Override
	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll();
		
		if(members.isEmpty()  == false) {
			System.out.println("=== 회원 목록 ===");
			for(int i = 0; i < members.size(); i++) {
				MemberDTO member = members.get(i);
				System.out.println("이메일 : " + member.getEmail());
				System.out.println("이름 : " + member.getName());
				System.out.println("전화번호 : " + member.getMobile());
				System.out.println();
			}
		}else {
			System.out.println("등록된 정보가 없습니다. 등록 후 이용하세요.");
		}
		
	}

	@Override
	public void update(String email, String name, String mobile) {
		index = memberDao.findIndexByEmail(email);
		if(index != -1) {
			memberDao.update(index, name, mobile);
			System.out.println(email + "님 정보가 수정되었습니다.");
		}else {
			System.out.println("등록된 정보가 아닙니다.");
		}
		
		
	}


}
