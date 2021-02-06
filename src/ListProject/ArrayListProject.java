package ListProject;

import java.util.ArrayList;
import java.util.*;

public class ArrayListProject {

	public static void main(String[] args) {

	String[] arr = new String[6];
		
		arr[0] = "Henoke";
		arr[1] = "Blen";
		arr[2] = "Sosi";
		arr[3] = "Eliana";
		arr[4] = "Solome,";
		arr[5] = "Yohanny";
		
	for(String s : arr) {
		//System.out.println(s);
	}
	List<String> list1 = Arrays.asList(arr);
	
	ArrayList<String> sArray = new ArrayList<String>(list1);
	sArray.add("Maste");
	sArray.add("Sunny");
	sArray.add("Abiy");
	sArray.add("Nebiyu");
	
	for(String a : sArray) {
		System.out.println(a);
	}
	System.out.println(sArray);
	
	
	
	}

}
