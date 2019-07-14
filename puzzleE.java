

public class puzzleE{

	public void puzzle_E1() {
		System.out.printf("Expression evaluates to: %d\n", 45);
	}

	//Remainder operators
	public void puzzle_E7() {
		System.out.printf("First expression evaluates to: %d\n", 5/2);
		System.out.printf("The second expression evaluates to: %d\n", 5%2);
	}

	//Assignment operator
	public void puzzle_E14(){
		int a = 3;
		double b = 1.5;
		double sum;

		sum = a+b+2.0;
		System.out.printf("The first sum: %f\n", sum);

		System.out.printf("The second sum: %f\n", sum = a+b);

		sum = sum+0.5;
		System.out.printf("The third sum: %f\n", sum);

	}

	//I will supposedly. get this wrong
	public void puzzle_E20(){
		double x = 12.3, y = 7.2, c = 3.2;

		double result;

		result = (x+y)/(2*c);

		System.out.printf("result: %f\n", result);
	}

	public static void main(String[] args){
		puzzleE puzzles = new puzzleE();

		puzzles.puzzle_E20();
	}
}