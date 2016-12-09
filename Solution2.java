//Roberto Martinez
//12/8/2016
//This code is the second solution to The 2 Producer/2 Consumer problem.

public class Solution2 {

	Producer2 p1;
	Producer2 p2;
	Consumer2 c1;
	Consumer2 c2;
	long startTime1;
	long startTime2;
	
	public Solution2() {
		p1 = new Producer2();
		p2 = new Producer2();
		c1 = new Consumer2(5);
		c2 = new Consumer2(5);
	}
	
	public void runSolution2() {
		System.out.println("Solution 2:");
		System.out.println("");
		for(int i=0;i<5;i++) {
			startTime2 = System.nanoTime();
			System.out.println("P1 produced a time stamp. C1's queue has " + (5 - (i+1)) + " elements.");
			p1.produce(c1, i);
			try { //Once it's done producing, it goes to sleep.
				Thread.sleep(100);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("");
		for(int i=0;i<5;i++) {
			startTime2 = System.nanoTime();
			System.out.println("P2 produced a time stamp. C2's queue has " + (5 - (i+1)) + " elements.");
			p2.produce(c2, i);
			try { //Once it's done producing, it goes to sleep.
				Thread.sleep(100);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("Average Time: " + (startTime1 + startTime2)/2);
	}
	
	public static void main(String[] args) { //This is just for testing the second solution to see if it's working.
//		Solution2 test = new Solution2();
//		test.runSolution2();
	}

}
