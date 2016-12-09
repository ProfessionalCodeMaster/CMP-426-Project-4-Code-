//Roberto Martinez
//12/8/2016
//This is the producer thread without its own queue.

import java.sql.Timestamp; 
import java.util.Date;

public class Producer2 extends Thread{

	public synchronized void produce(Consumer2 c,int i) {
		Date date = new java.util.Date();
		c.queue[i] = new Timestamp(date.getTime());
	}
	
}
