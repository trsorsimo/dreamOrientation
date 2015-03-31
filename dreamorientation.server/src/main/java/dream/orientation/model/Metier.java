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
}