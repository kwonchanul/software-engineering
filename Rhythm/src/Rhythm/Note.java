package Rhythm;

public class Note {
	
	public int x;
	public int y;
	int speed;

	public Note(int x, int y, int speed){
		this.x = x;
		this.y = y;
		this.speed = speed;
		
	}
	
	public void noteDown(){
		
		y = y + 20;
		
	}

	public int getPointx() {
		return x;
		
	}
	public int getPointy() {
		return y;
	}
	
	
}
