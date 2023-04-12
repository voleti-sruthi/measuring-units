package com.m2pfintech;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.m2pfintech.DistanceUnits.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.not;

public class DistanceUnitsTest {

    @Nested
    class CheckCMAndCM {
        @Test
        void toReturnTrueWhenInputIs1CMAnd1CM() {
            DistanceUnits oneCentimeter = centimeters(1);
            DistanceUnits oneCentimeter2 = centimeters(1);
            assertThat(oneCentimeter, is(equalTo(oneCentimeter2)));
        }

        @Test
        void toReturnFalseWhenInputIs1CMAnd2CM() {
            DistanceUnits oneCentimeter = centimeters(1);
            DistanceUnits twoCentimeter = centimeters(2);
            assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
        }
    }
    @Nested
    class CheckKMAndCM {
        @Test
        void toReturnFalseWhenInputsAre100CMAnd0Point1KM() {
            DistanceUnits oneKilometer = kilometers(0.1);
            DistanceUnits hundredCentimeters = centimeters(100);
            assertThat(oneKilometer, is(not(equalTo(hundredCentimeters))));
        }

        @Test
        void toReturnTrueWhenInputsAre10000CMAnd0Point1KM() {
            DistanceUnits oneKilometer = kilometers(0.1);
            DistanceUnits tenThousandCentimeters = centimeters(10000);
            assertThat(oneKilometer, is(equalTo(tenThousandCentimeters)));
        }
    }
    @Nested
    class CheckMAndCM {
        @Test
        void toReturnTrueWhenInputsAre100CMAnd1M() {
            DistanceUnits oneMeter = meters(1);
            DistanceUnits hundredCentimeters = centimeters(100);
            assertThat(oneMeter, is(equalTo(hundredCentimeters)));
        }
        @Test
        void toReturnTrueWhenInputsAre1000CMAnd1M() {
            DistanceUnits oneMeter = meters(1);
            DistanceUnits thousandCentimeters = centimeters(1000);
            assertThat(oneMeter, is(not(equalTo(thousandCentimeters))));
        }
    }

    @Nested
    class AddingDistances{
        @Test
        void toReturn2MWhen1MIsAddedTo100CM(){
            DistanceUnits oneMeter = meters(1);
            DistanceUnits hundred = centimeters(100);

            assertThat(meters(2),is(equalTo(oneMeter.add(hundred))));
        }
        @Test
        void toReturn100200CMWhen200CMIsAddedTo1KM(){
            DistanceUnits oneKiloMeter = kilometers(1);
            DistanceUnits twoHundredCentimeters = centimeters(200);
            assertThat(centimeters(100200),is(equalTo(twoHundredCentimeters.add(oneKiloMeter))));
        }


    }


}
