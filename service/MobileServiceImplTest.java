package service;
import static org.junit.Assert.assertEquals;
import java.util.Map;
import org.junit.Test;
import dao.MobileDaoImpl;
import entities.Mobile;
import junit.framework.Assert;

public class MobileServiceImplTest 
{
@Test
public void testCreateAccount_1()
{
	MobileServiceImpl service=new MobileServiceImpl(new MobileDaoImpl());
	
	String mobNo="9440726827";
	double balance=1000;
	String name="Sekhar";
	Mobile m =new Mobile( mobNo,name,balance);
	service.addMobile(m);
	
	//{ To check a mobile number set   
	//Map<String, Mobile> store= service.getDao().getStore();
	//Mobile expected=store.get(mobNo);
	//Assert.assertNotNull(expected);
	//Assert.assertEquals(expected, m);
	//System.out.print("Finish");
	//}
	
	//To check find by mobile number
	//Mobile fetched1=service.findBymobno(mobNo);
	//String n1=fetched1.getName();
	//Assert.assertEquals(name, n1);
	
	//{ To check and fetch a customer from mobile number set 
	//MobileServiceImpl service=new MobileServiceImpl(new MobileDaoImpl());
	
		//String mobNo="9440726827";
		//double balance=1000;
		//String name="Sekhar";
		//Mobile m =new Mobile( mobNo,name,balance);
		//service.addMobile(m);
		Map<String, Mobile> store= service.getDao().getStore();
		store.put(mobNo,m);
		Mobile result=service.findBymobno(mobNo);
		Assert.assertEquals(m,result);
	
}
	
}
