package game;
import javax.swing.*;

public class Frame extends JFrame{

	
	final int f_widgh = 600;	// 창의 넓이 설정
	final int f_hight = 800;	// 창의 높이 설정
	Thread titleth;
	JPanel titlepn;
	
	
	
	Frame(){
		setTitle("자바 리듬 게임");		//타이틀바 이름 설정 메소드
		setSize(f_widgh,f_hight); 	//창의 크기 지정 메소드
		setResizable(false);	 	//창의 크기 조절 여부 설정 메소드 
		titlepn = new Title();
		setContentPane(titlepn);
		
		setVisible(true);			//창 출력 여부 메소드
			
	};
	
	
	
	
	//준겹이 코드
	/*char[][] board = new char[17][30];
	int x, y;	//가로 세로의 좌표
	int z;		//
	int i, j;
	int a, b;
	
	

	void printBoard(char[][] board){	
		for (x = 0; x < 30; x++) {
			if (x != 27 && x != 29) {     // 27, 29 번째 행은 가로줄을 찍음                    
				for (y = 0; y < 5; y++) { // 총 5개의 세로줄 필요
					board[x][z] = '|';
					z = z + 4;            // 0, 4, 8 ,12, 16번째 열에만 세로줄
				}
			}
			else
				for (y = 0; y < 17; y++) {// 0~16 모든 열에 가로줄 필요
					board[x][z] = '-';
					z = z + 1;
				}
			z = 0; y = 0; // 반복문 다시 돌리려면 초기화 필요함
		}
		
		for (a = 0; a < 30; a++) {
			for (b = 0; b < 17; b++) {
				System.out.print(board[a][b]);

			}
			System.out.println("\n");
		}

	}*/
}
