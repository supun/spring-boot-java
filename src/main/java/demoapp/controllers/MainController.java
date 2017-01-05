package demoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demoapp.ContentItemRepo;

@Controller
public class MainController
{
	@Autowired
	ContentItemRepo s;

	@RequestMapping(value = "/v1/save", method = RequestMethod.GET)
	public void save()
	{
		// riskContentItem.setStatus( AbstractContent.NEW );
		s.save();
	}

}
