package team6.ntunhs.javaProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;

public class mainPage {

	private JFrame frame;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
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
	public mainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("新細明體", Font.PLAIN, 18));
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("新細明體", Font.PLAIN, 18));
		nameTextField.setBounds(130, 49, 96, 35);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("姓名:");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(56, 54, 64, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("性別:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(259, 49, 82, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox genderComboBox = new JComboBox();
		genderComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		genderComboBox.setBounds(351, 55, 88, 29);
		frame.getContentPane().add(genderComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("科別:");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(56, 112, 64, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox departmentComboBox = new JComboBox();
		departmentComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		departmentComboBox.setBounds(130, 113, 96, 23);
		frame.getContentPane().add(departmentComboBox);
		
		JLabel lblNewLabel_3 = new JLabel("醫師:");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(259, 113, 82, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox doctorComboBox = new JComboBox();
		doctorComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		doctorComboBox.setBounds(351, 112, 88, 25);
		frame.getContentPane().add(doctorComboBox);
		
		JLabel lblNewLabel_4 = new JLabel("門診時段");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(98, 177, 128, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox timeComboBox = new JComboBox();
		timeComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		timeComboBox.setBounds(230, 186, 93, 31);
		frame.getContentPane().add(timeComboBox);
		
		JTextArea outputTextArea = new JTextArea();
		outputTextArea.setEnabled(false);
		outputTextArea.setBounds(45, 279, 400, 150);
		frame.getContentPane().add(outputTextArea);
	}
}
