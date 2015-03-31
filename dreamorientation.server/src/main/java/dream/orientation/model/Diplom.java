package dream.orientation.model;

import javax.persistence.Entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

import dream.orientation.enumeration.StudyLevel;

import java.lang.Override;

@Entity
public class Diplom extends AbstractIdentif
{
   
	private String name ;
	private String intitule;
	private StudyLevel level;
	
  
}