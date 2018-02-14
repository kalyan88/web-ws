package com.ember.data.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Review implements Serializable{
	
	
	
	public Review() {
		
	}

	public Review(long id, String reviewDesc) {
		this.id = id;
		this.reviewDesc = reviewDesc;
	}

	private long id;
	
	private String reviewDesc;

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

	@Override
	public String toString() {
		return "Review [id=" + id + ", reviewDesc=" + reviewDesc + "]";
	}
}
