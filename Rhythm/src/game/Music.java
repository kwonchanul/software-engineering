package game;

import java.io.*;
import javazoom.jl.player.Player;

public class Music implements Runnable {
	Player p;

	Music(String sname) {
		try {
			
			String path = "rsc\\" + sname + ".mp3";
			p = new Player(new FileInputStream(path));
		} catch (Exception e) {
			System.out.print(e);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			p.play();
			p.close();
		} catch (Exception e) {
			System.out.print("Error : ");
			System.out.print(e);
		}
	}

}
