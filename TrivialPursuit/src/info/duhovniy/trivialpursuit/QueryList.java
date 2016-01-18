package info.duhovniy.trivialpursuit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueryList {

	private ArrayList<Question> listQuery;

	public QueryList() {
		listQuery = new ArrayList<Question>();
	}

	public void addQuestion(Question question) {
		listQuery.add(question);
	}

	public boolean removeQuestion(int id) {
		for (Question q : listQuery) {
			if (q.getID() == id) {
				listQuery.remove(q);
				return true;
			}
		}
		return false;
	}

	public List<Question> getAll() {
		return listQuery;
	}

	public Question getQuestion(int id) {
		Iterator<Question> i = listQuery.iterator();
		while (i.hasNext()) {
			Question current = i.next();
			if (current.getID() == id) {
				return current;
			}
		}
		return null;
	}

	public int getMaxID() {
		return listQuery.get(listQuery.size() - 1).getID();
	}

	public int getSubjectCount(String subject) {
		int count = 0;
		for (Question q : listQuery) {
			if (q.getSubject().equals(subject))
				count++;
		}
		return count;
	}

	public Question getRandomQuestion() {
		int id;
		int range = getMaxID();

		do {
			id = (int) (Math.random() * range) + 1;
		} while (getQuestion(id) == null);

		return getQuestion(id);
	}

	public Question getRandomQuestion(String subject) {
		int rand = (int) (Math.random() * getSubjectCount(subject)) + 1;
		int count = 0;

		for (Question q : listQuery) {
			if (q.getSubject().equals(subject)) {
				count++;
				if (count == rand)
					return q;
			}
		}

		return null;
	}

}
