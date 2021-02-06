package ListProject;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapPro {

	public static void main(String[] args) {
	
		Map<String,String> hm = new LinkedHashMap<String,String>();
		
		hm.put("name", "Henoke");
		hm.put("email", "test@email.com");
		hm.put("AccountNumber", "9187291");
		hm.put("ssn", "987391821");
		hm.put("name1", "Sunny");
		hm.put("email1", "test2@email.com");
		hm.put("AccountNumber1", "9187291");
		hm.put("ssn1", "987391821");

		
		
		//hm.forEach((k,v) -> System.out.println( k + " : " +  v));
		
	}
		
		//keySetIteration(hm);
		
//	for(Map.Entry<String, String> entry:hm.entrySet()) {
//		System.out.println("key :" + entry.getKey());
//		System.out.println("Value:"+ entry.getValue());
//	}	
//		
//	}
//

	
	

	private static void keySetIteration(Map<String, String> hm) {
//		for (String name : hm.keySet()) {
//			System.out.println("Key:" + name);
//			System.out.println("Value: " + hm.get(name));
//			
//		}
//	
		double rand = Math.random();
		System.out.println(rand);
		
	}
	

}
