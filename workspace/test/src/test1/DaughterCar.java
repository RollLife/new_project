package test1;

public class DaughterCar implements Car {
	//재정의 (오버라이딩 ) 멤버 메소드를 써주는것을 해주지 않으면 오류가 난다.
	public void maxSpeed(){
		System.out.println("시속 10km");
	}
}
