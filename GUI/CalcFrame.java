package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.IpFrame.IpHandler;

public class CalcFrame extends Frame {
	TextArea area;
	TextField left;
	TextField right;
	Button plus;
	Button subtract;
	Button multiply;
	Button divide;
	Button clear;
	public CalcFrame(){
		setLayout(new FlowLayout());
		
		area = new TextArea(50,50);
		left = new TextField(2);
		plus = new Button("+");
		plus.addActionListener(new CalcuRater());
		subtract = new Button("-");
		subtract.addActionListener(new CalcuRater());
		multiply = new Button("*");
		multiply.addActionListener(new CalcuRater());
		divide = new Button("/");
		divide.addActionListener(new CalcuRater());
		clear = new Button("clear");
		clear.addActionListener(new CalcuRater());
		right = new TextField(2);
		
		add(left);
		add(plus);
		add(subtract);
		add(multiply);
		add(divide);
		add(right);
		add(clear);
		add(area);		
		
	}
	public class CalcuRater implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==plus){
				area.setText(String.valueOf(Integer.parseInt(left.getText())+Integer.parseInt(right.getText())));
			}else if(e.getSource()==subtract){
				area.setText(String.valueOf(Integer.parseInt(left.getText())-Integer.parseInt(right.getText())));
			}else if(e.getSource()==multiply){
				area.setText(String.valueOf(Integer.parseInt(left.getText())*Integer.parseInt(right.getText())));
			}else if(e.getSource()==divide){
				area.setText(String.valueOf(Integer.parseInt(left.getText())/Integer.parseInt(right.getText())));
			}else if(e.getSource()==clear){
				area.setText("");
			}else{
				area.setText("잘못된 계산입니다.");
			}
			
		}
		
	}
}
