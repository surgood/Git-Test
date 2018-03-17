import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstCalculator extends JFrame {
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bc,bpm,
	bplus, bminus, bmultiply, bdivide, bequals;
	JTextField t0;
	JLabel l0, l1;
	int x = 0 , y = 0;
	String a, b;
	eHandler handler = new eHandler();
	
	public FirstCalculator(String s) {
		super(s);
		setLayout(new FlowLayout());
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bc = new JButton("C");
		bplus = new JButton("+");
		bminus = new JButton("-");
		bmultiply = new JButton("*");
		bdivide = new JButton("/");
		bequals = new JButton("=");
		bpm = new JButton("±");
		t0 = new JTextField(10);
		l0 = new JLabel("");
		l1 = new JLabel("Beta ver.1.0");
		
		add(l0);
		add(t0);
		add(bc);
		add(b7);
		add(b8);
		add(b9);
		add(bdivide);
		add(b4);
		add(b5);
		add(b6);
		add(bmultiply);
		add(b1);
		add(b2);
		add(b3);
		add(bminus);
		add(bpm);
		add(b0);
		add(bequals);
		add(bplus);
		add(l1);
		b0.addActionListener(handler);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		bc.addActionListener(handler);
		bplus.addActionListener(handler);
		bminus.addActionListener(handler);
		bmultiply.addActionListener(handler);
		bdivide.addActionListener(handler);
		bequals.addActionListener(handler);
		bpm.addActionListener(handler);
		
		t0.setText("0");
	}
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try {				
				if(e.getSource()==bc) {
					t0.setText("0");
					x = 0; y = 0;
					a = null; b = null;
				}
				if(e.getSource()==bpm) {
					x = Integer.parseInt(t0.getText());
					x = -1*x;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b1) {
					x = Integer.parseInt(t0.getText());
					x = x*10+1;
					a = String.valueOf(x);
					t0.setText(a);				
				}
				if(e.getSource()==b2) {	
					x = Integer.parseInt(t0.getText());
					x = x*10+2;
					a = String.valueOf(x);
					t0.setText(a);				
				}
				if(e.getSource()==b3) {
					x = Integer.parseInt(t0.getText());
					x = x*10+3;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b4) {
					x = Integer.parseInt(t0.getText());
					x = x*10+4;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b5) {
					x = Integer.parseInt(t0.getText());
					x = x*10+5;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b6) {
					x = Integer.parseInt(t0.getText());
					x = x*10+6;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b7) {
					x = Integer.parseInt(t0.getText());
					x = x*10+7;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b8) {
					x = Integer.parseInt(t0.getText());
					x = x*10+8;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b9) {
					x = Integer.parseInt(t0.getText());
					x = x*10+9;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==b0) {
					x = Integer.parseInt(t0.getText());
					x = x*10;
					a = String.valueOf(x);
					t0.setText(a);
				}
				if(e.getSource()==bplus) {
					y = x;
					x = 0;
					l0.setText("+");
					b = "1";
					t0.setText("0");
				}
				if(e.getSource()==bminus) {
					y = x;
					x = 0;
					l0.setText("-");
					b = "2";
					t0.setText("0");
				}
				if(e.getSource()==bmultiply) {
					y = x;
					x = 0;
					l0.setText("*");
					b = "3";
					t0.setText("0");
				}
				if(e.getSource()==bdivide) {
					y = x;
					x = 0;
					l0.setText("/");
					b = "4";
					t0.setText("0");
				}				
				if(e.getSource()==bequals) {
					if (b=="1") {
						x = x+y;}
					if (b=="2") {
						x = y-x;}
					if (b=="3") {
						x = y*x;}
					if (b=="4") {
						x = y/x;}
					b = String.valueOf(x);
					t0.setText(b);
					l0.setText("");
				}
			}catch (Exception ex) { JOptionPane.showMessageDialog(null, "¬вед≥ть в поле число");
		    }
	    } 
    }
}
