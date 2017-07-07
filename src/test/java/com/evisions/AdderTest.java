package com.evisions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by gabe.clark on 7/7/17.
 */
public class AdderTest {

    @Test
    public void add_should_return_sum_given_two_integers(){
        assertThat(Adder.add(2,2), is(4));
    }
}