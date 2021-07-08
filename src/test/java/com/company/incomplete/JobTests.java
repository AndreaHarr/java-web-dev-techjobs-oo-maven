package com.company.incomplete;

import com.company.Employer;
import com.company.Job;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JobTests {
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
   Job test_job1;
   Job test_job2;

   @BeforeEach
   public void createJobObject(){
       test_job1 = new Job();
       test_job2 = new Job();


   }



    @Test
    public void testSettingJobId() {
       Assertions.assertEquals(1, test_job1.getId());
       Assertions.assertEquals(2, test_job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
    id
    name
    }

    @Test
    public void testJobsForEquality() {

    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringContainsBlankLines() {

    }

    @Test
    public void testToStringHasLabelsForEachField() {

    }

    @Test
    public void testToStringDataNotAvailable() {

    }
}
