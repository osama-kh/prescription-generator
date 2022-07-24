package test_project;

import java.io.FileWriter;
import java.io.IOException;

public class diagnose_result {
	String patient_name;
	String id;
	String gender;
	int age;
	String info;
	diagnose_output output;
	public diagnose_result(	String patient_name,String id,boolean gender,int age) {
		this.patient_name=patient_name;
		this.id=id;
		if(gender==true) {
			this.gender="female";
		}
		else if (gender==false) {
			this.gender="male";
		}
		this.age=age;
		info=new String();

	}
	public void info_writer(String new_d) {
		info+=new_d+"\n";
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		if(gender==true) {
			this.gender="female";
		}
		else if (gender==false) {
			this.gender="male";
		}
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void save_to_file() {
		 try {
		      FileWriter myWriter = new FileWriter("C:\\Users\\okhaw\\eclipse-workspace\\test_project\\src\\test_project\\Diagnose\\Patient diagnose.txt");
		      myWriter.write("\nname: "+patient_name+"\n");
		      myWriter.write("id: "+id+"\n");
		      myWriter.write("gender: "+gender+"\n");
		      myWriter.write("age: "+age+"\n\n");
		      myWriter.write(this.info);
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	void diagnose_output_frame() {
		output=new diagnose_output("\nname: "+patient_name+"\n"+"id: "+id+"\n"+
				"gender: "+gender+"\n"+"age: "+age+"\n\n"+info);
		output.getFrame().setVisible(true);
		
	}
	
	
	

}
