package uygulama_sinavi_11_05_2018;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class uygulama_sinav {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uygulama_sinav window = new uygulama_sinav();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public uygulama_sinav() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField.setBounds(155, 194, 131, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Say\u0131 Girin");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(182, 162, 84, 32);
		frame.getContentPane().add(lblNewLabel);
		JButton btnNewButton = new JButton("G\u0130R");
		ArrayList<Integer> sayilar = new ArrayList<>();
		ArrayList<Integer> asalsayilar = new ArrayList<>();
		ArrayList<Integer> sirala = new ArrayList<>();
		btnNewButton.addActionListener(new ActionListener() {
			int i = 0;
			int enbuyuk1 = 0;
			int enbuyuk11 = 0;
			int enkucuk1 = 9999;
			int sayitoplam1 = 0;
			String asalsayilar123 = "";
			String sirala123 = "";
			String virgul = ", ";
			public void actionPerformed(ActionEvent arg0) {
				String sayi1 = textField.getText();
				int sayi = Integer.parseInt(sayi1);
				while (i < 10) {
					i++;
					sayilar.add(sayi);
					if (i==10) {
			            btnNewButton.setEnabled(false);
			            textField.setText(null);
			            textField.setEnabled(false);
			            lblNewLabel_5.setText("Maksimum 10 adet sayı girebilirsiniz.");
			            for (int i = 0; i < 10; i++) {
			            	enbuyuk1 = Math.max(enbuyuk1, sayilar.get(i));
			            	enkucuk1 = Math.min(enkucuk1, sayilar.get(i));
			            	sayitoplam1 = sayitoplam1+sayilar.get(i);
			            }
		            	for (int t = 0; t < sayilar.size(); t++) {
			            	int sayac = 0;
			            	for (int p = 2; p < sayilar.get(t); p++) {
			            		if (sayilar.get(t) % p == 0) {
			            		sayac++;
			            		}
			            	}
			            	if (sayac == 0 && sayilar.get(t) != 1 && sayilar.get(t) != 0) {
			            		asalsayilar.add(sayilar.get(t));
			            	}
		            	}
		            	if (asalsayilar.size() != 0) {
				            for (int a = 0; a < asalsayilar.size(); a++) {
				            	String asalsayi12345 = Integer.toString(asalsayilar.get(a));
				            	if (a == asalsayilar.size()-1) {
				            		virgul = "";
				            	}
				            	asalsayilar123 = asalsayilar123 + asalsayi12345 + virgul;
				            }
		            	}
		            	else {
				            lblNewLabel_4.setText("Girdiğiniz sayılarda asal sayı bulunmamaktadır.");
		            	}
			            String enbuyuk = Integer.toString(enbuyuk1);
			            lblNewLabel_1.setText("En büyük sayı: "+enbuyuk);
			            String enkucuk = Integer.toString(enkucuk1);
			            lblNewLabel_2.setText("En küçük sayı: "+enkucuk);
			            int ortalama1 = sayitoplam1/10;
			            String ortalama = Integer.toString(ortalama1);
			            lblNewLabel_3.setText("Girilen sayıların ortalaması: "+ortalama);
			            if (asalsayilar.size() != 0) {
				            lblNewLabel_4.setText("Asal sayılar: "+asalsayilar123);
			            }
			            Collections.sort(sayilar);
			            lblNewLabel_6.setText("Büyükten küçüğe : "+sayilar);
					}
					break;
				}
			}
		});
		btnNewButton.setBounds(155, 250, 131, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(32, 11, 392, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(32, 40, 392, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(32, 70, 392, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(32, 100, 392, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(117, 278, 212, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(32, 130, 392, 23);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
