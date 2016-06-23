package test1;

public class Test {

	public static void main(String[] args) {
		//Car c =new Car(); 는 되질 않는다 이유는 interface는 객체가 선언이 불가능 하므로
		//AutoBike a = new AutoBike(); 역시 추상클래스도 객체가 선언이 불가능하다.
		//그러므로 자식 클래스에서 객체를 선언해주는 것이다.
		Honda h = new Honda(); // Honda는 abstract를 쓰지 않고 상속을 했으므로 객체 선언이 가능하다.
		
		SonCar s = new SonCar(); // SonCar역시 상속을 했으므로 객체 선언이 가능하다.
		s.maxSpeed();
		DaughterCar d = new DaughterCar();
		d.maxSpeed();
		
		Car c = new SonCar();
		c.maxSpeed(); //하지만 이렇게도 가능하다. Polymorpizm (다형성) 부모클래스로 선언을하고 자식 클래스로 만들어준다.
		// 이 자료에 대해선 더 찾아보도록 하자 ☆★☆

	}

}
