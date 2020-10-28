package rv_list;

public class MemberMain {

	public static void main(String[] args) {
		
		Member lee = new Member();
		lee.setMemberId(1001);
		lee.setName("이수경");
		
		Member kim = new Member();
		kim.setMemberId(1002);
		kim.setName("김대호");
		
		Member hong = new Member();
		hong.setMemberId(1003);
		hong.setName("홍세진");
		
		Member bang = new Member();
		bang.setMemberId(1004);
		bang.setName("방건태");
		
		// 회원 추가
		MemberDAO memberList = new MemberDAO();
		memberList.addMember(lee);
		memberList.addMember(kim);
		memberList.addMember(hong);
		memberList.addMember(bang);
		
		// 회원 조회
		memberList.showAllMember();
		
		// 회원 삭제
		memberList.removeMember(1001);

	}

}