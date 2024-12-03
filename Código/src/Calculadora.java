import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculadora {

	private JFrame frame;
	private JTextField textela;
    String valor1 = "";
    String valor2 = "";
    int n = 0; //validar se ja foi escrito algum numero
    int y = 0; //valor 1 ou valor 2
    int x = 0; //switch case da calculadora
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 357, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textela = new JTextField();
		textela.setFont(new Font("Tahoma", Font.PLAIN, 27));
		textela.setBounds(10, 22, 315, 107);
		frame.getContentPane().add(textela);
		textela.setColumns(10);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(n == 1) {
					
					x = 1;
					
					y = 1;					
				}							
			}
		});
		btnSoma.setBounds(258, 358, 67, 63);
		frame.getContentPane().add(btnSoma);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(n == 1) {
					
					x = 2;
					
					y = 1;					
				} else {
				
					
				}
				
			}
		});
		btnSub.setBounds(258, 293, 67, 63);
		frame.getContentPane().add(btnSub);
		
		JButton btnMulti = new JButton("x");
		btnMulti.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(n == 1) {
					
					x = 3;
					
					y = 1;					
				}								
			}
		});
		btnMulti.setBounds(258, 153, 67, 63);
		frame.getContentPane().add(btnMulti);
		
		JButton btnDivi = new JButton("/");
		btnDivi.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(n == 1) {
					
					x = 4;
					
					y = 1;					
				}					
				
			}
		});
		btnDivi.setBounds(258, 220, 67, 63);
		frame.getContentPane().add(btnDivi);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "3";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "3";
					
					textela.setText(valor2);
				}			
				
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btn3.setBounds(181, 153, 67, 63);
		frame.getContentPane().add(btn3);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch (x) {
				
				case 1:
					
					int soma = Integer.parseInt(valor1) + Integer.parseInt(valor2);
					textela.setText(Integer.toString(soma));
					valor1 = Integer.toString(soma);
					valor2 = "";
					break;
					
				case 2:
					
					int sub = Integer.parseInt(valor1) - Integer.parseInt(valor2);
					textela.setText(Integer.toString(sub));
					valor1 = Integer.toString(sub);
					valor2 = "";
					break;
					
				case 3:
					
					int multi = Integer.parseInt(valor1) * Integer.parseInt(valor2);
					textela.setText(Integer.toString(multi));
					valor1 = Integer.toString(multi);
					valor2 = "";
					break;
					
				case 4: 
					
					int divi = Integer.parseInt(valor1) / Integer.parseInt(valor2);
					textela.setText(Integer.toString(divi));
					valor1 = Integer.toString(divi);
					valor2 = "";
					break;
				}
				
			}
		});
		btnResultado.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnResultado.setBounds(181, 358, 67, 63);
		frame.getContentPane().add(btnResultado);
		
		JButton btnn1 = new JButton("1");
		btnn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "1";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "1";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn1.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn1.setBounds(20, 152, 67, 63);
		frame.getContentPane().add(btnn1);
		
		JButton btnn2 = new JButton("2");
		btnn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "2";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "2";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn2.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn2.setBounds(100, 153, 67, 63);
		frame.getContentPane().add(btnn2);
		
		JButton btnn4 = new JButton("4");
		btnn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "4";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "4";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn4.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn4.setBounds(20, 220, 67, 63);
		frame.getContentPane().add(btnn4);
		
		JButton btnn5 = new JButton("5");
		btnn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "5";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "5";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn5.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn5.setBounds(100, 220, 67, 63);
		frame.getContentPane().add(btnn5);
		
		JButton btnn6 = new JButton("6");
		btnn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "6";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "6";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn6.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn6.setBounds(181, 220, 67, 63);
		frame.getContentPane().add(btnn6);
		
		JButton btnn7 = new JButton("7");
		btnn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "7";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "7";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn7.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn7.setBounds(20, 290, 67, 63);
		frame.getContentPane().add(btnn7);
		
		JButton btnn8 = new JButton("8");
		btnn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "8";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "8";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn8.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn8.setBounds(100, 290, 67, 63);
		frame.getContentPane().add(btnn8);
		
		JButton btnn9 = new JButton("9");
		btnn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "9";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "9";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn9.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn9.setBounds(181, 290, 67, 63);
		frame.getContentPane().add(btnn9);
		
		JButton btnn0 = new JButton("0");
		btnn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(y == 0) {
					
					n = 1;
	                 valor1 = valor1 + "0";
					
					textela.setText(valor1);
					
				} else { 
					
	                 valor2 = valor2 + "0";
					
					textela.setText(valor2);
				}							
			}
		});
		btnn0.setFont(new Font("Times New Roman", Font.PLAIN, 55));
		btnn0.setBounds(20, 361, 67, 63);
		frame.getContentPane().add(btnn0);
		
		JButton btnCE = new JButton("AC");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				     n = 0;
     			     y = 0;
				     x = 0;		
				     valor1 = "";
				     valor2 = "";
				     textela.setText("");
			}
		});
		btnCE.setBackground(new Color(240, 240, 240));
		btnCE.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnCE.setBounds(100, 358, 67, 63);
		frame.getContentPane().add(btnCE);
	}
}
