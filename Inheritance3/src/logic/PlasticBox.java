package logic;

public class PlasticBox extends Box {

	private int mLength;
	private int mWidth;
	private int mHeight;

	/**
	 * @param label
	 * @param length
	 * @param width
	 * @param height
	 */
	public PlasticBox(String label, int length, int width, int height) {
		super(label);
		mLength = length;
		mWidth = width;
		mHeight = height;
		this.countVolume();
	}

	/**
	 * @param length
	 * @param width
	 * @param height
	 */
	public PlasticBox(int length, int width, int height) {
		super(DEFAULT_BOX_LABEL);
		mLength = length;
		mWidth = width;
		mHeight = height;
		this.countVolume();
	}

	/**
	 * 
	 * @param label
	 */
	public PlasticBox(String label) {
		super(label);
	}

	/**
	 * 
	 */
	public void countVolume() {
		mVolume = mLength * mHeight * mWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see logic.Box#boxData()
	 */
	@Override
	public String boxData() {

		return super.boxData() + " height is " + mHeight + " lenght is "
				+ mLength + " widht is " + mWidth;

	}

}
