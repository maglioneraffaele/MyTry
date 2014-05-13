package utilityFake;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mt.gumtree.addressBook.bean.PersonBean;

public class UtilFake {
	
	public static List<PersonBean> retPersonBeanFake(){
		
		List<PersonBean> pBeanList = new ArrayList<PersonBean>();
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
			PersonBean pBean = new PersonBean();
			pBean.setName("Bill");
			pBean.setSurname("McKnight");
			pBean.setSex("Male");
			Date birthday = null;
			try {
				birthday = format.parse("16/03/1977");
			}catch(Exception e){
				e.printStackTrace();
			}
			pBean.setBirthday(birthday);
		
		pBeanList.add(pBean);
		
			pBean = new PersonBean();
			pBean.setName("Paul");
			pBean.setSurname("Robinson");
			pBean.setSex("Male");
			birthday = null;
			try {
				birthday = format.parse("15/01/1985");
			}catch(Exception e){
				e.printStackTrace();
			}
			pBean.setBirthday(birthday);
		
		pBeanList.add(pBean);
		
			pBean = new PersonBean();
			pBean.setName("Gemma");
			pBean.setSurname("Lane");
			pBean.setSex("Female");
			birthday = null;
			try {
				birthday = format.parse("20/11/1991");
			}catch(Exception e){
				e.printStackTrace();
			}
			pBean.setBirthday(birthday);
		
		pBeanList.add(pBean);
		
			pBean = new PersonBean();
			pBean.setName("Sarah");
			pBean.setSurname("Stone");
			pBean.setSex("Female");
			birthday = null;
			try {
				birthday = format.parse("20/09/1980");
			}catch(Exception e){
				e.printStackTrace();
			}
			pBean.setBirthday(birthday);
		
		pBeanList.add(pBean);
		
			pBean = new PersonBean();
			pBean.setName("Wes");
			pBean.setSurname("Jackson");
			pBean.setSex("Male");
			birthday = null;
			try {
				birthday = format.parse("14/08/1974");
			}catch(Exception e){
				e.printStackTrace();
			}
			pBean.setBirthday(birthday);
		
		pBeanList.add(pBean);
	
		return pBeanList;
	}
	
}
