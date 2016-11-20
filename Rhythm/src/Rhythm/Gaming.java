package Rhythm;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class Gaming extends JPanel implements Runnable, KeyListener {
	private Image offScreenImage;
	private Graphics offScreen;
	private Image img1, img2, img3;
	public static Thread th;
	private boolean usedbuffer = true;
	static Point[] newnote = new Point[1000];
	Note[] note = new Note[1000];
	static private int noteindex = 0;
	int x,y;

	public Gaming() {
	    //setBackground(new Color(125,125,0,125));

		
		
		MediaTracker tracker = new MediaTracker(this);
		img1 = Toolkit.getDefaultToolkit().getImage("note1.png");
		img2 = Toolkit.getDefaultToolkit().getImage("note2.png");
		img3 = Toolkit.getDefaultToolkit().getImage("note3.png");
		tracker.addImage(img1, 0);
		tracker.addImage(img2, 0);
		tracker.addImage(img3, 0);
		try {
			// MediaTracker�� ����Ͽ� �̹����� ������ �ε��ɶ����� ���
			tracker.waitForAll();
		} catch (InterruptedException e) {
		}
		
		addKeyListener(this);
		this.requestFocus();
		setFocusable(true);

		// Thread����
		th = new Thread(this);
		th.start();
	}

	public void run() {
		while (th != null) {
			repaint();
			try {
				th.sleep(20);
			} catch (InterruptedException e) {
			}
		}
	}

	void paintingjob(Graphics g, int w, int h) {
		g.clearRect(0, 0, w, h); // ��ǥ�� �ش��ϴ� �κ��� �������� ĥ�ؼ� �����. ���⼱ ������Ʈ�� ��� �κ��� �����.

		for(Note p : note)
			if( p != null)
				p.noteDown();
				
		
		for(Note p : note)
			if( p != null){
				x = p.getPointx();
				y = p.getPointy();
				g.drawImage(img1, x, y, this);
			}
	}
	

	public void update(Graphics g) {
		paint(g);
	}

	public void paint(Graphics g) {
		int w = this.getSize().width;
		int h = this.getSize().height;

		// �޸� ���۸� �����ϰ�, ���ۿ����� Graphics��ü�� ����
		if (offScreen == null && usedbuffer) {
			try {
				offScreenImage = createImage(w, h);
				offScreen = offScreenImage.getGraphics();
			} catch (Exception e) {
				offScreen = null;
			}
		}
		// ������۸��� ����Ͽ� ���
		if (offScreen != null) {
			paintingjob(offScreen, w, h);
			g.drawImage(offScreenImage, 0, 0, this);
		}
		// �Ϲ����� ������� ���. ������ ������ �Ͼ
		else {
			paintingjob(g, w, h);
		}
	}

	void createNote(Note[] note, int noteindex, KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			note[noteindex] = new Note(20, 0, 25);
		}
		if (e.getKeyCode() == KeyEvent.VK_F) {
			note[noteindex] = new Note(150, 0, 25);
		}
		if (e.getKeyCode() == KeyEvent.VK_J) {
			note[noteindex] = new Note(300, 0, 25);
		}
		if (e.getKeyCode() == KeyEvent.VK_K) {
			note[noteindex] = new Note(450, 0, 25);
		}
	}

	public void keyPressed(KeyEvent e) {
        createNote(note,noteindex, e);
		noteindex++;
	}

	public void keyReleased(KeyEvent arg0) {
	}

	public void keyTyped(KeyEvent arg0) {
	}

}