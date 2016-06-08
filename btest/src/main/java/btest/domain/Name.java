package btest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Name {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	String name;
	
	int age;

	public Name(){}
	
	public Name(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Name(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Name [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
