package info.duhovniy.imcloud;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/send")
public class MessageServlet {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String sendMessage(Message m) {

		return GcmSender.sendToGcm(m);

	}

}
