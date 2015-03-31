package dream.orientation.model;

import javax.persistence.Entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

import java.lang.Override;
import dream.orientation.enumeration.originRegion;
import javax.persistence.Enumerated;

@Entity
public class School extends AbstractIdentif
{

   @Column(nullable = false)
   private String name;

   @Enumerated
   private originRegion locality;

   @Column
   private String type;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public originRegion getLocality()
   {
      return locality;
   }

   public void setLocality(originRegion locality)
   {
      this.locality = locality;
   }

   public String getType()
   {
      return type;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (name != null && !name.trim().isEmpty())
         result += "name: " + name;
      if (locality != null)
         result += ", locality: " + locality;
      if (type != null && !type.trim().isEmpty())
         result += ", type: " + type;
      return result;
   }

}