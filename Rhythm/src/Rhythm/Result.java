package Rhythm;

/*************
* author : NGH
**************/
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Result extends JPanel {
	private JButton mainmenu, restart; // 버튼
	private String s = "10";  // 점수. 실험용임
	private Font bold; //글씨체 변수
	JPanel menues; //메뉴 패널. 밑에 깔려있음
	
	public Result() {
		//점수 띄우는 내용
		Label score = new Label();
		score.setText(s);
		score.setAlignment(score.CENTER);
		score.setSize(400, 400);
		bold = new Font("궁서", Font.BOLD, 100);
		this.add(score);
		this.setFont(bold);
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
	/*public void restart(){
		handle.backTitle();
	}
}*/
