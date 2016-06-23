package test;

public class CarFactory {
	static int serialnumber = 0;
	String model;
	String color;
	int mySerialNumber;
	//멤버변수 선언
	
	public CarFactory(String model,String color){
		//매개변수엔 mySerialNumber을 써주지 않는다 이유는 ++을 해줄것이기 때문에
		this.model = model;
		this.color = color;
		this.mySerialNumber = ++serialnumber; // serialnumber는 static이기 때문에 매개변수에 써주지 않아도 공유가 된다 지금이것은 증가식을 써준것	
	}
	public String toString(){
		return "차 기종 : "+model+"("+color+"SerialNumber: AA13123B"+mySerialNumber+")";
		//return 값에서 (mySerialNumber+1)을 하면 증가값으로 변한다.
	}
}
