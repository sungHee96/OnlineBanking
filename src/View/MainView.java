package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainView extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public MainView() {
		setTitle("WH Bank");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NewItemPopupView mainFrame = new NewItemPopupView();
		mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		mainFrame.setVisible(true);
		
		JButton btnNewButton = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyPageView mainFrame = new MyPageView();
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(288, 15, 123, 27);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C_1011-15234-07"}));
		comboBox.setBounds(59, 168, 312, 27);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC124\uB41C \uACC4\uC88C\uD604\uD669");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 17));
		lblNewLabel.setBounds(29, 136, 132, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4!");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(198, 87, 132, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC870\uC6A9\uD604");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 22));
		lblNewLabel_2.setBounds(111, 89, 78, 27);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(29, 217, 370, 143);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("\uC790\uC720\uC785\uCD9C\uAE08\uACC4\uC88C");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(17, 15, 215, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1011-15234-07");
		lblNewLabel_4.setFont(new Font("����", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(210, 15, 143, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("1,555,569,030");
		lblNewLabel_5.setFont(new Font("����", Font.BOLD, 24));
		lblNewLabel_5.setBounds(83, 77, 176, 39);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uC6D0");
		lblNewLabel_6.setBounds(261, 83, 40, 21);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\uC794\uC561");
		lblNewLabel_7.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(47, 59, 47, 21);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(17, 62, 394, 433);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uC785\uAE08");
		btnNewButton_1.setBounds(17, 312, 69, 41);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCD9C\uAE08");
		btnNewButton_2.setBounds(89, 312, 69, 41);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uACC4\uC88C\uC774\uCCB4");
		btnNewButton_3.setBounds(162, 312, 112, 41);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uAC70\uB798\uB0B4\uC5ED");
		btnNewButton_4.setBounds(276, 312, 107, 41);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uACC4\uC88C \uB4F1\uB85D");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountRegistrationView mainFrame = new AccountRegistrationView();
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(17, 363, 360, 55);
		panel_1.add(btnNewButton_5);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionHistoryView mainFrame = new TransactionHistoryView();
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountTransferView mainFrame = new AccountTransferView();
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WithdrawView mainFrame = new WithdrawView();
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DepositView mainFrame = new DepositView();
				mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				mainFrame.setVisible(true);
				
			}
		});
	}
}
