
public class Triangle {

	private int mLenght;
	
	public Triangle() {
		this(4);
	}
	
	public Triangle(int lenght) {
		mLenght = lenght;
	}
	
	public void draw() {
		for(int i = 0; i < mLenght; i++) {
			for(int j = 0; j < (mLenght - i); j++) {
				System.out.print(" ");
			}
			Rectangle tmpRectangle = new Rectangle(1, i+1);
			tmpRectangle.draw();
			System.out.println();
		}
	}
	
}
