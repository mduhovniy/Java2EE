import java.util.Date;

public class Main {
	
	static long start;
	
	public static void main(String[] args) {
		
		Intervals intervals = new Intervals(10000, 100);
		System.out.println(intervals);
		
		start = (new Date()).getTime();
		System.out.println(intervals.minCost1());
		System.out.println("Computing time " + ((new Date()).getTime() - start) + "ms");
		
		start = (new Date()).getTime();
		System.out.println(intervals.minCost2());
		System.out.println("Computing time " + ((new Date()).getTime() - start) + "ms");
	}

}
