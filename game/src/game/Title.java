package game;

import java.awt.*;
import javax.swing.*;


class Title extends JPanel{
	public Title(){
		
		JPanel list = new JPanel();
		JPanel menus = new JPanel();
		JButton start = new JButton("start");
		JButton setting = new JButton("setting");
		JButton exit = new JButton("exit");

		
		
		this.add(list);
		this.add(menus);
		menus.add(start);
		menus.add(setting);
		menus.add(exit);

		//gamepn = new Game();
		//setContentPane(gamepn);
		
	}

	/*
	Image logo1 = tk.getImage(dir_data + "logo1.png");
	Image logo2 = tk.getImage(dir_data + "logo2.png");
	Image titlebg = tk.getImage(dir_data + "titlebg.png");
	Image startig = tk.getImage(dir_data + "startig.png");
	int i, j, z;
	music mp3;

	Title(){
	g=getContentPane().getGraphics();
	i=0;
	j=0;
	z=0;
	this.setFocusable(true);
	addKeyListener(this);
	try {
	FileInputStream file = new FileInputStream(dir_data+"titlebgm.mp3");
	mp3 = new music(file);
	musicth = new Thread(mp3);
	musicth.start();
	}catch (Exception e) {

	e.printStack Trace();

	}titleth=new Thread(this);titleth.start();}publick

	void run() {
		while (true) {
			this.requestFocus();
			if (i < 30) {
				j = 0;
			} else if (i < 60) {
				j = 1;
			} else {
				j = 2;
				z = i / 10 % 2;
			}
			i++;
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	public void displogo() {
		if (j == 0) {
			buffg.drawImage(logo1, 0, 0, this);
		} else if (j == 1) {
			buffg.drawImage(logo2, 0, 0, this);
		} else if (j == 2) {
			buffg.drawImage(titlebg, 0, 0, this);
			if (z == 1)
				buffg.drawImage(startig, 110, 400, this);
		}
	}

	public void paint(Graphics g) {
		buffimage = createImage(frame_width, frame_height);
		buffg = buffimage.getGraphics();
		update(g);
	}

	public void update(Graphics g) {
		displogo();
		g.drawImage(buffimage, 0, 0, this);
	}

	public void keyPressed(KeyEvent e) {
		if (j == 2) {
			mp3.closemusic();
			titleth.interrupt();
			callmusicsel();
		}
	}

	public void keyReleased(KeyEvent e) {

	}

	public void keyTyped(KeyEvend e) {

	}

	*/

}
