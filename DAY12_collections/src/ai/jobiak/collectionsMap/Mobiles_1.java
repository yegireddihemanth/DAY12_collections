package ai.jobiak.collectionsMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Mobiles_1 {

	public static void main(String[] args) {

		Mobiles1 mobile1 = new Mobiles1("iPhone X", 75000);
		Mobiles1 mobile2 = new Mobiles1("iPhone XS", 85000);
		Mobiles1 mobile3 = new Mobiles1("iPhone Xr", 45000);
		Mobiles1 mobile4 = new Mobiles1("iPhone 12", 62000);
		Mobiles1 mobile5 = new Mobiles1("iphone 13", 82000);
		
		
		  HashMap mob = new HashMap();
		  
		  mob.put("1 : ",mobile1);
		  mob.put("2 : ", mobile2);
		  mob.put("3 : ", mobile3);
		  mob.put("4 :", mobile4);
		  mob.put("5 :",  mobile5);
		  
		  System.out.println(mob.values());
		  System.out.println(mob.size());
		  
//		  Set<Entry>entries = mob.entrySet();
//		  java.util.Iterator<Entry> iter = entries.iterator();
//		  while(iter.hasNext());
//		  Entry entry = (Entry)iter.next();
		  
		  
		 

	}
}