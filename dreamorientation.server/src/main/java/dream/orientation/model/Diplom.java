package dream.orientation.model;

import javax.persistence.Entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

import dream.orientation.enumeration.Nationality;
import dream.orientation.enumeration.StudyLevel;
import dream.orientation.lib.AbstractIdentif;

import java.lang.Override;

@Entity
public class Diplom extends AbstractIdentif
{
	private String name ;
	private String intitule;
	private StudyLevel level;
	private Nationality nationality;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public StudyLevel getLevel() {
		return level;
	}
	public void setLevel(StudyLevel level) {
		this.level = level;
	}
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	
	
  
}