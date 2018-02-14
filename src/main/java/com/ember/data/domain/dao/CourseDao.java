package com.ember.data.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ember.data.domain.dmo.CourseDmo;

public interface CourseDao extends JpaRepository<CourseDmo, Long> {

}
