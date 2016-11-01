package Rhythm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Result extends JPanel {
	JButton b;
	GameHandler handle;
	
	public Result(GameHandler handle) {
		this.handle = handle;
		b = new JButton("Result");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				restart();
				
			}
		});
		this.add(b);

	}

	public void restart(){
		handle.backTitle();
	}
}
