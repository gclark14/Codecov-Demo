package com.evisions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by gabe.clark on 7/7/17.
 */
public class AddAndSubtractTest {

    private Adder adder = new Adder();

    private Subtractor subtractor = new Subtractor();

    @Test
    public void combine_add_and_subtract(){
        int sum = adder.add(2,2);
        assertThat(subtractor.subtract(4,sum), is(0));
    }
}
