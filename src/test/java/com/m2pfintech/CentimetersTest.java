package com.m2pfintech;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.not;

public class CentimetersTest {

    @Nested
    class CheckCMAndCM {
        @Test
        void toReturnTrueWhenInputIs1CMAnd1CM() {
            Centimeters centimetersObject1 = new Centimeters(1);
            Centimeters centimetersObject2 = new Centimeters(1);
            assertThat(centimetersObject1, is(equalTo(centimetersObject2)));
        }

        @Test
        void toReturnFalseWhenInputIs1CMAnd2CM() {
            Centimeters centimetersObject1 = new Centimeters(1);
            Centimeters centimetersObject2 = new Centimeters(2);
            assertThat(centimetersObject1, is(not(equalTo(centimetersObject2))));
        }
    }
    @Nested
    class CheckKMAndCM {
        @Test
        void toReturnFalseWhenInputsAre100CMAnd0Point1KM() {
            Centimeters kilometersObject = Centimeters.ConvertKMToCM(0.1);
            Centimeters centimetersObject = new Centimeters(100);
            assertThat(kilometersObject, is(not(equalTo(centimetersObject))));
        }

        @Test
        void toReturnTrueWhenInputsAre10000CMAnd0Point1KM() {
            Centimeters kilometersObject = Centimeters.ConvertKMToCM(0.1);
            Centimeters centimetersObject = new Centimeters(10000);
            assertThat(kilometersObject, is(equalTo(centimetersObject)));
        }
    }
    @Nested
    class CheckMAndCM {
        @Test
        void toReturnTrueWhenInputsAre100CMAnd1M() {
            Centimeters kilometersObject = Centimeters.ConvertMToCM(1);
            Centimeters centimetersObject = new Centimeters(100);
            assertThat(kilometersObject, is(equalTo(centimetersObject)));
        }
        @Test
        void toReturnTrueWhenInputsAre1000CMAnd1M() {
            Centimeters kilometersObject = Centimeters.ConvertMToCM(1);
            Centimeters centimetersObject = new Centimeters(1000);
            assertThat(kilometersObject, is(not(equalTo(centimetersObject))));
        }
    }



}
