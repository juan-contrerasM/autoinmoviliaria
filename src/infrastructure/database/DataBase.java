package infrastructure.database;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.TypeKey;
public class DataBase {
	
	//leer archivo jso y convertir a hashmap 
	
	public List<Map<String, Object>> readJson (String pathFile) throws IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		List<Map<String, Object>> listOfMaps = mapper.readValue((new File(pathFile)), new TypeReference< List<Map<String,Object>>>() {});
		//String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listOfMaps);
		//System.out.println("fasterxml List of Map to JSON string:[pretty-print]"+json);
		listOfMaps.forEach((mapa)-> print(mapa));
	
		return listOfMaps;
	}
	public void print(Map<String, Object> example) {
		
		example.forEach((key, value) -> System.out.println(key + " " + value));
	}
	public void convertClassAndSaveJason(Object u) throws JsonProcessingException  {
		ObjectMapper mapper = new ObjectMapper();
	    
		
		    // convert user object to json string and return it 
		    
		     String result=  mapper.writeValueAsString(u);
		     System.out.print(result+"hu");
		
	
	}
	
	

}
