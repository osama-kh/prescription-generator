package test_project;

public class main_tester {

	public static void main(String args[]) {
		
		paitent temp=new paitent("ww", "www",false,7);	
		temp.setWBC("7");
		/*temp.setWBC(WBC_input.getText());
		temp.setNeut(Neut_input.getText());
		temp.setLymph(Lymph_input.getText());
		temp.setRBC(RBC_input.getText());
		temp.setUrea(Urea_input.getText());
		temp.setHemoglobin(Hb_input.getText());
		temp.setCreatine(creatine_input.getText());
		temp.setIron(Iron_input.getText());
		temp.setHDL(HDL_input.getText());
		temp.setPh_A(ph_A_input.getText());*/
		temp.main_diagnose();		
		
		
	}
	
	
	
}
