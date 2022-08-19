package com.cg.framework;

public abstract class Shopfactory {
	 public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
	 public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge );

}
