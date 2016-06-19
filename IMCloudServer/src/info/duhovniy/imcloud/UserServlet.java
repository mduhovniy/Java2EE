package info.duhovniy.imcloud;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserServlet {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User[] getAllUsers() {
		ArrayList<User> temp = MySQLDBHandler.getAllUsers();
		User[] items = new User[temp.size()];
		return temp.toArray(items);
	}

	@Path("/get-user")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@QueryParam("email") String email) {
		User user = new User();

		user = MySQLDBHandler.getUser(email);
		
		return user;
	}

	@Path("/add-user")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addUser(User u) {

		return "# " + MySQLDBHandler.addUser(u) + " users added";

	}
	
	@Path("/update-user")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUser(User u) {

		return "# " + MySQLDBHandler.updateUser(u) + " users updated";

	}

	@Path("/remove-user")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String removeUser(User u) {

		return "# " + MySQLDBHandler.removeUser(u) + " users removed";

	}

}
