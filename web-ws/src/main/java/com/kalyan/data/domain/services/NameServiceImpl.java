/**
 * 
 */
package com.kalyan.data.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.kalyan.data.domain.dao.NameDao;
import com.kalyan.data.domain.dmo.NameDmo;

/**
 * @author kgurugubelli
 *
 */
@Component
public class NameServiceImpl implements NameService{
	
	@Autowired
	private NameDao nameDao;

	
	@Transactional
	public NameDmo getOneName(long id) {
		NameDmo nameDmo = this.nameDao.findOne(id);
		return nameDmo;
	}

	@Transactional
	public void saveOneName(NameDmo nameDmo) {
		this.nameDao.save(nameDmo);
	}
	
	
	
	
	
	
	

}
