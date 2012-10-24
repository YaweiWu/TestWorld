package com.my.test.jackson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.my.test.model.Student;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

//		Student student = new Student();
//		student.setId(1);
//		student.setName("abc");
//		student.setGender("boy");
		ObjectMapper mapper = new ObjectMapper();
//		
//		mapper.writeValue(new File("Student.json"), student); 
		
		System.out.println(mapper.readValue(new File("Student.json"), Student.class));
		
		
		
		
	}

}
