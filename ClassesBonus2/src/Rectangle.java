
public class Rectangle {

	private int mHight;
	private int mLenght;
	
	public Rectangle() {
		this(4,4);
	}
	
	public Rectangle(int hight, int lenght) {
		mHight = hight;
		mLenght = lenght;
	}
	
	public void draw() {
		for(int i = 0; i < mHight; i++) {
			for(int j = 0; j < mLenght; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
