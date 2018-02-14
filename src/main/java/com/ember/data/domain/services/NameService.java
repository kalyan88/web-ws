/**
 * 
 */
package com.ember.data.domain.services;

import java.util.List;

import com.ember.data.domain.dmo.NameDmo;
import com.ember.data.domain.model.Name;

public interface NameService {
	
	public List<Name> getAllNames();

	public NameDmo getOneName(long id);
	
	public void saveOneName(NameDmo nameDmo);
	
}
