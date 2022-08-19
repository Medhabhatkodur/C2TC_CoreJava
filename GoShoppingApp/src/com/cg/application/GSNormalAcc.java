package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
public void bookProduct(float deliveryCharge) {
	System.out.println("dear normal user, your charges are: " + getCharges() + " along with delivery charges:" + getDeliveryCharge());	
}
@Override
public String toString() {
	return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}

}
