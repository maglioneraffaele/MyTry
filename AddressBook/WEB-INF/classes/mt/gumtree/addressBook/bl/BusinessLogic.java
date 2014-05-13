package mt.gumtree.addressBook.bl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import mt.gumtree.addressBook.bean.PersonBean;
import mt.gumtree.addressBook.form.PersonForm;

import org.apache.log4j.Logger;

import utilityFake.UtilFake;

public class BusinessLogic {
	
	private static final Logger logger = Logger.getLogger(BusinessLogic.class);
	
	public int retHowMale(){
		
		logger.info("start method retHowMale");
		int male = 0;
		
		// At this point I usually make a call to a servicedao and execute this select:
		// select count (*) from myTable where upper (sex) = upper ('bad');
		
		// but in our simple example, I do not have a database, and I do this:
		
		List<PersonBean> pBean = UtilFake.retPersonBeanFake();
		for (PersonBean personBean : pBean) {
			if(personBean.getSex().equalsIgnoreCase("Male")){
				male++;
			}
		}
		
		return male;
	}
	
	
	public PersonForm retOldestPerson(){
		
		logger.info("start method retOldestPerson");
		PersonForm pForm = new PersonForm();
		
		// At this point I usually make a call to a servicedao and execute this select:
		// select * from myTable 
		// where birthday = (select min(birthday) from myTable);
		
		// but in our simple example, I do not have a database, and I do this:
		List<PersonBean> pBeanList = UtilFake.retPersonBeanFake();
		
		Collections.sort(pBeanList);
		
		pForm.setSurname(pBeanList.get(0).getSurname());
		pForm.setName(pBeanList.get(0).getName());
		pForm.setBirthday(pBeanList.get(0).getBirthday());
		pForm.setSex(pBeanList.get(0).getSex());
		
		return pForm;
	}
	
	public int retDayDiff(){
		
		logger.info("start method retDayDiff");
		int dayDiff = 0;
		
		// At this point I usually make a call to a servicedao and just return the two dates of interest.
		
		Date d1 = null;
		Date d2 = null;
		long timeDiff = 0;
		
		List<PersonBean> pBean = UtilFake.retPersonBeanFake();
		for (PersonBean personBean : pBean) {
			if(personBean.getName().equalsIgnoreCase("Bill")){
				d1 = personBean.getBirthday(); 
			}
			if(personBean.getName().equalsIgnoreCase("Paul")){
				d2 = personBean.getBirthday(); 
			}
		}
		
		if(d1.compareTo(d2) < 0){
			timeDiff = d2.getTime() - d1.getTime();
		}else if(d1.compareTo(d2) > 0){
			timeDiff = d1.getTime() - d2.getTime();
		}else{ //nel caso le date siano uguali ne prendo una. 
			timeDiff = 0;
		}
		
		//1 day = 1000*60*60*24 = 86400000 ms
		if(timeDiff!=0){
			dayDiff = (int) (timeDiff / 86400000);
		}
		
		return dayDiff;
	}
	
	
}
