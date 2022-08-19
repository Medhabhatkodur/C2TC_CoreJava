package com.cg.framework;

public abstract class NormalAcc extends ShopAcc {
	 private float deliveryCharge;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}
	
	 public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public void  bookProduct(float deliveryChrage) {
		System.out.println("charges are: " +deliveryCharge);
 
	 }
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	 
}
