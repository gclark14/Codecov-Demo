package com.evisions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by gabe.clark on 7/12/17.
 */
public class AddDoubleAndSubtractTest {

    @Test
    public void double_addition_with_subtraction(){
       int diff = Subtractor.subtract(10,6);
       assertThat(Adder.add(diff,2.0), is(6.0));
    }
}
