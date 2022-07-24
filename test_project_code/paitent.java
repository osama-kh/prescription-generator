package test_project;



public class paitent {
	String name;
	String id;
	boolean gender;//true-female false-male
	int age;
	//Questions with an affect to diagnose
	boolean smoking;
	boolean pregnant;
	boolean Asian;
	boolean Ethiopian;
	
	//diagnose main data
	double WBC;
	double Neut;
	double lymph;
	double RBC;
	double HCT;
	double Urea;
	double Hemoglobin;
	double creatine;
	double Iron;
	double HDL;
	double Ph_A;
	//disease="therapy"
	String anemia="Two 10 mg B12 pills a day for a month\n";
	String diet ="Schedule an appointment with a nutritionist\n";
	String Bleeding="To be evacuated urgently to the hospital\n";
	String Hyperlipidemia="Schedule an appointment with a nutritionist, a 5 mg pill of Simobil daily for a week\n";
	String Disorder_of_blood="10 mg pill of B12 a day for a month\r\n"+ "5 mg pill of folic acid a day for a month\n";
	String Hematological_disorder="An injection of a hormone to encourage red blood cell production\n";
	String Iron_poisoning="to evacuate to the hospital\n";
	String Dehydration ="Complete rest while lying down, returning fluids to drinking\n";
	String Dedicated ="antibiotic infection\n";
	String Vitamin_Deficiency ="Referral for a blood test to identify the missing vitamins\n";
	String Viral_disease="to rest at home\n";
	String Diseases_of_the_biliary_tract ="Referral to surgical treatment\n";
	String Heart_disease="to schedule an appointment with a nutritionist\n";
	String Blood_disease="a combination of cyclophosphamide and corticosteroids\n";
	String Liver_disease="Referral to a specific diagnosis for treatment\n";
	String Kidney_disease ="balances blood sugar levels\n";
	String Iron_deficiency="Two 10 mg pills of B12 a day for a month\n";
	String Muscle_disease="two pills 5 mg of Altman c3 turmeric a day for a month\n";
	String Smokers="quit smoking\n";
	String Lung_Disease="Stop Smoking / Referral for X-ray of the lungs\n";
	String Overactive_thyroid_gland="Propylthiouracil to reduce thyroid activity\n"; 
	String Adult_diabetes="Insulin adjustment for patient\n";
	String cancer="Entrectinib\n";
	String Increased_consumption_of_meat="to coordinate an appointment with a nutritionist\n";
	String Use_of_various_medications="Referral to a family doctor for a match between medications\n";
	String Malnutrition="Schedule an appointment with a nutritionist\n";
	
	public paitent(String name,String id,boolean gender,int age) {
		this.name=name;
		this.id=id;
		this.gender=gender; 
		this.age=age;
	}

