package dream.orientation.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.metamodel.SingularAttribute;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dream.orientation.model.School;
import dream.orientation.model.SchoolSearchInput;
import dream.orientation.model.SchoolSearchResult;




@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
@Path("/school")
public class SchoolEndPoint {
	
	 @Inject
	 private SchoolEJB ejb;
	 
	 @POST
	   @Consumes({ "application/json", "application/xml" })
	   @Produces({ "application/json", "application/xml" })
	   public School create(School entity)
	   {
	      return detach(ejb.create(entity));
	   }
	 
	 @DELETE
	   @Path("/{id}")
	   public Response deleteById(@PathParam("id") String id)
	   {
	      School deleted = ejb.deleteById(id);
	      if (deleted == null)
	         return Response.status(Status.NOT_FOUND).build();

	      return Response.ok(detach(deleted)).build();
	   }

	   @PUT
	   @Path("/{id}")
	   @Produces({ "application/json", "application/xml" })
	   @Consumes({ "application/json", "application/xml" })
	   public School update(School entity)
	   {
	      return detach(ejb.update(entity));
	   }

	   @GET
	   @Path("/{id}")
	   @Produces({ "application/json", "application/xml" })
	   public Response findById(@PathParam("id") String id)
	   {
	      School found = ejb.findById(id);
	      if (found == null)
	         return Response.status(Status.NOT_FOUND).build();
	      return Response.ok(detach(found)).build();
	   }

	   @GET
	   @Produces({ "application/json", "application/xml" })
	   public SchoolSearchResult listAll(@QueryParam("start") int start,
	         @QueryParam("max") int max)
	   {
	      List<School> resultList = ejb.listAll(start, max);
	      SchoolSearchInput searchInput = new SchoolSearchInput();
	      searchInput.setStart(start);
	      searchInput.setMax(max);
	      return new SchoolSearchResult((long) resultList.size(),
	            detach(resultList), detach(searchInput));
	   }

	   @GET
	   @Path("/count")
	   public Long count()
	   {
	      return ejb.count();
	   }

	   @POST
	   @Path("/findBy")
	   @Produces({ "application/json", "application/xml" })
	   @Consumes({ "application/json", "application/xml" })
	   public SchoolSearchResult findBy(SchoolSearchInput searchInput)
	   {
	      SingularAttribute<School, ?>[] attributes = readSeachAttributes(searchInput);
	      Long count = ejb.countBy(searchInput.getEntity(), attributes);
	      List<School> resultList = ejb.findBy(searchInput.getEntity(),
	            searchInput.getStart(), searchInput.getMax(), attributes);
	      return new SchoolSearchResult(count, detach(resultList),
	            detach(searchInput));
	   }

	   @POST
	   @Path("/countBy")
	   @Consumes({ "application/json", "application/xml" })
	   public Long countBy(SchoolSearchInput searchInput)
	   {
	      SingularAttribute<School, ?>[] attributes = readSeachAttributes(searchInput);
	      return ejb.countBy(searchInput.getEntity(), attributes);
	   }

	   @POST
	   @Path("/findByLike")
	   @Produces({ "application/json", "application/xml" })
	   @Consumes({ "application/json", "application/xml" })
	   public SchoolSearchResult findByLike(SchoolSearchInput searchInput)
	   {
	      SingularAttribute<School, ?>[] attributes = readSeachAttributes(searchInput);
	      Long countLike = ejb.countByLike(searchInput.getEntity(), attributes);
	      List<School> resultList = ejb.findByLike(searchInput.getEntity(),
	            searchInput.getStart(), searchInput.getMax(), attributes);
	      return new SchoolSearchResult(countLike, detach(resultList),
	            detach(searchInput));
	   }

	   @POST
	   @Path("/countByLike")
	   @Consumes({ "application/json", "application/xml" })
	   public Long countByLike(SchoolSearchInput searchInput)
	   {
	      SingularAttribute<School, ?>[] attributes = readSeachAttributes(searchInput);
	      return ejb.countByLike(searchInput.getEntity(), attributes);
	   }
	 
	 

}
