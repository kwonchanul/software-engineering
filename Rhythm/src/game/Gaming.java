package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Gaming extends JPanel implements Runnable {
	JButton b1, b2;
	GameHandler handle;

	public Gaming(GameHandler handle) {
		this.handle = handle;
		
		b1 = new JButton("Gaming");
		b2 = new JButton("일시정지");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				endGame();
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			/*	try {
					handle.pauseGame();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}*/
			}
		});
		this.add(b1);
		this.add(b2);
	}
	
	@Override
	public void run() {
		System.out.println("게임 구동중");
	}

	public void endGame() {
		handle.resultView();
	}
	
}
