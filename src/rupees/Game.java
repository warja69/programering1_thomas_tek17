package rupees;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Game {
 
	JFrame ram;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, valKnapp, valKnappmer, playerPanel;
	JLabel rubrik, yourRupees, pengar;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font textstorlek = new Font("Times New Roman", Font.PLAIN,30 );
	Font mainTextBar = new Font("Times new roman", Font.PLAIN,25);
	JButton startButton, val1, val2, val3, val4, val5, mer;
	JTextArea mainTextArea;
	int playerRupees;
	String position;
	
	TitleScreenHandler TsH = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();
	public static void main(String[] args) {

		new Game();

	}
	/**
	 * 
	 * exit on close = gör så att programmet avslutas helt och hållet.
	 * "setSize" storleken på ramen.
	 * setLocationRelativeTo = positionen på skärmen.
	 * setLayout(null) avaktiverar default layout. så att man kan ha en custom layout.
	 * setVisible(true) = gör det fönstret synlig.
	 * con.add(xxxx) lägger till det i klassen.
	 */
	public Game(){
	  /*Fönstret skapas*/
		ram = new JFrame();
		ram.setSize(800, 600);
		ram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ram.setResizable(false);
		ram.setLocationRelativeTo(null);/* gör så att fönster öppnas i mitten på ditt skärm.*/
		ram.setVisible(true);
		ram.getContentPane().setBackground(Color.black);
		ram.setLayout(null);
		con = ram.getContentPane();
		
		/*rubrik layout skrivs*/
		titleNamePanel = new JPanel();
	    titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		rubrik = new JLabel("Har du råd?");
		rubrik.setForeground(Color.white);
		
		/*storleken på bokstäverna*/
		rubrik.setFont(titleFont);
		
		/* start knapp*/
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		/*text på knappen */
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(textstorlek);
		startButton.addActionListener(TsH);
		startButton.setFocusPainted(false);
		
		titleNamePanel.add(rubrik);
		startButtonPanel.add(startButton);
		con.add(titleNamePanel);
		con.add(startButtonPanel);
	    
	}
	/**
	 * setLineWrap(true) = om texten är för lång hamnar den på nästa rad.
	 */
	public void creatGameScreen() {
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		
	mainTextPanel = new JPanel();
	mainTextPanel.setBounds(100, 100, 600, 250);
    mainTextPanel.setBackground(Color.black);
    con.add(mainTextPanel);
    
    mainTextArea = new JTextArea("vad ska jag köpa i dag ?");
    mainTextArea.setBounds(100, 100, 600,250);
    mainTextArea.setBackground(Color.black);
    mainTextArea.setForeground(Color.white);
    mainTextArea.setFont(mainTextBar);
    mainTextArea.setLineWrap(true);
    mainTextPanel.add(mainTextArea);
    
    valKnapp = new JPanel();
    valKnapp.setBounds(250, 350, 300, 150);
    valKnapp.setBackground(Color.black);
    valKnapp.setLayout(new GridLayout(5,1));
    con.add(valKnapp);
    
    val1 = new JButton("pil 20:-");
    val1.setBackground(Color.black);
    val1.setForeground(Color.white);
    val1.setFont(textstorlek);
    val1.setFocusPainted(false);
    val1.addActionListener(choiceHandler);
    val1.setActionCommand("v1");
    valKnapp.add(val1);
    
    
    /*TEST knapp åt sidan
    valKnappmer = new JPanel();
    valKnappmer.setBounds(550,350,80, 150);
    valKnappmer.setBackground(Color.red);
    valKnappmer.setLayout(new GridLayout(5,1));
    con.add(valKnappmer);
    
     mer = new JButton(" + ");
    mer.setBackground(Color.black);
    mer.setForeground(Color.white);
    mer.setFont(textstorlek);
    valKnappmer.add(mer);*/
    
  
    
    val2 = new JButton("Äpple 5:- ");
    val2.setBackground(Color.black);
    val2.setForeground(Color.white);
    val2.setFont(textstorlek);
    val2.setFocusPainted(false);
    val2.addActionListener(choiceHandler);
    val2.setActionCommand("v2");
    valKnapp.add(val2);
    
    val3 = new JButton("Sköld 20:-");
    val3.setBackground(Color.black);
    val3.setForeground(Color.white);
    val3.setFont(textstorlek);
    val3.setFocusPainted(false);
    val3.addActionListener(choiceHandler);
    val3.setActionCommand("v3");
    valKnapp.add(val3);
    
    val4 = new JButton("Båge 70:-");
    val4.setBackground(Color.black);
    val4.setForeground(Color.white);
    val4.setFont(textstorlek);
    val4.setFocusPainted(false);
    val4.addActionListener(choiceHandler);
    val4.setActionCommand("v4");
    valKnapp.add(val4);
    
    val5 = new JButton("Svärd 50:-");
    val5.setBackground(Color.black);
    val5.setForeground(Color.white);
    val5.setFont(textstorlek);
    val5.setFocusPainted(false);
    val5.addActionListener(choiceHandler);
    val5.setActionCommand("v5");
    valKnapp.add(val5);
    
    playerPanel = new JPanel();
    playerPanel.setBounds(100, 15, 600, 50);
    playerPanel.setBackground(Color.black);
    playerPanel.setLayout(new GridLayout(1,4));
    con.add(playerPanel);
    
    yourRupees = new JLabel("Rupees:");
    yourRupees.setFont(textstorlek);
    yourRupees.setForeground(Color.white);
    playerPanel.add(yourRupees);
    pengar = new JLabel();
    pengar.setFont(textstorlek);
    pengar.setForeground(Color.white);
    playerPanel.add(pengar);
    
playerSetup();
	}
	public void playerSetup() {
		playerRupees = 120;
		pengar.setText("" + playerRupees);
		
		köpCenter();
	}
	public void köpCenter() {
		position = "köpCenter";
		 mainTextArea.setText("vad ska jag köpa?");
		 
		 val1.setText("pil 20:-");
	     val2.setText("äpple 5:-");
	     val3.setText("sköld 20:-");
	     val4.setText("båge 70:-");
	     val5.setText("svärd 50:-");
	}
	 public void köpPillar() {
		 position = "köpPillar";
		 mainTextArea.setText("Du har 120 rupees och 100 pillar kostar 2000 rupees.");
		 playerRupees = playerRupees ;
		 pengar.setText(""+playerRupees);
		 val1.setText("100st");
	     val2.setText("");
	     val3.setText("");
	     val4.setText("");
	     val5.setText("");
		 
		 
	 }
	
	 public void köpÄpple() {
		 position = "köpÄpple";
		 mainTextArea.setText("Du köpte 5 äpplen och det kostade 25Ruppes.");
		 playerRupees = playerRupees -25;
		 pengar.setText(""+playerRupees);
		 val1.setText("5st");
	     val2.setText("");
	     val3.setText("");
	     val4.setText("");
	     val5.setText("");
	 }
	public void köpSköld() {
		position = "köpSköld";
		 mainTextArea.setText("Du köpte en sköld och det kostade 20Ruppes");
		 playerRupees = playerRupees -20;
		 pengar.setText(""+playerRupees);
		 val1.setText("1st");
	     val2.setText("");
	     val3.setText("");
	     val4.setText("");
	     val5.setText("");
	}
	public void köpBåge() {
		position = "köpBåge";
		 mainTextArea.setText("Du köpte en Båge och det kostade 70Ruppes");
		 playerRupees = playerRupees -70;
		 pengar.setText(""+playerRupees);
		 val1.setText("1st");
	     val2.setText("");
	     val3.setText("");
	     val4.setText("");
	     val5.setText("");
	}
	public void köpSvärd() {
		position = "köpSvärd";
		 mainTextArea.setText("Du köpte ett svärd och det kostade 50 Ruppes");
		 playerRupees = playerRupees -50;
		 pengar.setText(""+playerRupees);
		 val1.setText("1st");
	     val2.setText("");
	     val3.setText("");
	     val4.setText("");
	     val5.setText("");
	}
	
	
 	public class TitleScreenHandler implements ActionListener{
 		
 		public void actionPerformed(ActionEvent event) {
 			
 			creatGameScreen();
 			
 			
 		}
 		
 	}
  public class ChoiceHandler implements ActionListener{
	  
	  public void actionPerformed(ActionEvent event) {
		  
		  String dittVal = event.getActionCommand();
		  
		  switch(position) {
		  case"köpCenter":
			  switch(dittVal) {
			  case"v1" : köpPillar(); break;
			  case"v2" : köpÄpple();  break;
			  case"v3" : köpSköld();  break;
			  case"v4" : köpBåge();   break;
			  case"v5" : köpSvärd();  break;
			  }
			  break;
		  case"köpPillar":
			  switch(dittVal) {
			  case"v1": köpCenter(); break;
			  }
			  break;
		  case"köpÄpple":
			  switch(dittVal){
			  case"v1":köpCenter(); break;
			  }
			  break;
		  case"köpSköld":
			  switch(dittVal){
			  case"v1": köpCenter(); break;
			  }
			  break;
		  case"köpBåge":
			  switch(dittVal) {
			  case"v1": köpCenter(); break;
			  }
			  break;
		  case"köpSvärd":
			  switch(dittVal) {
			  case"v1": köpCenter(); break;
			  }
			  
		  }
		 
		 
	  }
  }
 	
 	
 	
}
 