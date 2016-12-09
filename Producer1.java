//Roberto Martinez
//12/6/2016
//This is the producer thread with its own queue.

import java.sql.Timestamp; 
import java.util.Date;

public class Producer1 extends Thread{

	Date[] queue;
	public Producer1(int messages) { //This puts the time stamp messages into the queue.
		queue = new Date[messages];
		Date date = new java.util.Date(); //Had to use this because LocalDateTime.now() is only available in Java 8.
		for(int i=0;i<messages;i++) {
			queue[i] = new Timestamp(date.getTime());
		}
	}
}
