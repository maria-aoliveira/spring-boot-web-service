package br.edu.infnet.dev;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties (ignoreUnknown = true)
public class Pessoa {
	
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("age")
	private Integer age;
	
	@JsonProperty("count")
	private Integer count;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Pessoas [name=" + name + ", age=" + age + ", count=" + count + "]";
	}

	public Pessoa() {
		
	}
	
}
