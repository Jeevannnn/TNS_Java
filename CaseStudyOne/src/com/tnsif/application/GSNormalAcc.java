package com.tnsif.application;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
    
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Dear Normal User, your charges are: " + charges + " with Delivery Charges: " + getDeliveryCharges());
        System.out.println("Total: " + (charges + getDeliveryCharges()));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}