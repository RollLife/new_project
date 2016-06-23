package test;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("안녕하세요.");
		String b = new String("안녕하세요.");
		
		String c = "안녕하세요.";
		String d = "안녕하세요.";
		
		System.out.println(a==b);// 공간이 다르기 때문에 False가 나옴
		System.out.println(c==d);
		
		
	}

}
