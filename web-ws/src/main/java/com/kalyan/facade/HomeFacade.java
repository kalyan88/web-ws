/**
 * 
 */
package com.kalyan.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kalyan.data.domain.dmo.NameDmo;
import com.kalyan.data.domain.services.NameService;

/**
 * @author kgurugubelli
 *
 */
@Controller
public class HomeFacade {
	
	@Autowired
	private NameService nameServiceImpl;

	@RequestMapping(value = "/names/{name}", method = RequestMethod.GET)
	public @ResponseBody String getHomePage(@PathVariable String name) {
		return "Welcome to Spring WS application";
 
	}
	
	@RequestMapping(value = "/name/{id}", method = RequestMethod.GET)
	public @ResponseBody NameDmo getOneName(@PathVariable long id) {
		return this.nameServiceImpl.getOneName(id);
	}
	
	@RequestMapping(value = "/name/{fName}/{lName}/{age}", method = RequestMethod.POST)
	public void getOneName(@PathVariable String fName,@PathVariable String lName,@PathVariable long age) {
		NameDmo name= new NameDmo();
		name.setFirstName(fName);
		name.setLastName(lName);
		name.setAge(age);
		this.nameServiceImpl.saveOneName(name);;
	}
	
}
