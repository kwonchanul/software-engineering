package Rhythm;

import java.awt.event.ActionListener;

import javax.swing.*;

public class Result extends JPanel {
	private JButton mainmenu, restart;
	

	public Result() {
		//점수 띄우는 내용 삽입 예
		init();
	
		setVisible(true); // 패널이 보임
	}
	
	void init(){
		mainmenu = new JButton("메인 메뉴"); // 메인메뉴 버튼
		restart = new JButton("다시 시작"); // 다시 시작 버튼
		this.add(mainmenu);
		this.add(restart);
	}
}
	public void restart(){
		handle.backTitle();
	}
}
