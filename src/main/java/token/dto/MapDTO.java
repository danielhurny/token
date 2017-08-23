package token.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class MapDTO {
	
	private String name;
	
	private int age;
	
	private Map<String, String> keys;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@JsonAnyGetter
	public Map<String, String> getKeys() {
		return keys;
	}

	public void setKeys(Map<String, String> keys) {
		this.keys = keys;
	}
	
	

}
