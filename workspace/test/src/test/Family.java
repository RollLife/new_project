package test;

public class Family {

	public static void main(String[] args) {
		Son s = new Son();
		s.printNickName();//상속되면 상속한 곳의 것을 사용 가능하다.
		//Son 클래스에 extends 를 썼더니 상속되고
		//Father 클래스에 있던 메소드를 쓸수 있게됨
		//기본생성자는 아빠가 먼저 나오지만 멤버 메소드는 자식 클래스가 먼저 나온다.
	}

}
