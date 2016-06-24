package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IpFrame extends Frame {
	TextField ip;
	Label txtIp;
	Button input;
	TextArea ta;
	public IpFrame(){
		setLayout(new FlowLayout());
		
		txtIp  = new Label("아이피 : ");
		ip = new TextField(10); //컬럼 수
		input = new Button("눌러");
		input.addActionListener(new IpHandler());
		ta = new TextArea(150,150);
		
		add(ip);
		add(txtIp);
		add(input);
		add(ta);
	}
	
	public class IpHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(Integer.parseInt(ip.getText().split("\\.")[0])>=0 && Integer.parseInt(ip.getText().split("\\.")[0])<=126){
				ta.setText("입력하신 IP는 A클래스입니다.");
			}else if(Integer.parseInt(ip.getText().split("\\.")[0])>=128 &&
					Integer.parseInt(ip.getText().split("\\.")[0])<=191){
				ta.setText("입력하신 IP는 B클래스입니다.");
			}else if(Integer.parseInt(ip.getText().split("\\.")[0])>=192 &&
					Integer.parseInt(ip.getText().split("\\.")[0])<=223){
				ta.setText("입력하신 IP는 C클래스입니다.");
			}else if(Integer.parseInt(ip.getText().split("\\.")[0])>=224&&
					Integer.parseInt(ip.getText().split("\\.")[0])<=239){
				ta.setText("입력하신 IP는 D클래스입니다.");
			}else{
				ta.setText("잘못된 IP 입니다.");
			}
			
		}
		
	}

}
