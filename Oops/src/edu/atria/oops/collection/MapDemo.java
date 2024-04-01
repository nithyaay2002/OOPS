package edu.atria.oops.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map =new Hashmap();
		map.put("First","1st");
		map.put("2 nd",new Float(2.0f));
		map.put("third","3 rd");
		
		//duplication overrides the previous assessment
		map.put("third",3);
		System.out.println("Enteries Of Map"+map);
		
		//to view the map
		//Return the set view of key
		Set set=map.keySet();
		System.out.println("the keys are"+set);
		
		//return the collection view of value
		Collection collection=map.values();
		
		//REturn the set view of key value mapping
		
		Set mapset = map.entrySet();
		System.out.println(set+"\n"+collection+"\n"+mapset);
		
		
		
		

	}

}
