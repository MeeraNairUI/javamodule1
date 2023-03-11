package listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		String element = queue.peek(); // peek is for getting first element
		System.out.println(element);
		queue.poll();                   // poll is for removing first element
		System.out.println(queue);
		
		Iterator<String> iter = queue.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
