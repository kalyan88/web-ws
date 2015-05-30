/**
 * 
 */
package com.kalyan.data.domain.dmo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author kgurugubelli
 *
 */
@Entity
@Table(name="Name", schema="test")
public class NameDmo {
	
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private long age;

	public NameDmo(){
		
	}
	
	public NameDmo(long id, String firstName, String lastName, long age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
	
	@Id
	@GeneratedValue
	@Column(name = "idnew_table", nullable=false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	@Column(name = "FirstName", nullable=false)
	public String getFirstName() {
		return firstName;
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", nullable=false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "Age", nullable=false)
	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}
	
	
	
	

}
