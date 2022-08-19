package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.Shopfactory;

public class GSShopFactory extends Shopfactory {
	

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
	
	GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime); // lazy initialization
		return null;

	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, deliveryCharge, deliveryCharge);//lazy initialization
		return null;

	}

}
