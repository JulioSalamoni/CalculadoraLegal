package br.com.calculadora.janela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import br.com.calculadora.operacoes.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class calculadorajanela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVisor;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnmenos;
	private JButton btnmais;
	private JButton btnvezes;
	private JButton btndivisao;
	private JButton btnraiz;
	private JButton btnexpoente;
	private JButton btn0;
	private JButton btnvirgula;
	private JButton btnigual;
	private JButton btnC;
	
	private calculos operacoes = new calculos();
	
	private double num1;
	private double num2;
	private String operador;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadorajanela frame = new calculadorajanela();
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
	public calculadorajanela() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(calculadorajanela.class.getResource("/br/com/calculadora/imagens/icon.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(239, 142, 65));
		separator.setForeground(new Color(0, 0, 64));
		separator.setBounds(0, 94, 355, 2);
		contentPane.add(separator);
		
		txtVisor = new JTextField();
		txtVisor.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtVisor.setHorizontalAlignment(SwingConstants.CENTER);
		txtVisor.setForeground(new Color(239, 142, 65));
		txtVisor.setBackground(new Color(0, 0, 34));
		txtVisor.setBounds(10, 22, 331, 51);
		contentPane.add(txtVisor);
		txtVisor.setColumns(10);
		
		btn7 = new JButton("7");
		btn7.setBackground(new Color(0, 4, 51));
		btn7.setForeground(new Color(239, 142, 65));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 128, 51, 51);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBackground(new Color(0, 4, 51));
		btn8.setForeground(new Color(239, 142, 65));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(71, 128, 51, 51);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBackground(new Color(0, 4, 51));
		btn9.setForeground(new Color(239, 142, 65));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(132, 128, 51, 51);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.setBackground(new Color(0, 4, 51));
		btn4.setForeground(new Color(239, 142, 65));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 185, 51, 51);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBackground(new Color(0, 4, 51));
		btn5.setForeground(new Color(239, 142, 65));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(71, 185, 51, 51);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBackground(new Color(0, 4, 51));
		btn6.setForeground(new Color(239, 142, 65));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(132, 185, 51, 51);
		contentPane.add(btn6);
		
		btn1 = new JButton("1");
		btn1.setBackground(new Color(0, 4, 51));
		btn1.setForeground(new Color(239, 142, 65));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 242, 51, 51);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBackground(new Color(0, 4, 51));
		btn2.setForeground(new Color(239, 142, 65));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(71, 242, 51, 51);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBackground(new Color(0, 4, 51));
		btn3.setForeground(new Color(239, 142, 65));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(132, 242, 51, 51);
		contentPane.add(btn3);
		
		btnmenos = new JButton("-");
		btnmenos.setBackground(new Color(0, 4, 51));
		btnmenos.setForeground(new Color(239, 142, 65));
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        num1 = Double.parseDouble(txtVisor.getText());
		        operador = "-";
		        txtVisor.setText("");
			}
		});
		btnmenos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmenos.setBounds(299, 128, 51, 51);
		contentPane.add(btnmenos);
		
		btnmais = new JButton("+");
		btnmais.setBackground(new Color(0, 4, 51));
		btnmais.setForeground(new Color(239, 142, 65));
		btnmais.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtVisor.getText());
		        operador = "+";
		        txtVisor.setText("");
			}
		});
		btnmais.setBounds(238, 128, 51, 51);
		contentPane.add(btnmais);
		
		btnvezes = new JButton("x");
		btnvezes.setBackground(new Color(0, 4, 51));
		btnvezes.setForeground(new Color(239, 142, 65));
		btnvezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        num1 = Double.parseDouble(txtVisor.getText());
		        operador = "x";
		        txtVisor.setText("");
			}
		});
		btnvezes.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnvezes.setBounds(238, 185, 51, 51);
		contentPane.add(btnvezes);
		
		btndivisao = new JButton("÷");
		btndivisao.setBackground(new Color(0, 4, 51));
		btndivisao.setForeground(new Color(239, 142, 65));
		btndivisao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 num1 = Double.parseDouble(txtVisor.getText());
			        operador = "÷";
			        txtVisor.setText("");
			}
		});
		btndivisao.setBounds(299, 185, 51, 51);
		contentPane.add(btndivisao);
		
		btnraiz = new JButton("√");
		btnraiz.setBackground(new Color(0, 4, 51));
		btnraiz.setForeground(new Color(239, 142, 65));
		btnraiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        double numero = Double.parseDouble(txtVisor.getText());
		        double resultado = operacoes.raiz(numero);
		        txtVisor.setText(String.valueOf(resultado));
			}
		});
		btnraiz.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnraiz.setBounds(299, 242, 51, 51);
		contentPane.add(btnraiz);
		
		btnexpoente = new JButton("xʸ");
		btnexpoente.setBackground(new Color(0, 4, 51));
		btnexpoente.setForeground(new Color(239, 142, 65));
		btnexpoente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        num1 = Double.parseDouble(txtVisor.getText());
		        operador = "xy";
		        txtVisor.setText("");
			}
		});
		btnexpoente.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnexpoente.setBounds(238, 242, 51, 51);
		contentPane.add(btnexpoente);
		
		btn0 = new JButton("0");
		btn0.setBackground(new Color(0, 4, 51));
		btn0.setForeground(new Color(239, 142, 65));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(71, 304, 51, 51);
		contentPane.add(btn0);
		
		btnvirgula = new JButton(",");
		btnvirgula.setBackground(new Color(0, 4, 51));
		btnvirgula.setForeground(new Color(239, 142, 65));
		btnvirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        if (!txtVisor.getText().contains(".")) {
		            txtVisor.setText(txtVisor.getText() + ".");
		        }
			}
		});
		btnvirgula.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnvirgula.setBounds(10, 304, 51, 51);
		contentPane.add(btnvirgula);
		
		btnigual = new JButton("=");
		btnigual.setBackground(new Color(0, 4, 51));
		btnigual.setForeground(new Color(239, 142, 65));
		btnigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble(txtVisor.getText());

		        double resultado = 0;

		        if (operador.equals("+")) {
		            resultado = operacoes.somar(num1, num2);
		        }
		        else if (operador.equals("-")) {
		            resultado = operacoes.subtrair(num1, num2);
		        }
		        else if (operador.equals("x")) {
		            resultado = operacoes.multiplicar(num1, num2);
		        }
		        else if (operador.equals("÷")) {
		            resultado = operacoes.dividir(num1, num2);
		        }
		        else if (operador.equals("xy")) {
		            resultado = operacoes.potencia(num1, num2);
		        }

		        txtVisor.setText(String.valueOf(resultado));
				
			}
		});
		btnigual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnigual.setBounds(238, 304, 112, 51);
		contentPane.add(btnigual);
		
		btnC = new JButton("C");
		btnC.setBackground(new Color(0, 4, 51));
		btnC.setForeground(new Color(239, 142, 65));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("");
		        num1 = 0;
		        num2 = 0;
		        operador = "";
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(132, 304, 51, 51);
		contentPane.add(btnC);
		lblNewLabel.setIcon(new ImageIcon(calculadorajanela.class.getResource("/br/com/calculadora/imagens/art.jpg")));
		lblNewLabel.setBounds(-52, -141, 453, 623);
		contentPane.add(lblNewLabel);

	}
}
