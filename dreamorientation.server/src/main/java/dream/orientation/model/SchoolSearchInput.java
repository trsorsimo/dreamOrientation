package dream.orientation.model;

import java.util.ArrayList;
import java.util.List;


public class SchoolSearchInput {
	/**
	    * The entity holding search inputs.
	    */
	   private School entity;

	   /**
	    * The start cursor
	    */
	   private int start = -1;

	   /**
	    * The max number of records to return.
	    */
	   private int max = -1;

	   /**
	    * The field names to be included in the search.
	    */
	   private List<String> fieldNames = new ArrayList<String>();

	   public School getEntity()
	   {
	      return entity;
	   }

	   public void setEntity(School entity)
	   {
	      this.entity = entity;
	   }

	   public List<String> getFieldNames()
	   {
	      return fieldNames;
	   }

	   public void setFieldNames(List<String> fieldNames)
	   {
	      this.fieldNames = fieldNames;
	   }

	   public int getStart()
	   {
	      return start;
	   }

	   public void setStart(int start)
	   {
	      this.start = start;
	   }

	   public int getMax()
	   {
	      return max;
	   }

	   public void setMax(int max)
	   {
	      this.max = max;
	   }

}
