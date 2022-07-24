package test_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class diagnose_input extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField idtxt;
	private JTextField agetxt;
	private JTextField WBC_input;
	private JTextField Neut_input;
	private JTextField Lymph_input;
	private JTextField RBC_input;
	private JTextField HCT_input;
	private JTextField Urea_input;
	private JTextField Hb_input;
	private JTextField creatine_input;
	private JTextField Iron_input;
	private JTextField HDL_input;
	private JTextField ph_A_input;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private boolean gender;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					diagnose_input frame = new diagnose_input();
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
	public diagnose_input() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel WBC = new JLabel("(WBC)white Blood Cells");
		
		JLabel Neut = new JLabel("(Neut) Neutrophil\r");
		
		JLabel lymph = new JLabel("(Lymph) Lymphocytes\r");
		
		JLabel RBC = new JLabel("(RBC) Red Blood Cells\r");
		
		JLabel HCT = new JLabel("HCT");
		
		JLabel Urea = new JLabel("Urea");
		
		JLabel Hemoglobin = new JLabel("(Hb) Hemoglobin\r");
		
		JLabel creatine = new JLabel("creatine");
		
		JLabel Iron = new JLabel(" Iron");
		
		JLabel HDL = new JLabel("(HDL)High Density Lipoprotein\r");
		
		JLabel Ph_A = new JLabel("Phosphatase Alkaline\r");
		
		JLabel title = new JLabel("Patient information");
		title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel p_name = new JLabel("name:");
		p_name.setToolTipText("");
		
		JLabel p_Id = new JLabel("Id:");
		
		JLabel P_gender = new JLabel("gender:");
		
		JRadioButton male_btn = new JRadioButton("male");
		male_btn.setSelected(true);
		male_btn.setBackground(SystemColor.activeCaption);
		
		JRadioButton female_btn = new JRadioButton("female");
		female_btn.setBackground(SystemColor.activeCaption);
		buttonGroup.add(female_btn);
		buttonGroup.add(male_btn);
		
		if(buttonGroup.getSelection()==female_btn.getModel()) {
			gender=true;
		}
		if(buttonGroup.getSelection()==male_btn.getModel()) {
			gender=false;
		}
		nametxt = new JTextField();
		nametxt.setText("osama");
		nametxt.setColumns(10);
		
		idtxt = new JTextField();
		idtxt.setText("113");
		idtxt.setColumns(10);
		
		JLabel p_age = new JLabel("age:");
		
		agetxt = new JTextField();
		agetxt.setText("22");
		agetxt.setColumns(10);
		
		WBC_input = new JTextField();
		WBC_input.setText("1.1");
		WBC_input.setToolTipText("");
		WBC_input.setName("");
		WBC_input.setActionCommand("");
		WBC_input.setColumns(10);
		
		Neut_input = new JTextField();
		Neut_input.setText("0");
		Neut_input.setColumns(10);
		
		Lymph_input = new JTextField();
		Lymph_input.setText("0");
		Lymph_input.setColumns(10);
		
		RBC_input = new JTextField();
		RBC_input.setText("0");
		RBC_input.setColumns(10);
		
		HCT_input = new JTextField();
		HCT_input.setText("0");
		HCT_input.setColumns(10);
		
		Urea_input = new JTextField();
		Urea_input.setText("0");
		Urea_input.setColumns(10);
		
		Hb_input = new JTextField();
		Hb_input.setText("0");
		Hb_input.setColumns(10);
		
		creatine_input = new JTextField();
		creatine_input.setText("0");
		creatine_input.setColumns(10);
		
		Iron_input = new JTextField();
		Iron_input.setText("0");
		Iron_input.setColumns(10);
		
		HDL_input = new JTextField();
		HDL_input.setText("0");
		HDL_input.setColumns(10);
		
		ph_A_input = new JTextField();
		ph_A_input.setText("0");
		ph_A_input.setColumns(10);
		
		JCheckBox smoking = new JCheckBox("are you Smoking?");
		smoking.setBackground(SystemColor.activeCaption);
		
		JCheckBox pregnant = new JCheckBox("are you Pregnant?");
		pregnant.setBackground(SystemColor.activeCaption);
		
		JCheckBox Asian = new JCheckBox("are you Asian?");
		Asian.setBackground(SystemColor.activeCaption);
		
		JCheckBox Ethiopian = new JCheckBox("are you Ethiopian?");
		Ethiopian.setBackground(SystemColor.activeCaption);
		
		JButton diagnose_btn = new JButton("diagnose");
		diagnose_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					paitent temp=new paitent(nametxt.getText(), idtxt.getText(), gender,Integer.parseInt(agetxt.getText()));	

					temp.setWBC(WBC_input.getText());
					temp.setHCT(HCT_input.getText());
					temp.setNeut(Neut_input.getText());
					temp.setLymph(Lymph_input.getText());
					temp.setRBC(RBC_input.getText());
					temp.setUrea(Urea_input.getText());
					temp.setHemoglobin(Hb_input.getText());
					temp.setCreatine(creatine_input.getText());
					temp.setIron(Iron_input.getText());
					temp.setHDL(HDL_input.getText());
					temp.setPh_A(ph_A_input.getText());
					temp.setAsian(Asian.isSelected());
					temp.setSmoking(smoking.isSelected());
					temp.setEthiopian(Ethiopian.isSelected());
					temp.setPregnant(pregnant.isSelected());
					
					temp.main_diagnose();
					
			}
		});
		
		//////////////////////////////////////////
		
		
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(p_name, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nametxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(p_Id, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(P_gender, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(female_btn)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(male_btn))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(p_age, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(agetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(HCT, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(Urea, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(Hemoglobin, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(creatine, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(Iron, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(HDL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Ph_A, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(WBC, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
								.addComponent(Neut, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lymph, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(RBC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ph_A_input, 0, 0, Short.MAX_VALUE)
								.addComponent(HDL_input, 0, 0, Short.MAX_VALUE)
								.addComponent(Iron_input, 0, 0, Short.MAX_VALUE)
								.addComponent(creatine_input, 0, 0, Short.MAX_VALUE)
								.addComponent(Hb_input, 0, 0, Short.MAX_VALUE)
								.addComponent(Urea_input, 0, 0, Short.MAX_VALUE)
								.addComponent(HCT_input, 0, 0, Short.MAX_VALUE)
								.addComponent(RBC_input, 0, 0, Short.MAX_VALUE)
								.addComponent(Lymph_input, 0, 0, Short.MAX_VALUE)
								.addComponent(Neut_input, 0, 0, Short.MAX_VALUE)
								.addComponent(WBC_input, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(pregnant, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGap(22)
										.addComponent(diagnose_btn)
										.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
								.addComponent(smoking, Alignment.LEADING)
								.addComponent(Asian, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
							.addGap(35))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(Ethiopian, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
							.addContainerGap())))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(149, Short.MAX_VALUE)
					.addComponent(title)
					.addGap(134))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addComponent(title)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(p_name)
						.addComponent(nametxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(smoking))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(p_Id)
						.addComponent(idtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(pregnant))
					.addGap(3)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(P_gender)
						.addComponent(female_btn)
						.addComponent(male_btn)
						.addComponent(Asian))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(p_age)
								.addComponent(agetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(WBC, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(WBC_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(Neut)
								.addComponent(Neut_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lymph)
								.addComponent(Lymph_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(RBC)
								.addComponent(RBC_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(HCT)
								.addComponent(HCT_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(Urea)
								.addComponent(Urea_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(Hemoglobin)
								.addComponent(Hb_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(creatine)
								.addComponent(creatine_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(Iron)
								.addComponent(Iron_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(HDL)
								.addComponent(HDL_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(ph_A_input, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(Ph_A))
							.addGap(9))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Ethiopian)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(diagnose_btn)
					.addGap(19))
		);
		panel.setLayout(gl_panel);
	}


}