	//////////////////////////////////////////////////////////////////////////////////	
	diagnose_result p_diagnose=new diagnose_result(name, id, gender,age);
	
	

	
	
	
	public void main_diagnose() {
		p_diagnose.setPatient_name(name);
		p_diagnose.setGender(gender);
		p_diagnose.setId(id);
		p_diagnose.setAge(age);
		//WBC check///////////////////////////////////////////////////////////
		p_diagnose.info_writer("WBC\n");
		if(age<=3 && age>=0) {
						if(WBC<6000) {
				p_diagnose.info_writer("Indicate viral disease, immune system failure and in very rare cases cancer:\n"+
			"therapy:"+Viral_disease+"if there was complications of cancer than "+cancer);
			}
						else if(WBC>17500) {
				p_diagnose.info_writer("Most often indicate the presence of an infection, if there is a fever. In other "
									+ "cases, very rare, may Very high values indicate blood disease or cancer.\n"+
									"therapy:"+Dedicated+"in rare situation if there was blood disease than:"+Blood_disease
									+"\n"+"if cancer:"+cancer);
			}
						else{p_diagnose.info_writer("good\n");};
		}
		if(age<=17 && age>=4) {
			if(WBC<5500) {
		
			p_diagnose.info_writer("Indicate viral disease, immune system failure and in very rare cases cancer:\n"+
		"therapy:"+Viral_disease+"if there was complications of cancer than "+cancer);
		}
		else if(WBC>15500) {
			p_diagnose.info_writer("Most often indicate the presence of an infection, if there is a fever. In other "
								+ "cases, very rare, may Very high values indicate blood disease or cancer.\n"+
								"therapy:"+Dedicated+"in rare situation if there was blood disease than:"+Blood_disease
								+"\n"+"if cancer:"+cancer);
		}
		else{p_diagnose.info_writer("good\n");};
		}
		
		if(age>=18) {
			if(WBC<4500) {
		
			p_diagnose.info_writer("Indicate viral disease, immune system failure and in very rare cases cancer:\n"+
		"therapy:"+Viral_disease+"if there was complications of cancer than "+cancer);
		}
			else if(WBC>11000) {
			p_diagnose.info_writer("Most often indicate the presence of an infection, if there is a fever. In other "
								+ "cases, very rare, may Very high values indicate blood disease or cancer.\n"+
								"therapy:"+Dedicated+"in rare situation if there was blood disease than:"+Blood_disease
								+"\n"+"if cancer:"+cancer);
		}		
		else{p_diagnose.info_writer("good\n");};
}
		///////////////////////////////////////////////////////////////////////////////	
		//Neut check	
		p_diagnose.info_writer("Neut\n");

		if(Neut<28) {
			p_diagnose.info_writer("Indicate a disorder in the formation of blood, a tendency to bacterial infections\n "
					+ "and in rare cases - a process cancerous.\n"+
					"therapy:"+Disorder_of_blood+"in case of bacterial infections"+Dedicated+". if there was complications"
							+ " of cancer than "+cancer);
				
			}
		else if(Neut>54) {
				p_diagnose.info_writer("Most often indicate a bacterial infection.\n"+
						"therapy:"+"in case of bacterial infections"+Dedicated);
			}
		else{p_diagnose.info_writer("good\n");};

		///////////////////////////////////////////////////////////////////////////////	
			// lymph check
		p_diagnose.info_writer("lymph\n");
			if(lymph<36) {
				p_diagnose.info_writer("Indicate a problem in the formation of blood cells.\n"+
						"therapy:"+Disorder_of_blood);
			}
			else if(lymph>52) {
				p_diagnose.info_writer("May indicate a prolonged bacterial infection or lymphoma cancer.\n"+
						"therapy:"+"in case of bacterial infections"+Dedicated+". if there was complications"
						+ " of cancer than "+cancer);
			}
			else{p_diagnose.info_writer("good\n");};

		///////////////////////////////////////////////////////////////////////////////	
			//RBC check
			p_diagnose.info_writer("RBC\n");
			if(RBC<4.5) {
				p_diagnose.info_writer("May indicate anemia or severe bleeding.\n"+
						"therapy:"+"in case of anemia "+anemia+",in case of bleeding "+Bleeding);
				
			}
			else if(RBC>6) {
				if(smoking==true) {
				p_diagnose.info_writer("May indicate a disturbance in the blood production system. "
						+ "High levels were also observed in smokers and in patients In lung diseases.\n"+
						"therapy:"+Disorder_of_blood+"in case that the paitent smoke than "+Smokers+"to the"
								+ " patients with lung diseases "+ Lung_Disease);
				}
				else {p_diagnose.info_writer("May indicate a disturbance in the blood production system. "
						+ "High levels were also observed in smokers and in patients In lung diseases.\n"+
						"therapy:"+Disorder_of_blood);
				
					
				}
			}
			else{p_diagnose.info_writer("good\n");};
		
			/////////////////////////////////////////////////////////////////////////////// 	
			//HCT check
			p_diagnose.info_writer("HCT\n");

			if(gender==true && HCT<33 || gender==false && HCT<37 ) {
				p_diagnose.info_writer("Most often indicate bleeding or anemia.\n"+
						"therapy:"+"in bleeding case "+Bleeding+"in anemia case"+anemia);	
				
			}
			
			else if(gender==true && HCT>47 && smoking==true || gender==false && HCT>54 && smoking==true ) {
				p_diagnose.info_writer("Common in smokers.\n"+
						"therapy:"+Smokers);	
				
			}
			else{p_diagnose.info_writer("good\n");};

			///////////////////////////////////////////////////////////////////////////////	
			//Urea check
			p_diagnose.info_writer("Urea\n");

			if(Urea<17 || Asian==true && Urea<17*1.1 || pregnant==true) {
				
					p_diagnose.info_writer("Malnutrition, low-protein diet or liver disease. It should be\n"
							+ "noted that during pregnancy the level of urination decreases.\n"+"therapy: "
							+"in the Malnutrition case "+Malnutrition+" in case of low protien diet "+diet+"in case of Liver_disease "+Liver_disease);
				
			}
			else if(Urea>43 || Asian==true && Urea>43*1.1) {
				p_diagnose.info_writer("May indicate kidney disease, dehydration or a high protein diet.\n"+
			"therapy: "+"in case of kidney disease "+Kidney_disease+",in case of dehydration "+Dehydration+"in case of high protein diet "+ diet);
			}
			else{p_diagnose.info_writer("good\n");};

			///////////////////////////////////////////////////////////////////////////////	
			//Hemoglobin check
			p_diagnose.info_writer("Hemoglobin\n");
			if(gender==true && Hemoglobin>=12 &&Hemoglobin<=16 ||
			gender==false && Hemoglobin>=12 && Hemoglobin<=18 ||
			age>=0 && age<=17 && Hemoglobin>=11.5 && Hemoglobin<=15.5) {
				p_diagnose.info_writer("good\n");
			}
			else if (gender==true && Hemoglobin<12 ||
					gender==false && Hemoglobin<12 ||
					age>=0 && age<=17 && Hemoglobin<11.5) {
				p_diagnose.info_writer("Indicates anemia. This can be due to hematologic disorder, iron deficiency and bleeding.\n"+
					"therapy: "+"in case of anemia "+anemia+"in case of hematologic disorder "+Hematological_disorder+"in case of iron deficiency "
						+Iron_deficiency+"in case of bleeding "+Bleeding);
				
			}
			///////////////////////////////////////////////////////////////////////////////	
			//creatine check
			p_diagnose.info_writer("creatine\n");
			if(age>=0 && age<=2 && creatine<0.2 || 
					age>=3 && age<=17 && creatine<0.5||
					age>=18 && age<=59 && creatine<0.6||
					age>=60 && creatine<0.6) {
				p_diagnose.info_writer("Most commonly seen in patients with very poor muscle mass and malnourished people who do \n "
						+ "not consume enough protein.\n"+"therapy: "+Malnutrition);
				
			}
			else if(age>=0 && age<=2 && creatine>0.5 || 
					age>=3 && age<=17 && creatine>1||
					age>=18 && age<=59 && creatine>1||
					age>=60 && creatine>1.2) {
				p_diagnose.info_writer("May indicate a kidney problem and in severe cases kidney failure. High values are possible\n"
						+ "Also found in diarrhea and vomiting (causes of increased muscle breakdown and high levels of creatinine),\n"
						+ " muscle diseases And increased consumption of meat.\n"+"therapy: "+Muscle_disease+Increased_consumption_of_meat);
			}
			else{p_diagnose.info_writer("good\n");};
			
			///////////////////////////////////////////////////////////////////////////////	
			//Iron check
			p_diagnose.info_writer("Iron\n");
			if(Iron<60 || Iron<60*0.8 && gender==true || pregnant==true && gender==true) {
				p_diagnose.info_writer("Usually indicates an inadequate diet or an increase in the need for iron (for example during pregnancy)\n"
						+ " or blood loss Following bleeding.\n"+"therapy: "+"in case of inadequate diet "+diet+"in case of Iron deficiency "+Iron_deficiency+"in case of Bleeding "+Bleeding);
				
				
			}
			else if(Iron<60 || Iron<60*0.8 && gender==true) {
				p_diagnose.info_writer("May indicate iron poisoning.\n"+"therapy: "+Iron_poisoning);
				
				
			}
			else{p_diagnose.info_writer("good\n");};

			///////////////////////////////////////////////////////////////////////////////	
			//(HDL) High Density Lipoprotein check
			p_diagnose.info_writer("HDL\n");
			if(Iron<29 && gender==false || Iron<34 && gender==true ||
					Iron<29*1.2 && gender==false && Ethiopian==true ||
					Iron<34*1.2 && gender==true && Ethiopian==true) {
				p_diagnose.info_writer("May indicate a risk of heart disease, hyperlipidemia or adult-onset diabetes.\n"+
					"therapy: "+"in case of heart disease "+Heart_disease+"in case of heart hyperlipidemia "+Hyperlipidemia
					+"in case of Adult diabetes "+Adult_diabetes);
				
				
			}
			else if(Iron>62 && gender==false || Iron>82 && gender==true ||
					Iron>62*1.2 && gender==false && Ethiopian==true ||
					Iron>82*1.2 && gender==true && Ethiopian==true) {
				p_diagnose.info_writer("Are usually harmless. Exercise raises \"good\" cholesterol levels.\n");
				
				
			}
			else{p_diagnose.info_writer("good\n");};
			///////////////////////////////////////////////////////////////////////////////	
			//Alkaline phosphatase check
			p_diagnose.info_writer("Alkaline phosphatase\n");
			if(Ph_A<60 && Asian==true || Ph_A<30) {
				p_diagnose.info_writer("May indicate a poor diet that lacks protein. Deficiency in vitamins like vitamin, vitamin B12, C\n"
					+"Vitamin B6 folic acid.\n"+"therapy: "+"in case of poor diet "+diet+"in case of Vitamin Deficiency"+Vitamin_Deficiency);
				
			}
			else if(Ph_A>120 && Asian==true || Ph_A>90|| pregnant==true) {
				p_diagnose.info_writer("May indicate liver disease, biliary tract disease, pregnancy, hypothyroidism or\n"
						+ "Use of various medications.\n"+"therapy: "+"in case of Liver disease "+Liver_disease+"in case of tract disease "
						+Diseases_of_the_biliary_tract+"in case of hypothyroidism "+Hyperlipidemia);
			}
			else{p_diagnose.info_writer("good\n");};
		
			///////////////////////////////////////////////////////////////////////////////
			p_diagnose.save_to_file();
			p_diagnose.diagnose_output_frame();
	//System.out.println(p_diagnose.getInfo());
			
	}
		
