



import static org.junit.Assert.*;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;


public class SchTest {

	@Test
	public void test() {
		Schedule sch = new Schedule();
		Work work = new Work("wash",6,8);
		work.getArrivalTime();
		work.getBeginTime();
		work.getCircleTime();
		work.getCircleWPTime();
		work.getEndTime();
		work.getPriority();
		work.getServiceTime();
		work.isIn();
		work.setBeginTime(8);
		work.setEndTime(9);

		
	    List<Work> list = new LinkedList<Work>();
	    List<Work> mlist = new LinkedList<Work>();
	    	mlist = sch.FCFS(list);
		mlist = sch.SJF(list);
		
	}

}