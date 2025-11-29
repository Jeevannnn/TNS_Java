package com.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;
    private static final float deliveryCharges = 0.0f; // Prime gets free delivery

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Charges are: " + charges);
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + isPrime + ", Delivery Charges: " + deliveryCharges;
    }

    public boolean getIsPrime() {
        return isPrime;
    }
}