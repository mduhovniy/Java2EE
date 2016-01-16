package jaxb.example;

	import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

	@Path("/todo")
	public class TodoService {
	 
	  @GET
	  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	  public Todo getIt1() {
	    Todo todo = new Todo();
	    todo.setSummary("This is my first todo");
	    todo.setDescription("This is my first todo");
	    return todo;
	  }
	  
	 
	  @GET
	  @Produces({ MediaType.TEXT_XML })
	  public Todo getIt2() {
	    Todo todo = new Todo();
	    todo.setSummary("todo 1");
	    todo.setDescription("This is my first todo");
	    return todo;
	  }
	  
	  @GET
	  @Path("json")
	  @Produces({ MediaType.APPLICATION_JSON })
	  public Todo getIt3() {
	    Todo todo = new Todo();
	    todo.setSummary("todo 1");
	    todo.setDescription("This is my first todo");
	    return todo;
	  }
	  
	  @GET
	  @Path("all")
	  @Produces({MediaType.APPLICATION_JSON })
	  public List<Todo> getAll() {
	    List<Todo> td=new ArrayList<Todo>();
		Todo todo1 = new Todo();
	    todo1.setSummary("todo 1");
	    todo1.setDescription("This is my first todo");
	    Todo todo2 = new Todo();
	    todo2.setSummary("todo 2");
	    todo2.setDescription("This is my second todo");
	    td.add(todo1);
	    td.add(todo2);
	    return td;
	  }

	  @POST
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  @Path("add")
	  public Todo setToDo(Todo todo){
		  System.out.println(todo.getSummary()+" - "+todo.getDescription());
		  todo.setSummary(todo.getSummary()+" *");
		  todo.setDescription(todo.getDescription()+" *");
		  return todo;
	  }
	  
	  
	} 



