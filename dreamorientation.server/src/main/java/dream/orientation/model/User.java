package dream.orientation.model;

import javax.persistence.Entity;

import java.io.Serializable;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

import java.lang.Override;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER")
public class User extends AbstractIdentif
{
	 @Column(nullable = false)
	   private String name;

	   @Column(nullable = false)
	   @Temporal(TemporalType.DATE)
	   private Date dateNais;

  
   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public Date getDateNais()
   {
      return dateNais;
   }

   public void setDateNais(Date dateNais)
   {
      this.dateNais = dateNais;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (name != null && !name.trim().isEmpty())
         result += ", name: " + name;
      if (dateNais != null)
         result += ", dateNais: " + dateNais;
      return result;
   }
}