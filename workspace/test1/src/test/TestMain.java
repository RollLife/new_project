package test;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("�ȳ��ϼ���.");
		String b = new String("�ȳ��ϼ���.");
		
		String c = "�ȳ��ϼ���.";
		String d = "�ȳ��ϼ���.";
		
		System.out.println(a==b);// ������ �ٸ��� ������ False�� ����
		System.out.println(c==d);
		System.out.println(a.equals(b)); // ���� ��
		//System.out.println(args[0]); args�� ���� �־�� ��
		System.out.println(a.equals(c)); // ���� ���ϱ⶧���� �̰� ���� �ȴ� ������ �׳� == �� �ϸ� ���� �ʴ´�.
		
	}

}
