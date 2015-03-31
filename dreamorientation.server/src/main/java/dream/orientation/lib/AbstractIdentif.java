package dream.orientation.lib;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

public class AbstractIdentif implements Serializable {
	
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   @Column(name = "id", updatable = false, nullable = false)
	   private Long id;
	   @Version
	   @Column(name = "version")
	   private int version;

	   public Long getId()
	   {
	      return this.id;
	   }

	   public void setId(final Long id)
	   {
	      this.id = id;
	   }

	   public int getVersion()
	   {
	      return this.version;
	   }

	   public void setVersion(final int version)
	   {
	      this.version = version;
	   }


}
