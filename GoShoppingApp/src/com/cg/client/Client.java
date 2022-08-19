package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.Shopfactory;

public class Client {

	public static void main(String[] args) {
		Shopfactory sf =new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(111,"rama",1000,true);
		NormalAcc na = new GSNormalAcc(112,"seetha",2000,200);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
	}

}
