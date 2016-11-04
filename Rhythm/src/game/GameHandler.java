package game;

import java.awt.Container;

import javax.swing.JPanel;

import org.omg.CORBA._PolicyStub;

public class GameHandler {
	Frame frame;
	JPanel Gamingpn, Resultpn, Titlepn;
	Thread Musicth, Gamingth, settingth;
	Container superpanel;
	Thread.State state;
	
	public GameHandler(Frame frame){
		this.frame = frame;
		titleView();
	}
	
	public void titleView(){
		
		Titlepn = new Title(this);

		superpanel = frame.getContentPane();
		superpanel.add(Titlepn);
		Titlepn.requestFocus();
	}
	
	public void gamingView(){
		
		superpanel.remove(Titlepn);
		
		Music music = new Music(Title.sname);
		Gaming game = new Gaming(this);
		Gamingpn = game;
		Gamingth = new Thread(game);
		Musicth = new Thread(music);
			
		superpanel.add(Gamingpn);
		frame.setVisible(false);
		frame.setVisible(true);
		Gamingpn.requestFocus();
		Gamingth.start();
		Musicth.start();
	}
	
	@SuppressWarnings("deprecation")
	public void resultView(){
		
		Gamingth.stop();
		Musicth.stop();
		superpanel.remove(Gamingpn);
		
		Resultpn = new Result(this);
		
		superpanel.add(Resultpn);
		frame.setVisible(false);
		frame.setVisible(true);
		Resultpn.requestFocus();
	}
	
	public void backTitle(){
		
		superpanel.remove(Resultpn);
		
		superpanel.add(Titlepn);
		frame.setVisible(false);
		frame.setVisible(true);
		Titlepn.requestFocus();
	}

	public void viewSetting() {
		
		Setting setting = new Setting();
		settingth = new Thread(setting);
		
		settingth.start();
		
	}
	
/*	public void pauseGame() throws InterruptedException {
		Setting setting = new Setting();

		Gamingth.wait();
		Musicth.wait();
		settingth = new Thread(setting);
		if((state = settingth.getState()) == Thread.State.TERMINATED) {
			Gamingth.notify();
			Musicth.notify();
		}

	}*/

}
