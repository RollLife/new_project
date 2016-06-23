package test;

public class Son extends Father {
	//상속받을 클래스 extends 상속할 클래스
	public Son(){
		System.out.println("아들 기본 생성자");
	}
	void printNickName(){
		System.out.println("쎄끈빠끈");
	}
	//Father.java에 printNickName 멤버 메소드가 있음에도 불구하고 자식클래스에서 먼저 멤버 를 제출한다.
	//이러한것을 오버라이딩(재정의)라고 부른다.
}
