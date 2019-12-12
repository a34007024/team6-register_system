package team6.ntunhs.javaProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		nameTextField.setBounds(130, 49, 100, 35);
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
		
		JComboBox<String> genderComboBox = new JComboBox();
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] {"先生", "女士"}));
		genderComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		genderComboBox.setBounds(350, 50, 100, 35);
		frame.getContentPane().add(genderComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("科別:");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(56, 112, 64, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox<String> departmentComboBox = new JComboBox();
		departmentComboBox.setModel(new DefaultComboBoxModel(new String[] {"精神科", "內科", "外科", "婦產科"}));
		departmentComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		departmentComboBox.setBounds(130, 110, 100, 35);
		frame.getContentPane().add(departmentComboBox);
		
		JLabel lblNewLabel_3 = new JLabel("醫師:");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(259, 113, 82, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox<String> doctorComboBox = new JComboBox();
		doctorComboBox.setModel(new DefaultComboBoxModel(new String[] {"杜豐于", "杜美心", "鞏俐芳"}));
		doctorComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		doctorComboBox.setBounds(350, 110, 100, 35);
		frame.getContentPane().add(doctorComboBox);
		
		JLabel lblNewLabel_4 = new JLabel("門診時段:");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(130, 180, 130, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox<String> timeComboBox = new JComboBox();
		timeComboBox.setModel(new DefaultComboBoxModel(new String[] {"星期一早上", "星期一下午", "星期二早上", "星期二下午", "星期三早上", "星期三下午", "星期四早上", "星期四下午", "星期五早上", "星期五下午"}));
		timeComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		timeComboBox.setBounds(250, 180, 150, 35);
		frame.getContentPane().add(timeComboBox);
		
		JTextArea outputTextArea = new JTextArea();
		outputTextArea.setEnabled(false);
		outputTextArea.setBounds(43, 303, 400, 150);
		frame.getContentPane().add(outputTextArea);
		
		JButton confirmButton = new JButton("確定");
		confirmButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		confirmButton.setBounds(130, 240, 85, 35);
		frame.getContentPane().add(confirmButton);
		
		JButton leaveButton = new JButton("離開");
		leaveButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		leaveButton.setBounds(253, 240, 85, 35);
		frame.getContentPane().add(leaveButton);
		leaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}
