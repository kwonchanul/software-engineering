package Game;

import java.io.*;
import javax.sound.sampled.*;

public class Music {
	public Music() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("end.wav"));
			Clip clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		} catch (Exception ex) {
		}
	}

	/*
	 * class music implements Runnable { // ���� ��� Ŭ���� Player player;
	 * FileInputStream file;
	 * 
	 * music(FileInputStream file) { this.file = file; try { player = new
	 * Player(file); } catch (Exception e) { e.printStackTrace(); } }
	 * 
	 * public void run() { try { player.play(); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 * 
	 * public int getmusictime() { return player.getPosition(); }
	 * 
	 * public void closemusic(){ player.close(); try { file.close(); }catch
	 * (IOException e) {
	 * 
	 * e.printStack Trace(); } }}
	 */
}