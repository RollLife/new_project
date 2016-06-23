package test;

public class StaticModel {

	public static void main(String[] args) {
		Statictest s1 = new Statictest();
		Statictest s2 = new Statictest();
		Statictest s3 = new Statictest();
		
		s1.a = 1;
		s2.a = 2;
		s3.a = 3;
		
		Statictest.hohoho(); //메소드에서  hohoho를 출력해 주었다.
		
		s1.hoho = 100;  // 선언을 함으로써 모든 값들에게 공유가 되는것이다.
		System.out.println(s3.hoho); //s1만 입력을하면 s1 s2 s3모두다 그 값을 공유한다 이유는 static으로 선언을 하였기 때문이다.
		System.out.println(Statictest.hoho); //역시 s1 s2 s3뿐만이 아닌 class도 공유를 하기 때문에 100 이 출력되는 것이다.
		
		//static은 서로 공유를 하는것이다.
	}

}
