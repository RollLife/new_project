package test;

public class TestCarFactory {

	public static void main(String[] args) {
		/*CarFactory sonata = new CarFactory("�ҳ�Ÿ","��");
		CarFactory abvante = new CarFactory("�ƹ���","����");
		CarFactory grandeur = new CarFactory("�׷���","ȭ��Ʈ");
		//�������� �Ű������� �������ʴ´� ����ƽ�̱� ������(�����Ǿ���)
		System.out.println(sonata);
		System.out.println(abvante);
		System.out.println(grandeur);
		*/
		
		CarFactory[] car = new CarFactory[5];
		//������ Ÿ���� CarFactory[] �ΰ��̴�.
		car[0] = new CarFactory("�ҳ�Ÿ","��");
		car[1] = new CarFactory("�ƹ���","����");
		car[2] = new CarFactory("�׷���","���");
		car[3] = new CarFactory("������","�׸�");
		car[4] = new CarFactory("ũ����","�Ͼ�");
		
		for(CarFactory Ahn : car){//������ Ÿ���� CarFactory ������ ex) int a : list // Ahn�� �ʱⰪ �ϳ��ϳ��� �־��ִ� ���̴�.
			System.out.println(Ahn);
		}
	}

}
