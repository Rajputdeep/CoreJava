package MapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap is unordered
		Map<Integer,String>obj=new HashMap<>();
		obj.put(425408, "MG Road"); //Pune
		obj.put(422003, "MG Road"); //Nashik
		System.out.println(obj);
		
		//ordered
		Map<Integer,String>obj1=new LinkedHashMap<>();
		obj1.put(425408, "MG Road"); //Pune
		obj1.put(422003, "MG Road"); //Nashik
		System.out.println(obj1);
		
		

	}

}