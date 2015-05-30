/**
 * 
 */
package com.kalyan.data.domain.services;

import com.kalyan.data.domain.dmo.NameDmo;

/**
 * @author kgurugubelli
 *
 */
public interface NameService {

	public NameDmo getOneName(long id);
	
	public void saveOneName(NameDmo nameDmo);
	
}
