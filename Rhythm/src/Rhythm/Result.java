package Rhythm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Result extends JPanel {
	private JButton mainmenu, restart;
	JPanel menues;
	public Result() {
		//점수 띄우는 내용 삽입
		init();
		
	}
	
	void init(){
		menues = new JPanel();
		this.setLayout(new BorderLayout());
		mainmenu = new JButton("메인 메뉴"); // 메인메뉴 버튼
		restart = new JButton("다시 시작"); // 다시 시작 버튼
		menues.add(mainmenu);
		menues.add(restart);
		this.add(menues, BorderLayout.SOUTH);
	}
}
	public void restart(){
		handle.backTitle();
	}
}
