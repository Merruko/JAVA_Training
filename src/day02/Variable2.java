package day02;

public class Variable2 {

	public static void main(String[] args) {
		
		int a = 65;
		char b = 'a';
		
		System.out.println(a); //（結果）65
		System.out.println(b); //（結果）a
		System.out.println((int)b); //（結果）97　← aのコード値
		
		char c = '\u0041';
		System.out.println(c); //　（結果）A　←　uniコード値
		
		// char name = "真田" 　←　エラー　（charは1文字だけ。）
		String name =  "真田"; //　←　可能。Stringはクラスである。（証拠はこれだけ大文字だ。）
		System.out.println(name);
	}
}