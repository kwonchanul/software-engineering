// git 연습하느라 주석좀 달자


package game;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

	
	final int f_widgh = 600;	// 창의 넓이 설정
	final int f_hight = 800;	// 창의 높이 설정
	Thread titleth ;
	JPanel titlepn, gamepn;
	
	
	
	Frame(){
		setTitle("자바 리듬 게임");		//타이틀바 이름 설정 메소드
		setSize(f_widgh,f_hight); 	//창의 크기 지정 메소드
		setResizable(false);	 	//창의 크기 조절 여부 설정 메소드 
		setLayout(new FlowLayout());
		titlepn = new Title();
		setContentPane(titlepn);
		
		setVisible(true);			//창 출력 여부 메소드
			
	};
	
	/*
	final int frame_width = 806;  //창의 테두리때문에 실제 패널 오차 계산
	final int frame_height = 628;
	JPanel titlepn, selmpn, gamepn, resultpn;
	Thread titleth, selmth, gameth, resultth, musicth;
	String dir_data = getClass(),getResource(""),getPath()+"..\\data\\"; //상대 경로를 알아내기 위한
	Toolkit tk = Toolkit.getDefaultToolkit(); //다용도 툴킷
	Graphics g, buffg;
	Image buffimage;

	frame(){
	setTitle("자바 리듬 게임 - 프레이야");
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
