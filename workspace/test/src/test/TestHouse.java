package test;

public class TestHouse {

	public static void main(String[] args) {
		House prugio = new House();
		prugio.weight = 500;
		prugio.height = 50;
		prugio.name = "Ǫ������";
		
		House raemian = new House();
		raemian.weight = 300;
		raemian.height = 30;
		raemian.name = "���̾�";
		
		//Ctrl + Alt + ȭ��ǥŰ �Ʒ� ������ �����
		System.out.println(raemian.name+"("+"���� : "+raemian.weight+","+"���� : "+raemian.height+")");
		System.out.println(prugio.name+"("+"���� : "+prugio.weight+","+"���� : "+prugio.height+")");
		

	}

}
