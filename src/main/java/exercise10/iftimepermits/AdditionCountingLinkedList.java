package exercise10.iftimepermits;

import java.util.Collection;
import java.util.LinkedList;

public class AdditionCountingLinkedList extends LinkedList {
	
	private int count = 0;
	
	@Override
	public boolean add(Object o){
		count++;
		return super.add(o);
	}
	
	@Override
	public boolean addAll(Collection c){
		count += c.size();
		return super.addAll(c);
	}

	public int getCount() {
		return count;
	}
}
