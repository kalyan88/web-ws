/**
 * 
 */
package com.ember.data.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ember.data.domain.dmo.NameDmo;

public interface NameDao extends JpaRepository<NameDmo, Long> {

}
