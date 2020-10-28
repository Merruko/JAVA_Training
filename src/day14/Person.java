package day14;

public class Person {
	
	public int toshi;
	public String namae;
	public char seibetu;
	public boolean kekkon;
	public int kodomo;
	
	public void setPerson(String n, int a, char g, boolean m, int c) {
		
		namae = n;
		toshi = a;
		seibetu = g;
		kekkon = m;
		kodomo = c;
		
	}
	
	public void printPerson() {
		System.out.println("이 사람의 나이 " + toshi);
		System.out.println("이 사람의 이름 " + namae);
		System.out.println("이 사람의 성별 " + seibetu);
		System.out.println("이 사람의 결혼여부 " + (kekkon ? "기혼" : "미혼")); // kekkon == true ? "기혼" : "미혼" // == true 생략가능
		System.out.println("이 사람의 자녀수 " + kodomo);
	}
	
}