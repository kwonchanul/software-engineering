package Rhythm;

import javax.swing.*;

public class Frame extends JFrame {
	
	final int f_widgh = 600;	// 창의 넓이 설정
	final int f_hight = 800;	// 창의 높이 설정
	GameHandler handle ;
	
	Frame(){
		
		handle = new GameHandler(this); //핸들러 생성 및 권한 인계
		init(); 						//기본 설정
			
	};
	
	private void init(){
		setTitle("자바 리듬 게임");								//타이틀바 이름 설정 메소드
		setSize(f_widgh,f_hight); 							//창의 크기 지정 메소드
		setResizable(false);	 							//창의 크기 조절 여부 설정 메소드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//닫기버튼 옵션 설정
		setVisible(true);									//창 출력 여부 메소드
		}

}
