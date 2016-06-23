package test1;

public class SonCar implements Car{ //상속 (extends가 아닌 ) implements로 해주어야 한다. interface니까.
	public void maxSpeed(){
		System.out.println("시속 4000km");
		//이것도 오버라이딩이랑 비슷해보이지만 재정의가 아닌 구현이라고 명명한다.
	}
}
