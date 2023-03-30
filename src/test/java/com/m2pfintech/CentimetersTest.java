package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CentimetersTest {

    @Test
    void toReturnTrueWhenInputIs1CMAnd1CM(){
        Centimeters centimetersObject1 = new Centimeters(1);
        Centimeters centimetersObject2 = new Centimeters(1);
        assertThat(centimetersObject1,is(equalTo(centimetersObject2)));
    }

}
