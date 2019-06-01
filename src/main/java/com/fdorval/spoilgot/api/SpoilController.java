package com.fdorval.spoilgot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fdorval.spoilgot.api.model.GotCharacterFront;
import com.fdorval.spoilgot.business.SpoilBusiness;
import com.fdorval.spoilgot.dao.model.Season;

@RestController
public class SpoilController {

	@Autowired
	SpoilBusiness spoilBusiness;
	
	 @RequestMapping(value ="/characters",  method = RequestMethod.GET)
	    public List<GotCharacterFront> getCharacter(@RequestParam(value = "season", defaultValue = "1") Integer season ) throws com.fdorval.spoilgot.util.exception.TechnicalException {
		 return spoilBusiness.getCharacters(Season.fromInt(season));
	    }
	 
	
}