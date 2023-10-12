package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputMain {
	public static void main(String[] args) {
		InputClass inputClass=new InputClass();
		inputClass.setAnimalName("Dog");
		inputClass.setLifeSpan(40);
		inputClass.setExistencePercentage(80);
		inputClass.setCountry("India");
		
		// Retreiving the data in list through index
		List<InputClass> list = new ArrayList<InputClass>();
		list.add(inputClass);
//		list.add(26);
//		list.add(1);
//		list.add(80);
//		System.out.println(list.get(0));
		System.out.println(inputClass.getAnimalName());
		
		for(InputClass element: list) {
			
		}
		
		
		
		
		//Retreiving the data in map through key
//		Map<Integer, String> map=new HashMap<Integer, String>();
//		map.put(20, "Vignesh");
//		map.put(21, "haswanth");
//		map.put(38, "Harsha");
//		System.out.println(map.get(38));
//		
//		for(Map.Entry<Integer, String> element:map.entrySet()){
//			System.out.println(element.getKey());
//			System.out.println(element.getValue());
//			
//		}
//		

				
			
		}
		
	}

