package game;

import javax.swing.*;

public class Frame extends JFrame {
	
	final int f_widgh = 600;	// â�� ���� ����
	final int f_hight = 800;	// â�� ���� ����
	GameHandler handle ;
	
	Frame(){
		setTitle("�ڹ� ���� ����");		//Ÿ��Ʋ�� �̸� ���� �޼ҵ�
		setSize(f_widgh,f_hight); 	//â�� ũ�� ���� �޼ҵ�
		setResizable(false);	 	//â�� ũ�� ���� ���� ���� �޼ҵ�
		handle = new GameHandler(this);
		//this.getContentPane().add(Titlepn);
		//setContentPane(Titlepn);
		
		setVisible(true);			//â ��� ���� �޼ҵ�
			
	};
	
	public void changePanel(){
		
		this.removeAll();
		this.setContentPane(getContentPane());
		
		
	}
	
	
	

}
