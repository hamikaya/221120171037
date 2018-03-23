package uygu;

import java.awt.BorderLayout;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.*;
import javax.swing.*;

public class uygulama extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uygulama frame = new uygulama();
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
	public uygulama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		List list = new List();
		contentPane.add(list, BorderLayout.WEST);
		
		List list_1 = new List();
		contentPane.add(list_1, BorderLayout.EAST);
		
		JButton btnSayret = new JButton("SAYI \u00DCRET");
		btnSayret.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				int rs = r.nextInt(100);
				String rs1 = Integer.toString(rs);
				if (rs<50) {
					list.add(rs1);
				}
				else if (rs==50) {
					JOptionPane.showMessageDialog(null, "Üretilen Sayı 50.");
				}
				else {
					list_1.add(rs1);
				}
			}
		});
		contentPane.add(btnSayret, BorderLayout.NORTH);
	}

}
