// git �����ϴ��� �ּ��� ����


package game;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

	
	final int f_widgh = 600;	// â�� ���� ����
	final int f_hight = 800;	// â�� ���� ����
	Thread titleth ;
	JPanel titlepn, gamepn;
	
	
	
	Frame(){
		setTitle("�ڹ� ���� ����");		//Ÿ��Ʋ�� �̸� ���� �޼ҵ�
		setSize(f_widgh,f_hight); 	//â�� ũ�� ���� �޼ҵ�
		setResizable(false);	 	//â�� ũ�� ���� ���� ���� �޼ҵ� 
		setLayout(new FlowLayout());
		titlepn = new Title();
		setContentPane(titlepn);
		
		setVisible(true);			//â ��� ���� �޼ҵ�
			
	};
	
	/*
	final int frame_width = 806;  //â�� �׵θ������� ���� �г� ���� ���
	final int frame_height = 628;
	JPanel titlepn, selmpn, gamepn, resultpn;
	Thread titleth, selmth, gameth, resultth, musicth;
	String dir_data = getClass(),getResource(""),getPath()+"..\\data\\"; //��� ��θ� �˾Ƴ��� ����
	Toolkit tk = Toolkit.getDefaultToolkit(); //�ٿ뵵 ��Ŷ
	Graphics g, buffg;
	Image buffimage;

	frame(){
	setTitle("�ڹ� ���� ���� - �����̾�");
	setSize(frame_width,frame_height);
	setResizable(false);
	setLocation(300,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	titlepn = new title();
	setContentPane(titlepn);

	setVisible(true);
	}

	public void callgame(String song, int diff, boolean autoplay){
	gamepn = new gameing(song, diff, autoplay);
	setContentPane(gamepn);
	setVisible(true);
	}

	public void callmusicsel(){
	selmpn = new musicsel();
	setContentPane(selmpn);
	setVisible(true);
	}

	public void callresult(int maxcombo, int score, int dcool, int dgood, int dbad, int dfall, boolean die, String songname, String songtitle){
	resultpn = new result(maxcombo, score, dcool, dgood, dbad, dfall, die, songname, songtitle);
	setContentPane(resultpn);
	setVisible(true);
	}
	*/
	
}
