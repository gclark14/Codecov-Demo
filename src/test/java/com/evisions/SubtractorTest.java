package com.evisions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by gabe.clark on 7/7/17.
 */
public class SubtractorTest {

    Subtractor subtractor = new Subtractor();

<<<<<<< HEAD
    // Noted off to demonstrate a lack of coverage in unit tests.
    @Test
    public void subtract_should_return_difference_given_two_integers(){
        //assertThat(subtractor.subtract(2,2), is(0));
=======
    @Test
    public void subtract_should_return_difference_given_two_integers(){
        assertThat(subtractor.subtract(2,2), is(0));
>>>>>>> a274320f25928597f7218c8e09cfb91316b9054a
    }

}