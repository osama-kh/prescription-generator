package test_project;

public class doctor_database {
	
	doctor[] doctors;
	
	public doctor[] getDoctors() {
		return doctors;
	}

	public void setDoctors(doctor[] doctors) {
		this.doctors = doctors;
	}

	public doctor_database() {
		this.doctors=new doctor[2];
		doctor d_true=new doctor("1osama2", "1", "#s123456");
		doctor d_false=new doctor("xtro", "2", "12345678");
		this.doctors[0]=d_true;
		this.doctors[1]=d_false;
	}
}
