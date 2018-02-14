/**
 * 
 */
package com.ember.data.domain.services;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ember.data.domain.dao.NameDao;
import com.ember.data.domain.dmo.NameDmo;
import com.ember.data.domain.model.Name;

@Component
public class NameServiceImpl implements NameService{
	
	@Autowired
	private NameDao nameDao;
	
	@Transactional
	public List<Name> getAllNames() {
		List<NameDmo> orgList = this.nameDao.findAll();
		List<Name> destList = new ArrayList<Name>() ;
		int i=0;
		try {
			for(NameDmo orgBean : orgList) {
				Name destBeanName = new Name();
				BeanUtils.copyProperties(destBeanName, orgList.get(i));
				i++;
				destList.add(destBeanName);
				
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return destList;
	}
	
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
