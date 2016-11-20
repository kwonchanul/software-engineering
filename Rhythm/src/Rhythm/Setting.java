package Rhythm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Setting extends JFrame implements Runnable {

	int speeds; // 속도
	double speedvalue, syncvalue; // 속도값, 싱크값
	boolean bgmsign, efssign; // 배경음, 효과음
	JPanel panel;
	JLabel title, speed, currentspeed, sync, currentsync, bgm, effectsound;
	JButton speedup, speeddown, syncup, syncdown, bgmon, bgmoff, efson, efsoff, exit;

	public Setting() {
		speeds = 2;
		syncvalue = 50.0;
		bgmsign = true;
		efssign = true;

		init();

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {

			}
		});

	}

	public void run() {

		speedup.addActionListener(new ActionListener() { // 속도 증가

			@Override
			public void actionPerformed(ActionEvent arg0) {
				while (speeds < 5) {
					speeds = speeds + 1;
					currentspeed.setText("x" + String.valueOf(speeds));
					break;
				}
			}
		});

		speeddown.addActionListener(new ActionListener() { // 속도 감소

			@Override
			public void actionPerformed(ActionEvent arg0) {
				while (speeds > 1) {
					speeds = speeds - 1;
					currentspeed.setText("x" + String.valueOf(speeds));
					break;
				}
			}
		});

		syncup.addActionListener(new ActionListener() { // 싱크 증가

			public void actionPerformed(ActionEvent arg0) {
				while (syncvalue < 100) {
					syncvalue = (syncvalue * 10 + 1.0) / 10.0;
					currentsync.setText(String.valueOf(syncvalue));
					break;
				}
			}
		});

		syncdown.addActionListener(new ActionListener() { // 싱크 감소

			public void actionPerformed(ActionEvent arg0) {
				while (syncvalue > 1) {
					syncvalue = (syncvalue * 10 - 1.0) / 10.0;
					currentsync.setText(String.valueOf(syncvalue));
					break;
				}
			}
		});

		exit.addActionListener(new ActionListener() { // 메인메뉴로

			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});

		bgmon.addActionListener(new ActionListener() { // 배경음 키기

			public void actionPerformed(ActionEvent arg0) {
				bgmsign = true;
			}
		});

		bgmoff.addActionListener(new ActionListener() { // 배경음 끄기

			public void actionPerformed(ActionEvent arg0) {
				bgmsign = false;
			}
		});

		efson.addActionListener(new ActionListener() { // 효과음 키기

			public void actionPerformed(ActionEvent arg0) {
				efssign = true;
			}
		});

		efsoff.addActionListener(new ActionListener() { // 효과음 끄기

			public void actionPerformed(ActionEvent arg0) {
				efssign = false;
			}
		});

	};

	public void init() {
		panel = new JPanel();
		title = new JLabel("리듬게임 환경설정");
		speed = new JLabel("노트 속도");
		currentspeed = new JLabel("x" + String.valueOf(speeds));
		speedup = new JButton("▲");
		speeddown = new JButton("▼");
		sync = new JLabel("노트 싱크");
		currentsync = new JLabel(String.valueOf(syncvalue));
		syncup = new JButton("▲");
		syncdown = new JButton("▼");
		bgm = new JLabel("배경음");
		bgmon = new JButton("켜기");
		bgmoff = new JButton("끄기");
		effectsound = new JLabel("효과음");
		efson = new JButton("켜기");
		efsoff = new JButton("끄기");
		exit = new JButton("메인화면으로");
		panel.setLayout(null);

		panel.add(title);
		panel.add(speed);
		panel.add(currentspeed);
		panel.add(speedup);
		panel.add(speeddown);
		panel.add(sync);
		panel.add(currentsync);
		panel.add(syncup);
		panel.add(syncdown);
		panel.add(exit);
		panel.add(bgm);
		panel.add(bgmon);
		panel.add(bgmoff);
		panel.add(effectsound);
		panel.add(efson);
		panel.add(efsoff);

		title.setBounds(90, 5, 110, 30);
		speed.setBounds(40, 50, 80, 30);
		currentspeed.setBounds(110, 50, 30, 30);
		speedup.setBounds(150, 40, 50, 20);
		speeddown.setBounds(150, 70, 50, 20);
		sync.setBounds(40, 130, 80, 30);
		currentsync.setBounds(110, 130, 40, 30);
		syncup.setBounds(150, 120, 50, 20);
		syncdown.setBounds(150, 150, 50, 20);
		bgm.setBounds(40, 210, 50, 30);
		bgmon.setBounds(100, 210, 60, 30);
		bgmoff.setBounds(180, 210, 60, 30);
		effectsound.setBounds(40, 280, 50, 30);
		efson.setBounds(100, 280, 60, 30);
		efsoff.setBounds(180, 280, 60, 30);
		exit.setBounds(130, 400, 130, 30);
		add(panel);

		setSize(300, 500);
		setResizable(false);
		setTitle("리듬게임 환경설정");
		setVisible(true);

		this.addWindowListener(new WindowListener() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

}
