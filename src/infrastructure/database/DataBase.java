package infrastructure.database;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.util.TypeKey;

public class DataBase {

	// Leer archivo jso y convertir a lista de objetos
	public <T> List<T> readJson(String pathFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Map<String, Object>> listOfMaps = mapper.readValue((new File(pathFile)),
				new TypeReference<List<Map<String, Object>>>() {
				});
		List<T> objectsClass = new ArrayList<T>();

		listOfMaps.forEach((map) -> objectsClass.add(convertMapToClass(map)));
		return objectsClass;
	}

	// Agrega el objeto a un Arraylist del objeto y lo guarda en formtato JSON
	public <T> boolean convertClassAndSaveJson(T objectClass, String pathFile) {
		ObjectMapper mapper = new ObjectMapper();
		List<T> objectsClass = new ArrayList<T>();
		String json = "";

		try {
			objectsClass = readJson(pathFile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		objectsClass.add(objectClass);

		try {
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectsClass);
			;
		} catch (JsonProcessingException e1) {
			e1.printStackTrace();
		}

		System.out.print(json);
		boolean saveSucces = saveJson(json, pathFile);

		return saveSucces;

	}

	// Sobreescribe el json
	public boolean saveJson(String json, String pathFile) {
		try (FileWriter file = new FileWriter(pathFile)) {
			file.write(json);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public <T> List<T> jsonToObjectList(String pathFile, TypeReference<T> type) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Map<String, Object>> listOfMaps = mapper.readValue((new File(pathFile)),
				new TypeReference<List<Map<String, Object>>>() {
				});
		List<T> objectsClass = new ArrayList<T>();

		for (Map<String, Object> aver : listOfMaps) {
			String keeee = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(aver);
			T nose = jsonToObject(keeee, type);
			objectsClass.add(nose);
		}

		return objectsClass;
	}

	public <T> T jsonToObject(String json, TypeReference<T> type) {
		ObjectMapper objectMapper = new ObjectMapper();
		T target = null;
		try {
			target = objectMapper.readValue(json, type);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return target;
	}

	// Convierte un mao a una clase
	public <T> T convertMapToClass(Map<String, Object> map) {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<T> typeRef = new TypeReference<T>() {
		};
		T objectClass = mapper.convertValue(map, typeRef);
		return objectClass;
	}

}
