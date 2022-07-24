package test_project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class diagnose_output {
	String info;
	private JFrame frame;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diagnose_output window = new diagnose_output("xtro");
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
	public diagnose_output(String info) {
		this.info=info;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 698, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea d_info = new JTextArea();
		d_info.setText(info);
		JScrollPane scrollPane = new JScrollPane(d_info,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel upper_panel = new JPanel();
		upper_panel.setBackground(SystemColor.activeCaption);
		scrollPane.setColumnHeaderView(upper_panel);
		
		JLabel titlelbl = new JLabel("Patient diagnose form");
		titlelbl.setFont(new Font("Dubai", Font.BOLD, 20));
		upper_panel.add(titlelbl);
		
		JPanel side_panel = new JPanel();
		side_panel.setBackground(SystemColor.inactiveCaption);
		scrollPane.setRowHeaderView(side_panel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
			}
		});
		
		btnExit.setHorizontalTextPosition(SwingConstants.CENTER);
		btnExit.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnExit.setVerticalAlignment(SwingConstants.BOTTOM);
		GroupLayout gl_side_panel = new GroupLayout(side_panel);
		gl_side_panel.setHorizontalGroup(
			gl_side_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_side_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_side_panel.setVerticalGroup(
			gl_side_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_side_panel.createSequentialGroup()
					.addContainerGap(542, Short.MAX_VALUE)
					.addComponent(btnExit)
					.addGap(21))
		);
		side_panel.setLayout(gl_side_panel);
		
	}
}
