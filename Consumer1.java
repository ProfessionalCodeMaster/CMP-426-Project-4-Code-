//Roberto Martinez
//12/7/2016
//This is the consumer thread without its own queue.

public class Consumer1 extends Thread{
	
	public synchronized void consume(Producer1 p,int i) { //This consumes a time stamp message in a producer's queue.
		p.queue[i] = null;
	}
}
