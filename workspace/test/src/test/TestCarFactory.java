package test;

public class TestCarFactory {

	public static void main(String[] args) {
		/*CarFactory sonata = new CarFactory("소나타","블랙");
		CarFactory abvante = new CarFactory("아반테","레드");
		CarFactory grandeur = new CarFactory("그렌져","화이트");
		//마지막은 매개변수를 써주지않는다 스태틱이기 때문에(증가되었음)
		System.out.println(sonata);
		System.out.println(abvante);
		System.out.println(grandeur);
		*/
		
		CarFactory[] car = new CarFactory[5];
		//데이터 타입이 CarFactory[] 인것이다.
		car[0] = new CarFactory("소나타","블랙");
		car[1] = new CarFactory("아반테","레드");
		car[2] = new CarFactory("그랜져","노랑");
		car[3] = new CarFactory("말리부","그린");
		car[4] = new CarFactory("크루즈","하양");
		
		for(CarFactory Ahn : car){//데이터 타입이 CarFactory 원래는 ex) int a : list // Ahn에 초기값 하나하나씩 넣어주는 것이다.
			System.out.println(Ahn);
		}
	}

}
