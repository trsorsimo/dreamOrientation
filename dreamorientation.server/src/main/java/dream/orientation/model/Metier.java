package dream.orientation.model;

import javax.persistence.Entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

import dream.orientation.enumeration.StudyLevel;
import dream.orientation.lib.AbstractIdentif;

import java.lang.Override;
import java.util.List;

@Entity
public class Metier extends AbstractIdentif
{
    private String name;
    private String description;
    private long salaryMin ;
    private long salaryMax ;
    private List <DiplomDomain> levels;
    private List <Metier> nextMetier ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getSalaryMin() {
		return salaryMin;
	}
	public void setSalaryMin(long salaryMin) {
		this.salaryMin = salaryMin;
	}
	public long getSalaryMax() {
		return salaryMax;
	}
	public void setSalaryMax(long salaryMax) {
		this.salaryMax = salaryMax;
	}
	public List<DiplomDomain> getLevels() {
		return levels;
	}
	public void setLevels(List<DiplomDomain> levels) {
		this.levels = levels;
	}
	public List<Metier> getNextMetier() {
		return nextMetier;
	}
	public void setNextMetier(List<Metier> nextMetier) {
		this.nextMetier = nextMetier;
	} 
    
    
}