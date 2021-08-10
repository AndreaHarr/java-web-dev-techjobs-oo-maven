package com.company.completed.passing;

import com.company.Employer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployerTests {

    // this will need to be removed when you are DRYing your code

    private static final Employer oneArgEmployer = new Employer("");

    // this will need to be removed when you are DRYing your code


    @Test
    public void oneArgConstructorTest() {
        // this will need to be updated when you are DRYing your code from an expected value of 2 to an expected value of 1
        Assertions.assertEquals(1, oneArgEmployer.getId());
    }



}
