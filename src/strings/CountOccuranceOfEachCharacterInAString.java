package strings;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachCharacterInAString {

	public static void main(String[] args) {
	
		String str="Programing";
		Map<Character,Integer> MPCount=new HashMap<>();
		for(Character v:str.toCharArray())
		{
			if(MPCount.containsKey(v))
			{
				MPCount.put(v,MPCount.get(v)+1);
			}
			else
			{
				MPCount.put(v,1);
			}
			
		}
		System.out.println(MPCount);

	}

}
