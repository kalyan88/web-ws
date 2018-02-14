package com.ember.data.domain.dmo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reviews", schema="test")
public class ReviewDmo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String reviewDesc;
	
	private CourseDmo course;

	
	public ReviewDmo() {
	
	}
	
	public ReviewDmo(long id, String reviewDesc, CourseDmo course) {
		super();
		this.id = id;
		this.reviewDesc = reviewDesc;
		this.course = course;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReviewDesc() {
		return reviewDesc;
	}

	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "courseId", nullable = false)
	public CourseDmo getCourse() {
		return course;
	}

	public void setCourse(CourseDmo course) {
		this.course = course;
	}

	
	
}
