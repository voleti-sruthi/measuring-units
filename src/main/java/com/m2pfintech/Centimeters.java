package com.m2pfintech;

public class Centimeters {
    private final double length;
    public Centimeters(double Length){
        this.length = Length;
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
