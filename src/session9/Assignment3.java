package session9;

import java.util.*;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring HashMap signature using Generic EmpCode as key and EmpName as value
		
		HashMap<Integer,String> employee = new HashMap<Integer,String>();
		
		// Putting all key and value
		
		employee.put(1, "Amritha");
		
		employee.put(2, "Kaushik");
		
		employee.put(3, "Tanaya");
		
		//To use iterator convert to Set 
		
		Set<Integer> name = employee.keySet();
		
		//using for each loop to iterate employee name
		
		for(Integer code : name){
			
			System.out.println(employee.get(code));
			/*
			 * prints Employee name
			 * Amritha
			 * Kaushik
			 * Tanaya
			 */
			
		}

	}

}
