package test;

public class CarFactory {
	static int serialnumber = 0;
	String model;
	String color;
	int mySerialNumber;
	//������� ����
	
	public CarFactory(String model,String color){
		//�Ű������� mySerialNumber�� ������ �ʴ´� ������ ++�� ���ٰ��̱� ������
		this.model = model;
		this.color = color;
		this.mySerialNumber = ++serialnumber; // serialnumber�� static�̱� ������ �Ű������� ������ �ʾƵ� ������ �ȴ� �����̰��� �������� ���ذ�	
	}
	public String toString(){
		return "�� ���� : "+model+"("+color+"SerialNumber: AA13123B"+mySerialNumber+")";
		//return ������ (mySerialNumber+1)�� �ϸ� ���������� ���Ѵ�.
	}
}
