package konzentrationstest_v1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createFrame1 extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tfe1;
	private JTextField tfe2;
	private JTextField tfe3;
	private JTextField tfe4;
	private JTextField tfe5;
	private JTextField tfe6;
	private JTextField tfe7;
	private JTextField tf_Ergebnis;
	
	public int[][] 	inhalt 	= new int[7][5];
	public String[] tfIn 	= new String[7];
	public int[] 	summe 	= new int[7];
	public int[]	tfOut	= new int[7];
	public String[] ausgabe = new String[7];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createFrame1 frame = new createFrame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public createFrame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setEditable(false);
		tf1.setBounds(10, 11, 240, 30);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setColumns(10);
		tf2.setBounds(10, 52, 240, 30);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBounds(10, 93, 240, 30);
		contentPane.add(tf3);
		
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf4.setColumns(10);
		tf4.setBounds(10, 134, 240, 30);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.setEditable(false);
		tf5.setColumns(10);
		tf5.setBounds(10, 175, 240, 30);
		contentPane.add(tf5);
		
		tf6 = new JTextField();
		tf6.setEditable(false);
		tf6.setColumns(10);
		tf6.setBounds(10, 216, 240, 30);
		contentPane.add(tf6);
		
		tf7 = new JTextField();
		tf7.setEditable(false);
		tf7.setColumns(10);
		tf7.setBounds(10, 257, 240, 30);
		contentPane.add(tf7);
		
		tfe1 = new JTextField();
		tfe1.setBounds(260, 11, 65, 30);
		contentPane.add(tfe1);
		tfe1.setColumns(10);
		
		tfe2 = new JTextField();
		tfe2.setColumns(10);
		tfe2.setBounds(260, 52, 65, 30);
		contentPane.add(tfe2);
		
		tfe3 = new JTextField();
		tfe3.setColumns(10);
		tfe3.setBounds(260, 93, 65, 30);
		contentPane.add(tfe3);
		
		tfe4 = new JTextField();
		tfe4.setColumns(10);
		tfe4.setBounds(260, 134, 65, 30);
		contentPane.add(tfe4);
		
		tfe5 = new JTextField();
		tfe5.setColumns(10);
		tfe5.setBounds(260, 175, 65, 30);
		contentPane.add(tfe5);
		
		tfe6 = new JTextField();
		tfe6.setColumns(10);
		tfe6.setBounds(260, 216, 65, 30);
		contentPane.add(tfe6);
		
		tfe7 = new JTextField();
		tfe7.setColumns(10);
		tfe7.setBounds(260, 257, 65, 30);
		contentPane.add(tfe7);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(10, 377, 100, 23);
		contentPane.add(btnAbbrechen);
		
		JButton btnWeiter = new JButton("Weiter >>");
		btnWeiter.setBounds(445, 377, 89, 23);
		contentPane.add(btnWeiter);
		
		JButton btnFertig = new JButton("Fertig");
		btnFertig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tfOut[0] = Integer.parseInt(tfe1.getText()); //holen der eingegebenen ergebnisse
				tfOut[1] = Integer.parseInt(tfe2.getText());
				tfOut[2] = Integer.parseInt(tfe3.getText());
				tfOut[3] = Integer.parseInt(tfe4.getText());
				tfOut[4] = Integer.parseInt(tfe5.getText());
				tfOut[5] = Integer.parseInt(tfe6.getText());
				tfOut[6] = Integer.parseInt(tfe7.getText());
				
				for(int i=0; i<7; i++) {					 //for schleifen für die quersumme
					for(int j=0; j<5;j++) {
						summe[i] += inhalt[i][j];
					}
					if(tfOut[i] == summe[i]){
						tf_Ergebnis.setText(tf_Ergebnis.getText() + "- 1");
					} else {
						tf_Ergebnis.setText(tf_Ergebnis.getText() + "- 0");
					}
				}
				
			}
		});
		btnFertig.setBounds(346, 377, 89, 23);
		contentPane.add(btnFertig);
		
		tf_Ergebnis = new JTextField();
		tf_Ergebnis.setEditable(false);
		tf_Ergebnis.setBounds(10, 298, 444, 35);
		contentPane.add(tf_Ergebnis);
		tf_Ergebnis.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0; i<7; i++) {							//for schleife für die "zeile"
					for(int j=0; j<5;j++) {							//for schleife für die "stelle"
						inhalt[i][j] = (int)(Math.random()*9);		//zufallszahl im 2d. intArray
						tfIn[i] += "-"+inhalt[i][j];					//tfIn[i] = tfIn[i]+inhalt[i][j]
					}
				}
				
				tf1.setText(tfIn[0]);		//einsetzen der zufallszahlen
				tf2.setText(tfIn[1]);
				tf3.setText(tfIn[2]);
				tf4.setText(tfIn[3]);
				tf5.setText(tfIn[4]);
				tf6.setText(tfIn[5]);
				tf7.setText(tfIn[6]);
			}
		});
		btnStart.setBounds(236, 377, 89, 23);
		contentPane.add(btnStart);
	}
}
