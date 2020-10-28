package practice;

/*
 
동물을 나타내는 Animal 클래스를 상속받아 
새를 나타내는 Bird 클래스를 작성하시오.
실행 클래스의 main() 메소드에서
아래의 출력 [결과]와 같이 출력되도록 인스턴스화 하시오.
조건은 아래와 같습니다.
- Bird 클래스는
  "날 수 있어요."를 출력하는 fly() 메소드와
  "곤충을 먹어요"를 출력하는 eat() 메소드를 갖는다.
  
  [결과]
식사를 해요.
곤충을 먹어요.
짹짹이는 날 수 있어요.
*/


class Animal {
	
    public String name;
    
    public Animal ( String name ) {
          this.name = name; 
    }
    
    void eat() {
       System.out.println("식사를 해요.");
   }
}


class Bird extends Animal {
	
	public Bird(String name) {
		
		super(name);
	
	}
	
	@Override
	void eat() {

		super.eat();
		System.out.println("곤충을 먹어요.");
		
	}


	void fly() {
		
		System.out.println(name + "는 날 수 있어요.");
		
	}
	

	}
	


public class JavaEx026 {

	public static void main(String[] args) {
		
		Bird bird = new Bird("짹짹이");
		bird.eat();
		bird.fly();
		
	}

}