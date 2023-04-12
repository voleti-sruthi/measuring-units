package com.m2pfintech;

public class DistanceUnits {

    private static class Unit{
        static final Unit cm = new Unit(0.01);
        static final Unit m = new Unit(1);
        static final Unit km = new Unit(1000);
        private final double baseFactor;
        private Unit(double baseFactor){
            this.baseFactor = baseFactor;

        }
    }
    private final double length;
    private final Unit unit;

    public DistanceUnits(double length,Unit unit){
        this.length = length;
        this.unit = unit;
    }

    public static DistanceUnits meters(double length){
        return new DistanceUnits(length , Unit.m);
    }

    public static DistanceUnits centimeters(double length){
        return new DistanceUnits(length , Unit.cm);
    }

    public static DistanceUnits kilometers(double length){
        return new DistanceUnits(length ,Unit.km);
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object.getClass() != getClass()){
            return false;
        }
        DistanceUnits that = (DistanceUnits) object;
        return toConvertIntoMeters(Unit.m) == that.toConvertIntoMeters(Unit.m);
    }

    private double toConvertIntoMeters(Unit toUnit){
        return length*(unit.baseFactor)/(toUnit.baseFactor);
    }

    public DistanceUnits add(DistanceUnits object2){
        return new DistanceUnits(length + object2.toConvertIntoMeters(unit),unit);
    }
}
