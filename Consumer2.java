//Roberto Martinez
//12/8/2016
//This is the consumer thread with its own queue.

import java.util.Date;

public class Consumer2 extends Thread{

	Date[] queue;
	
	public Consumer2(int messages) {
		queue = new Date[messages];
		for(int i=0;i<messages;i++) {
			queue[i] = null;
		}
	}
}
