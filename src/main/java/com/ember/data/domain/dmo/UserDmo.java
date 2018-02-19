package com.ember.data.domain.dmo;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="USER")
public class UserDmo implements Serializable{
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
 
    @Column(name="NAME", nullable=false)
    private String name;
 
    @Column(name="AGE", nullable=false)
    private Integer age;
 
    @Column(name="SALARY", nullable=false)
    private double salary;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
