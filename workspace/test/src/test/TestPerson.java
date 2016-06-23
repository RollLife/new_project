package test;

public class TestPerson {

	public static void main(String[] args) {
		Person Ahn = new Person(); //reference variable
		
		System.out.println(Ahn); //Person.java에서 public person이라는 메소드에서 먼저 초기화를 할 수 있다.
		Ahn.name = "병호";
		Ahn.age = 18;
		
		System.out.println(Ahn);
		//Ahn의 주소값을 toString으로 만들어서 가짜 주소값이 아닌 바꿔서 출력을 하였다.
		
		Person Won = new Person("치영",19);
		System.out.println(Won);
		//생성자 (Person.java)에서 먼저 선언을 해주었기에 (매개변수와 같이) 선언과 동시에 출력이 가능한 상태가 된다.
		
		//Person Jang = new Person(); -오류남   9번줄과10 번 줄을 보게되면 
		//name과 age를 주어주었지만 이것은 주어주지 않았기때문에 안된다
		//선언자에선 레퍼런스 변수를 선언함과 동시에 매개변수를 써주게 되어있는데
		//이곳에선 안써주었기 때문에 오류가 나는 것이다.
	}

}
