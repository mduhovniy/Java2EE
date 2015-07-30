import java.util.Scanner;


public class Shape {

	public static final int SIZE_OF_ARRAYS = 5;	// default size of arrays of shapes
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Triangle[] triangles = new Triangle[SIZE_OF_ARRAYS];
		Rectangle[] rectangles = new Rectangle[SIZE_OF_ARRAYS];
		
		
		// input of dimensions of rectangles
		for(int i = 0; i < SIZE_OF_ARRAYS; i++) {
			int hight, lenght;
			System.out.println("Enter dimensions of rectangle #" + (i+1));
			System.out.print("Hight:");
			hight = input.nextInt();
			System.out.print("Lenght:");
			lenght = input.nextInt();
			if(hight > 0 && lenght > 0) {
				rectangles[i] = new Rectangle(hight, lenght);
			} else {
				rectangles[i] = new Rectangle();
			}
		}
		
		// input of dimensions of triangles
		for(int i = 0; i < SIZE_OF_ARRAYS; i++) {
			int lenght;
			System.out.println("Enter dimensions of triangle #" + (i+1));
			System.out.print("Lenght:");
			lenght = input.nextInt();
			if(lenght > 0) {
				triangles[i] = new Triangle(lenght);
			} else {
				triangles[i] = new Triangle();
			}
				
		}
		
		// drawing of of array of rectangles
		for(int i = 0; i < SIZE_OF_ARRAYS; i++) {
			System.out.println("Rectangle #" + (i+1));
			rectangles[i].draw();
		}
		
		// drawing of array of triangles
		for(int i = 0; i < SIZE_OF_ARRAYS; i++) {
			System.out.println("Triangle #" + (i+1));
			triangles[i].draw();
		}
		
	}

}
