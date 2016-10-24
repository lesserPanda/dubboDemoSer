package pand.dubbo.bean;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -1009733312893309388L;
	
	private String name;
	private String sex;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
