package logic;

public class Box {

	protected String mLabel;
	protected int mVolume;
	public static final String DEFAULT_BOX_LABEL = "No label";

	/**
	 * @param label
	 * 
	 * */
	public Box(String label) {
		mLabel = label;
	}

	/**
	 * 
	 * @return
	 */
	public String boxData() {

		return "Box label: " + mLabel + " its volume is " + mVolume;

	}

}
