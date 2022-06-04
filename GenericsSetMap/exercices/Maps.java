package exercices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args){
		
		File path = new File("c:\\Users\\leona\\out\\out.txt");
		Map<String,Integer> votes = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			System.out.println("Enter file full path: " + path.getPath());
			
			String line = br.readLine(); 
			while(line != null) {
				String[] person = line.split(",");
				if(votes.containsKey(person[0])) {
					votes.put(person[0], votes.get(person[0])+Integer.parseInt(person[1]));
				}
				else {
					votes.put(person[0], Integer.parseInt(person[1]));
				}

				line = br.readLine();
			}
			
			for(String key : votes.keySet())
				System.out.println(key+": "+votes.get(key));
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
