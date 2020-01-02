package dao;
import java.util.Map;
import java.util.Set;

import entities.Mobile;


public interface IMobileDao {


	    Mobile findBymobno(String mobileno);

	    Set<Mobile> allMobiles();

		void addMobile(Mobile w);

		Mobile rechargeAmount(String str1, String name, double amount);

		Map<String,Mobile> getStore();
		
	}