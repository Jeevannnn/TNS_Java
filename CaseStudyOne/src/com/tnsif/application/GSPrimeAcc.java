package com.tnsif.application;


import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
    private static final float charges = 0; // Default charges

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Dear Prime User, your product charges are: " + charges);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}