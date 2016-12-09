//Roberto Martinez
//12/8/2016
//This code compares the average times of the two solutions to The 2 Producer/2 Consumer problem.

public class ComparisonTest {

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();
		Solution2 solution2 = new Solution2();
		System.out.println("2 Producers / 2 Consumers");
		System.out.println("By: Roberto Martinez");
		System.out.println("Problem: The 2 Producer / 2 Consumer Problem");
		System.out.println("");
		solution1.runSolution1();
		System.out.println("");
		solution2.runSolution2();
		System.out.println("");
		System.out.println("Comparison Result: The average time of Solution 2 is higher then the average time of Solution 1.");
	}

}
