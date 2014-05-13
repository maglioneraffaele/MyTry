package mt.gumtree.addressBook.rest;

import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import mt.gumtree.addressBook.bl.BusinessLogic;
import mt.gumtree.addressBook.form.PersonForm;

import org.apache.log4j.Logger;


@Path("/managementCallRest")
public class ManagementCallRest {
	
	private static final Logger logger = Logger.getLogger(ManagementCallRest.class);
	
	@POST
	@Path("/getMale")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getMale(){
		
		String retVal = "";
		try{
			BusinessLogic bl = new BusinessLogic();
			int nMale = 0;
			nMale = bl.retHowMale();
			retVal = "{nMale:" + nMale + "}";
		}catch(Exception e){
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return retVal;
	}
	
	@POST
	@Path("/getOldest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getOldest(){
		
		String retVal = null;
		PersonForm pForm = null;
		try{
			BusinessLogic bl = new BusinessLogic();
			pForm = bl.retOldestPerson();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			retVal = "{name:" + pForm.getName() + ",surname:" + pForm.getSurname() + ",dataBirth:" + sdf.format(pForm.getBirthday()) + "}";
		}catch(Exception e){
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return retVal;
	}
	
	@POST
	@Path("/getDiffDay")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getDiffDay(){
		String retVal = "";
		try{
			BusinessLogic bl = new BusinessLogic();
			int nDiffDay = 0;
			nDiffDay = bl.retDayDiff();
			retVal = "{day:" + nDiffDay + "}";
		}catch(Exception e){
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return retVal;
	}
	
}
