package jersey.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersey.Service.UserService;
import jersey.model.User;

@Path("/user")
public class UserResource {
	UserService userService = new UserService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUser() {
		return userService.getAllUsers();
	}

}
