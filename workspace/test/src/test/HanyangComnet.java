package test;

public class HanyangComnet {
	String studentNumber;
	int height;
	
	public void setHeight(int height){
		if (height<0){
			this.height = 100;
		}
		else{
			this.height = height;
		}
	}
	// Ű�� 0 ���Ϸ� �峭 ģ ��쿡�� height�� 100���� �������.
	// this�� ����� ����Ų��. �Ű������� ȥ������ �ʰ� ��������� �����ϱ����� this�� ����Ѵ�.
	
	public int getHeight(){
		return this.height;
	}
	// getHeight�� �޾ƿ��� �޼ҵ带 �ϳ� �� �����.
	// set���δ� �ҷ��ü� ���� �����̴�.
	
}
