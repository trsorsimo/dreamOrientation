package dream.orientation.model;

import java.util.List;

import org.adorsys.adbnsptnr.jpa.School;
import org.adorsys.adbnsptnr.jpa.SchoolSearchInput;

public class SchoolSearchResult {
	
	/*
	    * The number of entities matching this search.
	    */
	   private Long count;

	   /*
	    * The result list.
	    */
	   private List<School> resultList;

	   /*
	    * The original search input object. For stateless clients.
	    */
	   private SchoolSearchInput searchInput;

	   public SchoolSearchResult()
	   {
	      super();
	   }

	   public SchoolSearchResult(Long count, List<School> resultList,
	         SchoolSearchInput searchInput)
	   {
	      super();
	      this.count = count;
	      this.resultList = resultList;
	      this.searchInput = searchInput;
	   }

	   public Long getCount()
	   {
	      return count;
	   }

	   public List<School> getResultList()
	   {
	      return resultList;
	   }

	   public SchoolSearchInput getSearchInput()
	   {
	      return searchInput;
	   }

	   public void setCount(Long count)
	   {
	      this.count = count;
	   }

	   public void setResultList(List<School> resultList)
	   {
	      this.resultList = resultList;
	   }

	   public void setSearchInput(SchoolSearchInput searchInput)
	   {
	      this.searchInput = searchInput;
	   }

}
