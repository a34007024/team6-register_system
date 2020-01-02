package team6.ntunhs.javaProject;

import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ItemEvent;

public class mainPage {

	private JFrame frame;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//windowbuilder自動產生
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
		frame = new JFrame("門診掛號系統--Simple Version");
		frame.getContentPane().setFont(new Font("新細明體", Font.PLAIN, 18));
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("新細明體", Font.PLAIN, 18));
		nameTextField.setBounds(100, 49, 130, 35);
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
		genderComboBox.setBounds(320, 50, 130, 35);
		frame.getContentPane().add(genderComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("科別:");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(56, 112, 64, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("醫師:");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(259, 113, 82, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		String[] defaultTime = {"星期一早上", "星期一下午", "星期二早上", "星期二下午", "星期三早上", "星期三下午", "星期四早上", "星期四下午", "星期五早上", "星期五下午"};
		//不同醫師的門診時段清單
		String[] time0 = {"星期一下午","星期二下午", "星期三下午", "星期四下午", "星期五下午"};
		String[] time1 = {"星期一早上", "星期二早上", "星期三早上",  "星期四早上",  "星期五早上"};
		String[] time2 = {"星期一早上", "星期一下午", "星期三下午", "星期四早上", "星期四下午", "星期五早上", "星期五下午"};
		String[] time3 = {"星期三下午", "星期四早上", "星期四下午", "星期五早上", "星期五下午"};
		String[] time4 = {"星期一早上", "星期五早上", "星期五下午"};
		String[] time5 = {"星期四早上", "星期四下午", "星期五早上", "星期五下午"};
		String[] time6 = { "星期二下午", "星期三早上", "星期三下午", "星期四早上"};
		String[] time7 = {"星期一早上", "星期二早上", "星期三下午", "星期四早上", "星期四下午", "星期五下午"};
		String[] time8 = {"星期一下午", "星期二早上", "星期二下午", "星期三早上", "星期三下午", "星期四早上", "星期四下午", "星期五早上"};
		String[] time9 = {"星期一早上", "星期一下午", "星期二早上", "星期二下午", "星期三早上", "星期三下午", "星期四早上", "星期四下午", "星期五早上", "星期五下午"};
		String[] time10 = {"星期五早上", "星期五下午","星期六早上", "星期六下午"};
		String[] time11 = {"星期一早上", "星期五早上", "星期五下午","星期六早上", "星期六下午"};
		String[] time12 = {"星期一中午", "星期二中午", "星期三中午", "星期四中午","星期五中午","星期六中午"};
		String[] time13 = {"星期一早上", "星期一下午", "星期二早上", "星期二下午", "星期三早上", "星期三下午", "星期四早上", "星期四下午", "星期五早上", "星期五下午","星期六早上","星期六下午"};
		String[] time14 = {"星期六中午","星期六下午"};
		
		JComboBox<String> timeComboBox = new JComboBox();
		timeComboBox.setModel(new DefaultComboBoxModel(defaultTime));//預設門診時段
		timeComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		timeComboBox.setBounds(250, 166, 150, 35);
		frame.getContentPane().add(timeComboBox);
		
		String[] doc[] = new String[4][];//宣告4個字串陣列(二維陣列)
		//不同科別有不同的醫師
		doc[0] = new String[] {"杜豐于", "杜美心", "鞏俐芳"};
		doc[1] = new String[] {"丁丁（Tinky Winky）","迪西（Dipsy）","拉拉（Laa-Laa）","小波（Po）"};
		doc[2] = new String[] {"綱手", "春野櫻","靜音","藥師兜","野原凜","香燐"};
		doc[3] = new String[] {"胡椒", "牛排", "大蛇丸"};
		
		JComboBox<String> doctorComboBox = new JComboBox();
		doctorComboBox.addItemListener(new ItemListener() {//醫師下拉選單的觸發事件偵測(被點擊時觸發)
			public void itemStateChanged(ItemEvent arg0) {//如果選定的項目被更改
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "杜美心") {
					//醫師選單欄.獲取項目在(醫師選單欄.選取項目的索引值) => 會回傳選中項目的字串值
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time0));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "鞏俐芳") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time1));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "丁丁（Tinky Winky）") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time2));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "迪西（Dipsy）") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time3));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "拉拉（Laa-Laa）") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time4));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "小波（Po）") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time5));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "綱手") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time6));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "春野櫻") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time7));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "靜音") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time8));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "藥師兜") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time9));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "野原凜") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time10));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "香燐") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time11));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "胡椒") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time12));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "牛排") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time13));
				}
				if(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex()) == "大蛇丸") {
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time14));
				}
			}
		});
		doctorComboBox.setModel(new DefaultComboBoxModel(doc[0]));//預設顯示精神科門診的醫師清單
		doctorComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		doctorComboBox.setBounds(320, 110, 130, 35);
		frame.getContentPane().add(doctorComboBox);
		
		JComboBox<String> departmentComboBox = new JComboBox();
		departmentComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				doctorComboBox.setModel(new DefaultComboBoxModel(doc[departmentComboBox.getSelectedIndex()]));
				//醫師清單隨著門診科別的下拉選單項目改變(隨著index的質變動)
				if(departmentComboBox.getSelectedIndex() == 0) {//杜豐于醫師
					timeComboBox.setModel(new DefaultComboBoxModel<String>(defaultTime));
				}
				else if(departmentComboBox.getSelectedIndex() == 1) {//丁丁（Tinky Winky）醫師
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time2));
				}
				else if(departmentComboBox.getSelectedIndex() == 2) {//綱手醫師
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time6));
				}
				else if(departmentComboBox.getSelectedIndex() == 3) {//胡椒醫師
					timeComboBox.setModel(new DefaultComboBoxModel<String>(time12));
				}
			}
		});
		departmentComboBox.setModel(new DefaultComboBoxModel(new String[] {"精神科", "內科", "外科", "婦產科"}));
		departmentComboBox.setFont(new Font("新細明體", Font.PLAIN, 18));
		departmentComboBox.setBounds(100, 110, 130, 35);
		frame.getContentPane().add(departmentComboBox);
		
		JLabel lblNewLabel_4 = new JLabel("門診時段:");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(127, 163, 130, 40);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea outputTextArea = new JTextArea();
		outputTextArea.setFont(new Font("微軟正黑體", Font.BOLD | Font.ITALIC, 20));
		outputTextArea.setText("尚未完成掛號手續");//預設輸出資訊
		outputTextArea.setEnabled(false);//讓使用者無法更改輸出資訊欄的文字
		outputTextArea.setBounds(50, 258, 400, 150);
		frame.getContentPane().add(outputTextArea);
		
		JButton confirmButton = new JButton("確定");
		confirmButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		confirmButton.setBounds(137, 213, 85, 35);
		frame.getContentPane().add(confirmButton);
		confirmButton.addActionListener(new ActionListener() {//按下掛號按鈕的觸發事件
			public void actionPerformed(ActionEvent e) {
					//執行掛號動作，將選單上的各項資訊逐一加至輸出資訊欄
					if(nameTextField.getText().equals("")) {
						//進行文字判別需使用.equal()才能順利比對字串是否相同，用==是判別記憶體位址是否相等
						JOptionPane.showMessageDialog(null, "請記得填寫您的大名喔!");
					}
					else {
						outputTextArea.setText("");//先清除輸出文字框
						outputTextArea.append(nameTextField.getText() + genderComboBox.getSelectedItem()+" 您好!\n");
						outputTextArea.append("您掛的門診科別為:"+departmentComboBox.getSelectedItem() + "\n");
						outputTextArea.append("預約的看診時段為:"+timeComboBox.getSelectedItem()+"\n");
						outputTextArea.append("預約的門診醫師為:"+doctorComboBox.getSelectedItem());
					}
			}
		});
		
		JButton leaveButton = new JButton("離開");
		leaveButton.setFont(new Font("新細明體", Font.PLAIN, 18));
		leaveButton.setBounds(256, 213, 85, 35);
		frame.getContentPane().add(leaveButton);
		leaveButton.addActionListener(new ActionListener() {//離開按鈕的點擊觸發事件
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);//離開程式
			}
		});
		String filePath = "D:/掛號資訊輸出.txt";
		JButton exportDataBtn = new JButton("匯出掛號資訊");
		exportDataBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File f = new File(filePath);
				try {
					if(f.exists()) {
						//file Exist do nothing and wait for fileWriting function
					}
					else {
						f.createNewFile();
					}
					if(outputTextArea.getText().equals("成功匯出掛號資訊!檔案存放在D槽根目錄喔!")) {
						JOptionPane.showMessageDialog(null, "已經成功匯出掛號資訊囉~!");
					}
					else if(outputTextArea.getText().equals("尚未完成掛號手續")) {
						JOptionPane.showMessageDialog(null, "請先去進行掛號喔!");
					}
					else {
						BufferedWriter bWriter = new BufferedWriter(new FileWriter(filePath));
						bWriter.write(outputTextArea.getText());
						bWriter.close();
						outputTextArea.setText("成功匯出掛號資訊!檔案存放在D槽根目錄喔!");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "系統IO錯誤!");
					e.printStackTrace();
				}
			}
		});
		exportDataBtn.setFont(new Font("新細明體", Font.PLAIN, 18));
		exportDataBtn.setBounds(170, 418, 150, 35);
		frame.getContentPane().add(exportDataBtn);
		
	}
	
}
