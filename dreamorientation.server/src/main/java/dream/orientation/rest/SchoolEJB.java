package dream.orientation.rest;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.metamodel.SingularAttribute;

import dream.orientation.model.School;
import dream.orientation.repo.SchoolRepo;

@Stateless
public class SchoolEJB { 
	
    @Inject
	private SchoolRepo repository;

	public School create(School entity)

	{
		return entity;

	}

	public School deleteById(String id) {
		return null;

	}

	public School update(School entity)
	{
		return entity;

	}
	public School findById(String id)
	   {
	      return detach(repository.findBy(id));
	   }
	
	private School detach(School entity) {
		if(entity==null) return null;
		
		return entity;
	}
	public List<School> detach(List<School> entities){
		for (School school : entities) {
			detach(school);
		}
		return entities;
	}


}