	////////////////////////////////////////////////////////////////////getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public boolean isPregnant() {
		return pregnant;
	}

	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}

	public boolean isAsian() {
		return Asian;
	}

	public void setAsian(boolean asian) {
		Asian = asian;
	}

	public boolean isEthiopian() {
		return Ethiopian;
	}

	public void setEthiopian(boolean ethiopian) {
		Ethiopian = ethiopian;
	}

	public double getWBC() {
		return WBC;
	}
	
	public double converter(String num) {
		double temp=Double.parseDouble(num);
		
		return temp;
		
	}
	
	public void setWBC(String wBC) {
		
		WBC = converter(wBC);
	}

	public double getNeut() {
		return Neut;
	}

	public void setNeut(String neut) {
		Neut = converter(neut);
	}

	public double getLymph() {
		return lymph;
	}

	public void setLymph(String lymph) {
		this.lymph = converter(lymph);
	}

	public double getRBC() {
		return RBC;
	}

	public void setRBC(String rBC) {
		RBC = converter(rBC);
	}

	public double getHCT() {
		return HCT;
	}

	public void setHCT(String hCT) {
		HCT = converter(hCT);
	}

	public double getUrea() {
		return Urea;
	}

	public void setUrea(String urea) {
		Urea = converter(urea);
	}

	public double getHemoglobin() {
		return Hemoglobin;
	}

	public void setHemoglobin(String hemoglobin) {
		Hemoglobin = converter(hemoglobin);
	}

	public double getCreatine() {
		return creatine;
	}

	public void setCreatine(String creatine) {
		this.creatine = converter(creatine);
	}

	public double getIron() {
		return Iron;
	}

	public void setIron(String iron) {
		Iron = converter(iron);
	}

	public double getHDL() {
		return HDL;
	}

	public void setHDL(String hDL) {
		HDL = converter(hDL);
	}

	public double getPh_A() {
		return Ph_A;
	}

	public void setPh_A(String ph_A) {
		Ph_A = converter(ph_A);
	}
	public int getAge() {
		return age;
	}
	public void setAge(String age) {
		
		this.age = Integer.parseInt(age);
	}
	


	
	 
	
	 
	

}
