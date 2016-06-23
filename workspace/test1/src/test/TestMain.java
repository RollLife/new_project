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
		System.out.println(a.equals(b)); // 값을 비교
		//System.out.println(args[0]); args에 값을 넣어야 함
		System.out.println(a.equals(c)); // 값을 비교하기때문에 이것 역시 된다 하지만 그냥 == 로 하면 되질 않는다.
		
	}

}
