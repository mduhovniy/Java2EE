package info.duhovniy.trivialpursuit;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/query")
public class QueryService {

	private static QueryList queryList = new QueryList();

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Question[] getAllQuestions() {
		List<Question> temp = queryList.getAll();
		Question[] items = new Question[temp.size()];
		return temp.toArray(items);
	}

	@Path("/play")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Question play() {
		return queryList.getRandomQuestion();
	}

	@Path("/play-subject")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Question playSbject(@QueryParam("subject") String subject) {
		return queryList.getRandomQuestion(subject);
	}
	
	@Path("/add")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String addItem(@QueryParam("subject") String subject, @QueryParam("query") String query,
			@QueryParam("right") String right, @QueryParam("wrong1") String wrong1, @QueryParam("wrong2") String wrong2,
			@QueryParam("wrong3") String wrong3) {
		Question q = new Question(subject, query, right, wrong1, wrong2, wrong3);
		queryList.addQuestion(q);
		return "Question #" + q.getID() + " was added successfully";
	}

	@Path("/delete")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String removeItem(@QueryParam("id") String id) {
		int i;

		try {
			i = Integer.valueOf(id);
			if (queryList.removeQuestion(i))
				return "Question #" + id + " was deleted successfully";
			else
				return "Sorry there is no such ID!";

		} catch (NumberFormatException e) {
			return "Sorry your ID incorrect!";
		}

	}

}
