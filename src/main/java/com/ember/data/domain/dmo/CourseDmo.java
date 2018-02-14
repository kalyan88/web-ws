package com.ember.data.domain.dmo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Course", schema="test")
public class CourseDmo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String title;
	
	private long price;
	
	private String description;
	
	private String img;
	
	private Boolean isPopular;
	
	private Set<ReviewDmo> reviews = new HashSet<ReviewDmo>();
	
	

	public CourseDmo() {
	
	}

	public CourseDmo(long id, String title, long price, String description, String img, Boolean isPopular,
			Set<ReviewDmo> reviews) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.img = img;
		this.isPopular = isPopular;
		this.reviews = reviews;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Boolean getIsPopular() {
		return isPopular;
	}

	public void setIsPopular(Boolean isPopular) {
		this.isPopular = isPopular;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "course")
	public Set<ReviewDmo> getReviews() {
		return reviews;
	}

	public void setReviews(Set<ReviewDmo> reviews) {
		this.reviews = reviews;
	}
	
}
