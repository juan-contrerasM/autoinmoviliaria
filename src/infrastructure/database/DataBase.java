package infrastructure.database;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.TypeKey;
public class DataBase {
	
	//leer archivo jso y convertir a hashmap 
	
	public void readJssonToHashMap () throws IOException{
		System.out.println(System.getProperty("user.dir"));
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, String> mapping = mapper.readValue(new File("employee.json"), HashMap.class);
		print(mapping);
		
	}
	public void print(HashMap<String, String> example) {
		
		example.forEach((key, value) -> System.out.println(key + " " + value));
	}
	
	

}
