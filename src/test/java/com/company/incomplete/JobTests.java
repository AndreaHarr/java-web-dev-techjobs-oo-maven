package com.company.incomplete;

import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class JobTests {
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;

    @BeforeEach
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Engineer 1", new Employer(""), new Location("Atlantis"), new PositionType("Quality control"), new CoreCompetency("Adaptable"));
        test_job5 = new Job("Engineer 1", new Employer(""), new Location("Atlantis"), new PositionType("Quality control"), new CoreCompetency("Adaptable"));
        test_job6 = new Job("Software Eng. 1", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }


    @Test
    public void testSettingJobId() {
        Assertions.assertEquals(1, test_job1.getId());
        assertEquals(2, test_job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
        assertEquals(Employer.class, test_job3.getEmployer().getClass());
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(4, test_job4.getId());
        assertEquals(5, test_job5.getId());
        assertFalse(test_job4.equals(test_job5));
    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringIsFormattedProperly() {

        String expectedToStringOutput =
                        "ID: 3\n" +
                        "Name: Product tester\n" +
                        "Employer: ACME\n" +
                        "Location: Desert\n" +
                        "Position Type: Quality control\n" +
                        "Core Competency: Persistence\n";
        assertEquals(expectedToStringOutput, test_job3.toString());


    }

    @Test
    public void testToStringDataNotAvailable() {

        String expectedToStringOutput =
                        "ID: 6\n" +
                        "Name: Software Eng. 1\n" +
                        "Employer: Data not available\n" +
                        "Location: Data not available\n" +
                        "Position Type: Data not available\n" +
                        "Core Competency: Data not available\n";
        Assertions.assertEquals(expectedToStringOutput, test_job6.toString());
    }

}

