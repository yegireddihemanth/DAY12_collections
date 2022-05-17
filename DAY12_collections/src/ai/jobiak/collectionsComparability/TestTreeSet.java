package ai.jobiak.collectionsComparability;

import java.security.KeyStore.Entry;
import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		
		tree.add("apple");
		tree.add("orange");
		tree.add("blackberry");
		tree.add("rasberrry");
		tree.add("apple");
		 System.out.println(tree);
		 
		 Cource cour=new Cource("java", 111, "3000rs",2.5 );
		 Cource cour1 = new Cource("c", 222, "4500rs", 3.5);
		 
		 TreeSet res = new TreeSet();
		 res.add(cour);
		 res.add(cour1);
		 System.out.println(res);
		 
		
		 
//		 Set<Entry<Object, Object>>entries = res.entrySet();
//		  Iterator iter = entries.iterator();
//		  while(iter.hasNext());
//		  Entry entry = (Entry)iter.next();
		  
		 
		 
		 
		
		

	}

}
