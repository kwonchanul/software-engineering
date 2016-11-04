package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Gaming extends JPanel implements Runnable {
	JButton b;
	GameHandler handle;

	public Gaming(GameHandler handle) {
		this.handle = handle;
		
		b = new JButton("Gaming");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				endGame();
				
			}
		});
		this.add(b);
	}
	
	public void endGame() {
		handle.resultView();
	}
	
	@Override
	public void run() {
		System.out.println("게임 구동중");
	}

}
