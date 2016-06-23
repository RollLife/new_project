package test;

public class Calc { // method overloading 메소드 오버로딩이다.
	static void plus(int a, int b){
		System.out.println(a+b);
	}
	static void plus(double a,double b){
		System.out.println(a+b);
	}
	/*오버로딩 조건
	 * 1. 메소드 이름이 같아야 한다.
	 * 2. 매개변수 데이터 타입이 달라야한다.
	 * 3. 매개변수 개수가 달라야한다.
	 * 4. 리턴타입을 오버로딩으로 정의하질 않는다.(
	 * static void plus(){} 할때 void가 리턴 타입이다
	 * 예를들어 static void plus / static int plus 라면 오버로딩이 성립되질 않는다. 
	 */
	//오버로딩이 쓰이는 곳은 println과 생성자 수업을 하였을 때이다.
	//이름이 다르면 모든 메소드 이름을 기억해야 하기때문에 이름을 같게 만들어준것이다.
	//println도 마찬가지 오버로딩을 이용하여 int, double, string 등 다양한 데이터 타입을 사용할 수 있게 만들어 준것이다.
	//만약 println을 오버로딩을 하지 않고 만들었더라면 우리는 그것을 하나하나씩 다 쳐야했을것이다(메소드 이름 ex) static void println(매개변수))=>String, int
}
