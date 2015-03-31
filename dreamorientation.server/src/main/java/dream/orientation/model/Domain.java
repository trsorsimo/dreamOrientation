package dream.orientation.model;

import javax.persistence.Entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

import dream.orientation.enumeration.TypeDomain;
import dream.orientation.lib.AbstractIdentif;

import java.lang.Override;
import java.util.List;

@Entity
public class Domain extends AbstractIdentif
{
   private String name;
   private TypeDomain typeDomain;
   private List <Metier> debouches;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public TypeDomain getTypeDomain() {
	return typeDomain;
}
public void setTypeDomain(TypeDomain typeDomain) {
	this.typeDomain = typeDomain;
}
public List<Metier> getDebouches() {
	return debouches;
}
public void setDebouches(List<Metier> debouches) {
	this.debouches = debouches;
}
   
   
   
  
}