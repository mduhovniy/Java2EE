import java.util.Arrays;
import java.util.Random;

public class Intervals {
	
	private int len;
	private int max;
	private int[] array;
	
	public Intervals(int len, int max) {
		array = new int[len];
		this.len = len;
		this.max = max;
		randomFill();
	}
	 
	private void randomFill() {
		Random rand = new Random();
		for(int i = 0; i < array.length; i++)
	        array[i] = rand.nextInt(max);
	}
	
	public String getTestString() {
		return array.toString();
	}
	
	public int minCost1() {
		int minIndex1 = 1;
		int minIndex2, res;
		int min1 = array[minIndex1];
		for(int i = 2; i < (len - 2); i++) {
			if(min1 > array[i]) {
				min1 = array[i];
				minIndex1 = i;
			}
		}
		
		if(minIndex1 <= 2)
			minIndex2 = minIndex1 + 2;
		else 
			minIndex2 = 1;
		res = array[minIndex2];
		
		for(int i = minIndex2; i < (len - 2); i++ ) {
			if (res > array[i] && ((minIndex1 > (i + 1)) || ((i - 1) > minIndex1))) 
				res = array[i];
		}
		res += min1;
		return res;
	}
	
	public int minCost2() {
		int res = array[1] + array[3];
		for (int p = 1; p < (len - 4); p++) {
			for (int q = p + 2; q < (len - 2); q++) {
				if (res > (array[p] + array[q])) 
					res = array[p] + array[q];
			}
		}
		return res;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
}
