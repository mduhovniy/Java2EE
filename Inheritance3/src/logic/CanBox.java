package logic;

public class CanBox extends Box {

	private int mHeight;
	private int mDiametr;

	/**
	 * @param label
	 * @param height
	 * @param diametr
	 */
	public CanBox(String label, int height, int diametr) {
		super(label);
		mHeight = height;
		mDiametr = diametr;
		this.countVolume();
	}

	/**
	 * @param height
	 * @param diametr
	 */
	public CanBox(int height, int diametr) {
		super(DEFAULT_BOX_LABEL);
		mHeight = height;
		mDiametr = diametr;
		this.countVolume();
	}

	/**
	 * 
	 * @param label
	 */
	public CanBox(String label) {
		super(label);
	}

	/**
	 * 
	 */
	public void countVolume() {
		mVolume = (int) (mHeight * Math.PI * (mDiametr / 2) * (mDiametr / 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see logic.Box#boxData()
	 */
	@Override
	public String boxData() {

		return super.boxData() + " diametr is " + mDiametr + " height is "
				+ mHeight;

	}

}
