/**
 * 
 */
package com.ember.facade;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ember.data.domain.model.EmberReview;
import com.ember.data.domain.model.Name;
import com.ember.data.domain.model.Review;
import com.ember.data.domain.services.NameService;
import com.ember.data.ember.EmberModel;


@Controller
public class HomeFacade{
	
	@Autowired
	private NameService nameService;
	
    final static Logger logger= LogManager.getLogger(HomeFacade.class);
	
	
	@RequestMapping(value="/names", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody EmberModel getAllNames()
	{
		logger.debug("HomeFacade getAllNames ");
		List<Name> names = nameService.getAllNames();
		//course = this.courseServiceImpl.saveCourse(review);
		return  new EmberModel.Builder<>("name", names).build();
	}
	
}
