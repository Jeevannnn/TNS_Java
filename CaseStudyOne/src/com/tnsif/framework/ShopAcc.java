package com.tnsif.framework;

public abstract class ShopAcc {
    // Fields
    private int accNo;
    private String accNm;
    private float charges;

    // Constructor
    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    // Getters and Setters
    // Only accNm is read-write, others are read-only
    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public void setAccNm(String accNm) {
        this.accNm = accNm;
    }

    public float getCharges() {
        return charges;
    }

    // Methods
    public void bookProduct(float charges) {
        System.out.println("Product booked. Charges: " + charges);
    }

    public void items(float itemId) {
        System.out.println("Item ID: " + itemId);
    }

    @Override
    public String toString() {
        return "AccNo: " + accNo + ", Name: " + accNm + ", Charges: " + charges;
    }
}