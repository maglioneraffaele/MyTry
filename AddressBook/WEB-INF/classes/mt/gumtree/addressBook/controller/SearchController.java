package mt.gumtree.addressBook.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mt.gumtree.addressBook.bl.BusinessLogic;
import mt.gumtree.addressBook.form.PersonForm;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class SearchController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int nMale = 0;
		PersonForm pForm;
		int nDiffDay = 0;
		
		BusinessLogic bl = new BusinessLogic();
		
		if(request.getParameter("male")!=null){
			nMale = bl.retHowMale();
			return new ModelAndView("search", "nMale", nMale);
			
		}else if(request.getParameter("old")!=null){ 
			pForm = bl.retOldestPerson();
			return new ModelAndView("search", "oldestPerson", pForm);
			
		}else if(request.getParameter("diff")!=null){
			nDiffDay = bl.retDayDiff();
			return new ModelAndView("search", "nDiffDay", nDiffDay);
			
		}else{
			return new ModelAndView("search", "welcomeMessage", "");
		}
		
	}
	
}
