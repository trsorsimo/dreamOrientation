package dream.orientation.model;

import java.util.List;
import dream.orientation.enumeration.StudyLevel;

public class SchoolDomain {
	
	private String nameSchool ;
	private DiplomDomain diplomDomain ;
	private Admission admission ;
	private long price;
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	public DiplomDomain getDiplomDomain() {
		return diplomDomain;
	}
	public void setDiplomDomain(DiplomDomain diplomDomain) {
		this.diplomDomain = diplomDomain;
	}
	public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	
}
