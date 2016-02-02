package info.duhovniy.trivialpursuit;

import java.util.List;

import javax.ws.rs.Consumes;
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
	@Produces(MediaType.APPLICATION_JSON)
	public Question[] getAllQuestions() {
		queryList = MySQLDBHandler.getAllQuestionsRequest();
		List<Question> temp = queryList.getAll();
		Question[] items = new Question[temp.size()];
		return temp.toArray(items);
	}

	@Path("/play")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Question play() {
		queryList = MySQLDBHandler.getAllQuestionsRequest();
		return queryList.getRandomQuestion();
	}

	@Path("/play-subject")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Question playSbject(@QueryParam("subject") String subject) {
		return queryList.getRandomQuestion(subject);
	}

	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addItem(Question q) {
		int rows = 0;
		rows = MySQLDBHandler.putQuestion(q);
		return  "#" + rows + " questions was added successfully";
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
