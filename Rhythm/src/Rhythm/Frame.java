package Rhythm;

import javax.swing.*;

public class Frame extends JFrame {
	
	final int f_widgh = 600;	// â�� ���� ����
	final int f_hight = 800;	// â�� ���� ����
	GameHandler handle ;
	
	Frame(){
		
		handle = new GameHandler(this); //�ڵ鷯 ���� �� ���� �ΰ�
		init(); 						//�⺻ ����
			
	};
	
	private void init(){
		setTitle("�ڹ� ���� ����");								//Ÿ��Ʋ�� �̸� ���� �޼ҵ�
		setSize(f_widgh,f_hight); 							//â�� ũ�� ���� �޼ҵ�
		setResizable(false);	 							//â�� ũ�� ���� ���� ���� �޼ҵ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//�ݱ��ư �ɼ� ����
		setVisible(true);									//â ��� ���� �޼ҵ�
		}

}
