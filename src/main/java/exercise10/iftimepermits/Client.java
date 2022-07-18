package exercise10.iftimepermits;

import java.util.Collection;
import java.util.LinkedList;

public class Client {
	
	public static  void myAlgo(Collection c) {
		c.add("abc");
		//lots of other stuff
		
		c.add("xyz");
		//other stuff
		
		c.remove("xyz");
		//other stuff
	}

	public static void main(String[] args) {
//		Collection dataset = callSomeLayer();
		
		Collection dataset = callSomeOtherLayer();
		
		myAlgo(dataset);
		
		
		

	}

	private static Collection callSomeLayer() {
		
		return new AdditionCountingArrayList();
	}
	
	private static Collection callSomeOtherLayer() {
		
		return new LinkedList();
	}

}
