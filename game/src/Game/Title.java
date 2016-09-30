package Game;

import java.awt.*;
import javax.swing.*;


class Title extends JPanel{
	JPanel jPanel1, jPanel2, jPanel3, jPanel4;
	JScrollPane jScrollPane1;
	JList jList1;
	JTextField jTextField1;
	JRadioButton jRadioButton1, jRadioButton2, jRadioButton3;
	JButton jButton1, jButton2, jButton3;
	
	public Title(){
			jPanel1 = new javax.swing.JPanel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        jList1 = new javax.swing.JList<>();
	        jPanel2 = new javax.swing.JPanel();
	        jTextField1 = new javax.swing.JTextField();
	        jPanel4 = new javax.swing.JPanel();
	        jRadioButton1 = new javax.swing.JRadioButton();
	        jRadioButton2 = new javax.swing.JRadioButton();
	        jRadioButton3 = new javax.swing.JRadioButton();
	        jPanel3 = new javax.swing.JPanel();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        
	        ButtonGroup gruop = new ButtonGroup();
	        gruop.add(jRadioButton1);
	        gruop.add(jRadioButton2);
	        gruop.add(jRadioButton3);

	        jPanel1.setPreferredSize(new java.awt.Dimension(600, 800));

	        jList1.setModel(new javax.swing.AbstractListModel<String>() {
	            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5","Item 6"};
	            public int getSize() { return strings.length; }
	            public String getElementAt(int i) { return strings[i]; }
	        });
	        jScrollPane1.setViewportView(jList1);

	        jTextField1.setText("���õ� ��������");
	        jTextField1.setEditable(false);
	        jTextField1.setText("jList result");

	        jRadioButton1.setText("EASY");
	        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton1.ActionPerformed(evt);
	            }
	        });

	        jRadioButton2.setText("NOMAL");

	        jRadioButton3.setText("HARD");

	        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
	        jPanel4.setLayout(jPanel4Layout);
	        jPanel4Layout.setHorizontalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel4Layout.createSequentialGroup()
	                .addGap(18, 18, 18)
	                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jRadioButton3)
	                    .addComponent(jRadioButton2)
	                    .addComponent(jRadioButton1))
	                .addContainerGap(13, Short.MAX_VALUE))
	        );
	        jPanel4Layout.setVerticalGroup(
	            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel4Layout.createSequentialGroup()
	                .addGap(16, 16, 16)
	                .addComponent(jRadioButton1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jRadioButton2)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jRadioButton3)
	                .addContainerGap(13, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jTextField1)
	                .addContainerGap())
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(138, Short.MAX_VALUE)
	                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(135, 135, 135))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(61, 61, 61)
	                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(55, Short.MAX_VALUE))
	        );

	        jButton1.setText("START");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setText("SETTING");

	        jButton3.setText("EXIT");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
	                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addGap(58, 58, 58)
	                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addComponent(jScrollPane1))
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addContainerGap())
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	        );
	}
		
	/*	
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