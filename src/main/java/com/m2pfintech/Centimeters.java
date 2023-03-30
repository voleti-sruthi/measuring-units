package com.m2pfintech;

public class Centimeters {
    private final double length;
    public Centimeters(double length){
        this.length = length;
    }

    public static Centimeters ConvertKMToCM(double length){
        Centimeters kmToCM = new Centimeters(length*100000);
        return kmToCM;
    }

    public static Centimeters ConvertMToCM(double length){
        Centimeters mToCM = new Centimeters(length*100);
        return mToCM;
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object.getClass() != getClass()){
            return false;
        }
        Centimeters that = (Centimeters) object;
        return length == that.length;
    }


}
