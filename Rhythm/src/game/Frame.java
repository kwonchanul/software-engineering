package game;

import javax.swing.*;

public class Frame extends JFrame {
	
	final int f_widgh = 600;	// 창의 넓이 설정
	final int f_hight = 800;	// 창의 높이 설정
	GameHandler handle ;
	
	Frame(){
		setTitle("자바 리듬 게임");		//타이틀바 이름 설정 메소드
		setSize(f_widgh,f_hight); 	//창의 크기 지정 메소드
		setResizable(false);	 	//창의 크기 조절 여부 설정 메소드
		handle = new GameHandler(this);
		//this.getContentPane().add(Titlepn);
		//setContentPane(Titlepn);
		
		setVisible(true);			//창 출력 여부 메소드
			
	};
	
	public void changePanel(){
		
		this.removeAll();
		this.setContentPane(getContentPane());
		
		
	}
	
	
	

}
