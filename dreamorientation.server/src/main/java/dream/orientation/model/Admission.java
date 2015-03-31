package dream.orientation.model;

import java.util.List;

import dream.orientation.enumeration.StudyLevel;

public class Admission {
	
	private List <DiplomDomain> level;
	private int age ;
	private int yearsInWork ;
	
	
	public List<DiplomDomain> getLevel() {
		return level;
	}
	public void setLevel(List<DiplomDomain> level) {
		this.level = level;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearsInWork() {
		return yearsInWork;
	}
	public void setYearsInWork(int yearsInWork) {
		this.yearsInWork = yearsInWork;
	}
	
	

}
