package test1;

public class Test {

	public static void main(String[] args) {
		//Car c =new Car(); �� ���� �ʴ´� ������ interface�� ��ü�� ������ �Ұ��� �ϹǷ�
		//AutoBike a = new AutoBike(); ���� �߻�Ŭ������ ��ü�� ������ �Ұ����ϴ�.
		//�׷��Ƿ� �ڽ� Ŭ�������� ��ü�� �������ִ� ���̴�.
		Honda h = new Honda(); // Honda�� abstract�� ���� �ʰ� ����� �����Ƿ� ��ü ������ �����ϴ�.
		
		SonCar s = new SonCar(); // SonCar���� ����� �����Ƿ� ��ü ������ �����ϴ�.
		s.maxSpeed();
		DaughterCar d = new DaughterCar();
		d.maxSpeed();
		
		Car c = new SonCar();
		c.maxSpeed(); //������ �̷��Ե� �����ϴ�. Polymorpizm (������) �θ�Ŭ������ �������ϰ� �ڽ� Ŭ������ ������ش�.
		// �� �ڷῡ ���ؼ� �� ã�ƺ����� ���� �١ڡ�

	}

}
