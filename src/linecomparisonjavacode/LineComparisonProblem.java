package linecomparisonjavacode;
public class LineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");
		int x1 = 2;
		int x2 = 4;
		int y1 = 3;
		int y2 = 1;
		int a1 = 3;
		int a2 = 7;
		int b1 = 5;
		int b2 = 2;                           
	double disOfFirstLine =  Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
	double disOfSecondLine =  Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1), 2));
	System.out.println("Two points are x1,y1(2,3) and (x2,y2)(4,1)");
	System.out.println("Another Two points are (a1,b1)(3,5) and (a2,b2)(7,2)");
	System.out.println("Length of the first line (2,3)(4,1) is " + disOfFirstLine);
	System.out.println("Length of the second line (3,5)(7,2) is " + disOfSecondLine);
	Integer obj1 = new Integer((int) disOfFirstLine);
	Integer obj2 = new Integer((int) disOfSecondLine);
	System.out.println("these lines are equal :" + obj1.equals(obj2));
	if (+obj1.compareTo(obj2) > 0 ) {
		System.out.println("Length of the first line is greater");
		
	}else {
		System.out.println("Length of second line is greater");
	}
	

	}

}