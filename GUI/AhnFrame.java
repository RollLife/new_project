package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AhnFrame extends Frame {
	Button addI,addP,Cancle; // ��� ����
	Label li;
	TextField ID , PW;
	public AhnFrame(){
		setLayout(new FlowLayout()); //���̾ƿ����� ���� ���ϰ� ����ϰ� ���� ���� ���ǵǾ��ִ����� ���ϰ� ��밡���ϰ� �������(������ ��ư�� ��ġ������ �������ְ� �ؾ��ϴµ� �����൵�� ) (�˻��غ���)
		addI = new Button("���̵� �Է�"); // addI��ư�� ���� �߰�
		addI.addActionListener(new AhnHandler()); // �Ű������� ActionListener�� �ʿ��ϴ�.
		//�Ű������δ� Ŭ���� �̸��� �־���Ѵ�.
		addP = new Button("�н����� �Է�"); // addP��ư�� ���� �߰�
		addP.addActionListener(new AhnHandler());
		Cancle = new Button("���");	  // Cancle��ư�� ���� �߰�
		Cancle.addActionListener(new AhnHandler());
		li = new Label("���̵�");
		ID = new TextField(10); //TextField ��ü ��ȣ �ȿ��� �÷����� �ʿ�� �Ѵ� (�ƹ��͵� ������ ������ ���� ���� ũ��� �ȴ�. (Text���� ��))
		PW = new TextField(10);
		
		add(li);
		add(ID);
		add(PW);
		add(addI); // b1��ư ����
		add(addP); // b2��ư ����
		add(Cancle);
	}// ������ ����
	
	public class AhnHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource()==addI){
				ID.setText("���̵�");
			}else if(arg0.getSource()==addP){
				PW.setText("�н�����");
			}else if(arg0.getSource()==Cancle){
				ID.setText("");
				PW.setText("");
			}
			
		} // ActionListener�� �ִ� �޼ҵ带 �������־�� �Ѵ�.
		
		// �����Ǹ� �ؼ� �޼ҵ带 ������־�� �Ѵ�.
	}
}
