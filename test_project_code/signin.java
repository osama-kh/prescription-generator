package test_project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class signin {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField pwds;
	private JTextField textid;
	private doctor_database dbase=new doctor_database();
	static doctor selected_ac;
	ImageIcon icon= new ImageIcon("main_page2.jpg");
	int number_count=0,letter_count=0,special_counter=0;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signin window = new signin();
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
	public signin() { 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 368, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setForeground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("");
		
		JLabel user_label = new JLabel("user name");
		
		txtUserName = new JTextField();
		txtUserName.setText("1osama2");
		txtUserName.setToolTipText("User_name\r\n");
		txtUserName.setColumns(10);
		
		JLabel password_label = new JLabel("Password");
		
		pwds = new JPasswordField();
		pwds.setText("#s123456");
		pwds.setToolTipText("password\r\n");
		pwds.setColumns(10);
		
		JLabel id_label = new JLabel("ID");
		
		textid = new JTextField();
		textid.setText("1");
		textid.setToolTipText("id");
		textid.setColumns(10);
		
		JButton btnNewButton = new JButton("sign in\r\n");
		btnNewButton.setToolTipText("sign_in");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				signin_listner();				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Exit\r\n");
		btnNewButton_1.setToolTipText("exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		JLabel welcome_label = new JLabel("welcome doctor please enter your information");
		welcome_label.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lbl_bic = new JLabel(" ");
		lbl_bic.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_bic.setFont(new Font("Tahoma", Font.PLAIN, 30));
		icon.setDescription("sign in");
		lbl_bic.setIcon(icon);
		JLabel lblNewLabel = new JLabel("Sign in");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(354, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(id_label)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(user_label)
							.addComponent(password_label))
						.addComponent(btnNewButton))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(pwds, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton_1))
					.addContainerGap(64, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(welcome_label, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(139)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lbl_bic, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lbl_bic, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(welcome_label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(user_label))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(password_label)
						.addComponent(pwds, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(id_label))
					.addGap(51)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(75))
		);
		panel.setLayout(gl_panel);
	}
	
	
	@SuppressWarnings("deprecation")
	void signin_listner() {
		String user=txtUserName.getText();
		String id =textid.getText();
		String password=pwds.getText();
		boolean block=true;
		if(check_username(user)==false) {
			error_dialog d=new error_dialog("user name");
			d.setVisible(true);
			block=false;
		}
		if(check_password(password)==false) {
			error_dialog d=new error_dialog("password");
			d.setVisible(true);
			block=false;
		}
			
			
			if (block==true) {
		for(doctor i: dbase.getDoctors()) {
			if(i.getuser_name().equals(user) && i.getPassword().equals(password) && i.getId().equals(id)) {
				selected_ac=i;
				doctor_account temp=new doctor_account();
				frame.setVisible(false);
				temp.getFrame().setVisible(true);
			}	
		}
	}
		
	}
		
		
		
		
		
		
		
	
	boolean check_username(String name) {
		int countr_number=0;
		if(name.length()>8 ||name.length()<6 ) {
			return false;
		}
		else {
			for(int i=0;i<name.length();i++) {
				for(int j=0;j<10;j++) {
				if(name.charAt(i)==j) { 
					countr_number++;	
				}}
				
			}
			if(countr_number>2) {
				return false;
			}
			else {
				return true;
			}}}		
		
	
	boolean check_password(String pass) {
		if(pass.length()>10 || pass.length()<8) {
			return false;
		}
		else {
			for(int i=0;i<pass.length();i++) {
				for_tester(i, pass);
			}
			if(number_count<1 || letter_count<1 || special_counter<1) {
				return false;
			}
			else {
				return true;
			}
		}	
	}
	
	
	void for_tester(int i,String pass) {
		
		for(int j=0;j<128;j++) {
			if((int)pass.charAt(i)>=65 || (int)pass.charAt(i)<=90 ) 
				letter_count++;	
			if((int)pass.charAt(i)>=97 || (int)pass.charAt(i)<=122 ) 
				letter_count++;
			if((int)pass.charAt(i)>=48 || (int)pass.charAt(i)<=57 ) 
				number_count++;
			if((int)pass.charAt(i)>=32 || (int)pass.charAt(i)<=47 ) 
				special_counter++;
			if((int)pass.charAt(i)>=58 || (int)pass.charAt(i)<=64 ) 
				special_counter++;
			}
		
		
	}
}
