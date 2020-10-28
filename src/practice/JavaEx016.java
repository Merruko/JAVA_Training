package practice;

public class JavaEx016 {
	
	/*  문제16]
	 
	※ 다음의 문제들에 맞추어 메서드를 정의하고 main() 에서 호출하여 
	   실행하도록 해보세요. (출력결과는 자유롭게 만들어 보세요 ^^)
	책을 나타내는 Book 클래스를 정의하시오.
	제목과 저자를 나타내는 private필드를 가지고
	get메서드와 set메서드를 가지고 있다.   */
	
	public class Book  {
		
		private String title;
		private String author;
		
		public void setTitle (String title) {
			
			this.title = title;
			
			}
		
		public void setAuthor (String author) {
			
			this.author = author; 
			
			}
		
		public String getTitle () {
			
			return title; 
			
		}
	
		public String getAuthor () {
			
			return author;  
			
		}

		
	}


}