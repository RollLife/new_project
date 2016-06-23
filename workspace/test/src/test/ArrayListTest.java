package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); // Ctrl + Shift +o 를 누르면 자동으로 import를 생성해준다.
		Person[] p = new Person[10]; // Person 클래스에 있는것을 객체로 만듬
		
		for(int i=0; i<10; i++){
			p[i] = new Person(i+1); //Person 객체에서 기본 생성자를 설정해주어야한다. 안그럼 오류남
			list.add(p[i]);
		}
		list.add(1);
		list.add(2);
		House h = new House(); // 나는 지금 house 클래스를 모르는 과정에서 실행을 하는것이다.
		list.add(h); // 몰라도 그냥 막넣어 <- list에
		//결과는 house의 레퍼런스 변수가 나오는데 String toString으로 바꿔주자
		
		System.out.println(list);
	}

}
