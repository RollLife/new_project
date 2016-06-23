package test;

public class Person {
	String name;
	int age;
	
	public Person(){
		this.name = "이름없는 사람";
		this.age = 5500;
	}
	//기본 생성자이기 때문에 private를 써도 접근이 가능하다.
	
	public Person(int age){
		this.name = "이름없음";
		this.age = age;
	}
	
	public Person(String name, int age){
		this.name =  name;
		this.age = age;
	}

	public String toString(){
		return name +"("+age+")";
	}
	//toString함수는 객체를 출력할때 출력되는 함수이다.
}
