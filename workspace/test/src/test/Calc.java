package test;

public class Calc { // method overloading �޼ҵ� �����ε��̴�.
	static void plus(int a, int b){
		System.out.println(a+b);
	}
	static void plus(double a,double b){
		System.out.println(a+b);
	}
	/*�����ε� ����
	 * 1. �޼ҵ� �̸��� ���ƾ� �Ѵ�.
	 * 2. �Ű����� ������ Ÿ���� �޶���Ѵ�.
	 * 3. �Ű����� ������ �޶���Ѵ�.
	 * 4. ����Ÿ���� �����ε����� �������� �ʴ´�.(
	 * static void plus(){} �Ҷ� void�� ���� Ÿ���̴�
	 * ������� static void plus / static int plus ��� �����ε��� �������� �ʴ´�. 
	 */
	//�����ε��� ���̴� ���� println�� ������ ������ �Ͽ��� ���̴�.
	//�̸��� �ٸ��� ��� �޼ҵ� �̸��� ����ؾ� �ϱ⶧���� �̸��� ���� ������ذ��̴�.
	//println�� �������� �����ε��� �̿��Ͽ� int, double, string �� �پ��� ������ Ÿ���� ����� �� �ְ� ����� �ذ��̴�.
	//���� println�� �����ε��� ���� �ʰ� ���������� �츮�� �װ��� �ϳ��ϳ��� �� �ľ��������̴�(�޼ҵ� �̸� ex) static void println(�Ű�����))=>String, int
}
