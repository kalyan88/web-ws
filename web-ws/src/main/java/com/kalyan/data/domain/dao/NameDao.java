/**
 * 
 */
package com.kalyan.data.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalyan.data.domain.dmo.NameDmo;

/**
 * @author kgurugubelli
 *
 */
public interface NameDao extends JpaRepository<NameDmo, Long> {

}
