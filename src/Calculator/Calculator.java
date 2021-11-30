package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField jtxtDisplay;
	
	double EnterNum1;
	double EnterNum2;
	double Result;
	String Operate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtDisplay.setBounds(10, 23, 325, 40);
		frame.getContentPane().add(jtxtDisplay);
		jtxtDisplay.setColumns(10);
		
		JButton btnBS = new JButton("\uf0e7");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bs = null;
				
			if (jtxtDisplay.getText().length() >0)
			{
				StringBuilder stB = new StringBuilder (jtxtDisplay.getText());
				stB.deleteCharAt (jtxtDisplay.getText().length()-1);
				bs = stB.toString();
				jtxtDisplay.setText(bs);
			}
				
				
				
			}
			
		});
		btnBS.setFont(new Font("Wingdings", Font.PLAIN, 24));
		btnBS.setBounds(9, 89, 74, 40);
		frame.getContentPane().add(btnBS);
		
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText("");
				
				String Fn, Sn ;
				
				Fn = String.valueOf(EnterNum1);
				Sn = String.valueOf(EnterNum2);
				
				Fn = "";
				Sn = "";
				
				
				
			}
		});
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnCE.setBounds(93, 89, 74, 40);
		frame.getContentPane().add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnC.setBounds(177, 89, 74, 40);
		frame.getContentPane().add(btnC);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pm = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
				pm = pm * (-1);
				jtxtDisplay.setText(String.valueOf(pm));
			
				
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPM.setBounds(261, 89, 74, 40);
		frame.getContentPane().add(btnPM);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn7.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn7.setBounds(10, 147, 74, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn8.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn8.setBounds(94, 147, 74, 40);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn9.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn9.setBounds(178, 147, 74, 40);
		frame.getContentPane().add(btn9);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="+";
			}
			 
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAdd.setBounds(262, 147, 74, 40);
		frame.getContentPane().add(btnAdd);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText() + btn4.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn4.setBounds(10, 208, 74, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn5.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn5.setBounds(94, 208, 74, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn6.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn6.setBounds(178, 208, 74, 40);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSub.setBounds(262, 208, 74, 40);
		frame.getContentPane().add(btnSub);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn1.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn1.setBounds(10, 269, 74, 40);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn2.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn2.setBounds(94, 269, 74, 40);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn3.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn3.setBounds(178, 269, 74, 40);
		frame.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMult.setBounds(262, 269, 74, 40);
		frame.getContentPane().add(btnMult);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String digit = jtxtDisplay.getText() + btn0.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btn0.setBounds(10, 330, 74, 40);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!jtxtDisplay.getText().contains("."))
				{ 
					jtxtDisplay.setText(jtxtDisplay.getText() + btnDot.getText());
				}
				
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDot.setBounds(94, 330, 74, 40);
		frame.getContentPane().add(btnDot);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterNum2 = Double.parseDouble(jtxtDisplay.getText());
				
				if (Operate == "+" )
				
				{
					
					Result = EnterNum1 + EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				
				
				else if (Operate == "*" )
					
				{
					
					Result = EnterNum1 * EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				
				else if (Operate == "-" )
					
				{
					
					Result = EnterNum1 - EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				
				else if (Operate == "/" )
					
				{
					
					Result = EnterNum1 / EnterNum2;
					jtxtDisplay.setText(String.valueOf(Result));
					
				}
				
				
				
				
				
				
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEquals.setBounds(178, 330, 74, 40);
		frame.getContentPane().add(btnEquals);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterNum1 = Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				Operate="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDiv.setBounds(262, 330, 74, 40);
		frame.getContentPane().add(btnDiv);
	}
}
