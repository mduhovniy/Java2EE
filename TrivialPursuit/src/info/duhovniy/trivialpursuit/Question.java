package info.duhovniy.trivialpursuit;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {

	private static int counter = 0;

	private int mID;
	private String mSubject;
	private String mQuery;
	private String mRightAnswer;
	private String mWrongAnswer1;
	private String mWrongAnswer2;
	private String mWrongAnswer3;

	public Question() {
	}

	public Question(String subject, String query, String rightAnswer, String wrongAnswer1, String wrongAnswer2,
			String wrongAnswer3) {
		super();
		mID = ++counter;
		mSubject = subject;
		mQuery = query;
		mRightAnswer = rightAnswer;
		mWrongAnswer1 = wrongAnswer1;
		mWrongAnswer2 = wrongAnswer2;
		mWrongAnswer3 = wrongAnswer3;
	}

	public String getSubject() {
		return mSubject;
	}

	public void setSubject(String subject) {
		mSubject = subject;
	}

	public String getQuery() {
		return mQuery;
	}

	public void setQuery(String query) {
		mQuery = query;
	}

	public String getRightAnswer() {
		return mRightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		mRightAnswer = rightAnswer;
	}

	public String getWrongAnswer1() {
		return mWrongAnswer1;
	}

	public void setWrongAnswer1(String wrongAnswer1) {
		mWrongAnswer1 = wrongAnswer1;
	}

	public String getWrongAnswer2() {
		return mWrongAnswer2;
	}

	public void setWrongAnswer2(String wrongAnswer2) {
		mWrongAnswer2 = wrongAnswer2;
	}

	public String getWrongAnswer3() {
		return mWrongAnswer3;
	}

	public void setWrongAnswer3(String wrongAnswer3) {
		mWrongAnswer3 = wrongAnswer3;
	}

	public int getID() {
		return mID;
	}

	public void setID(int id) {
		mID = id;
	}

	@Override
	public String toString() {
		return "Question: " + mID + " " + mSubject + " " + mQuery + " " + mRightAnswer + " " + mWrongAnswer1 + " "
				+ mWrongAnswer2 + " " + mWrongAnswer3;
	}

}
