package ai.jobiak.collections;
import java.util.*;


public class TestArrayLists {

	public static void main(String[] args) {
	
		String h= "hello";
		ArrayList list = new ArrayList();
		
		list.add("thinking in java"); 
		list.add("java unleasehed");
		list.add("java for dummies in 21 days");
		list.add("core first java");
		list.add("this head first");
		
		//list.clear();
		
	//list.clone();
		
   boolean l = list.contains(h); 
   System.out.println(l);

		
	List list1= list;
	System.out.println(list);
	Collection collection = list;	
		 
		
		System.out.println(list1.size());
		System.out.println(list1);
		System.out.println(collection);
		
		collection.add("hemanth");
		System.out.println(collection.size());
		
		//=iterations==//
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next()); 
		}
		
		
		for(Object book :collection) {
			System.out.println(book);
		}
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list.get(i));
		}
		
	
	Collections.sort(list);
	System.out.println(list);
	int k =Collections.binarySearch(list1, "thinking in java");
	System.out.println("found at " + k);
	
		
		
	Object books[] = collection.toArray();
	System.out.println(books.length);
	
	List listOfBooks = Arrays.asList(books);
	System.out.println(listOfBooks);
	
	
		
	}

}
