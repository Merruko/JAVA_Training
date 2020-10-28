package rv_list;

import java.util.ArrayList;

public class MemberDAO {
	// Member를 사용, 관리하는 클래스 dao(data access object)
	private ArrayList<Member> arrayList;
	
	public MemberDAO() {
		arrayList = new ArrayList<>();
	}
	
	// 회원 추가 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 회원 전체 조회
	public void showAllMember() {
//		for(int i=0; i<arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			System.out.println(member);
//		} 방법1
		
		for(Member member : arrayList)
			System.out.println(member);
	} // 방법2 향상된 for문
	
	// 회원 삭제 메서드
	public boolean removeMember(int memberId) {
		
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int dbMemberId = member.getMemberId();	// 이미 생성된 memberId
			if(dbMemberId == memberId) {	// 매개변수로 요청받은 memberId
				arrayList.remove(i);
				System.out.println(memberId + "가 삭제되었습니다.");
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}