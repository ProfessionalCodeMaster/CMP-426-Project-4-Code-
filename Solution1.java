//Roberto Martinez
//12/7/2016
//This code is the first solution to The 2 Producer/2 Consumer problem.

public class Solution1 {
	
	Producer1 p1;
	Producer1 p2;
	Consumer1 c1;
	Consumer1 c2;
	long startTime1;
	long startTime2;
	
	public Solution1() {
		p1 = new Producer1(5);
		p2 = new Producer1(5);
		c1 = new Consumer1();
		c2 = new Consumer1();
	}
	
	public void runSolution1() {
		System.out.println("Solution 1:");
		System.out.println("");
		for(int i=0;i<5;i++) {
			startTime1 = System.nanoTime();
			System.out.println("C1 got message " + p1.queue[i] + ". P1's queue has " + (5 - (i+1)) + " elements.");
			c1.consume(p1, i);
			try { //Once it's done consuming, it goes to sleep.
				Thread.sleep(100);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("");
		for(int i=0;i<5;i++) {
			startTime2 = System.nanoTime();
			System.out.println("C2 got message " + p2.queue[i] + ". P2's queue has " + (5 - (i+1)) + " elements.");
			c2.consume(p2, i);
			try { //Once it's done consuming, it goes to sleep.
				Thread.sleep(100);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("Average Time: " + (startTime1 + startTime2)/2);
	}

	public static void main(String[] args) { //This is just for testing the first solution to see if it's working.
//		Solution1 test = new Solution1();
//		test.runSolution1();
	}

}
