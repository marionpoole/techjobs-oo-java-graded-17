package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job = new Job();
        Job aJob = new Job();
        Assert.assertNotEquals(job.getId(), aJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(job.getName() instanceof String);
        Assert.assertEquals("Product tester", job.getName());
        Assert.assertTrue(job.getEmployer() instanceof Employer);
        Assert.assertEquals("ACME", job.getEmployer().toString());
        Assert.assertTrue(job.getLocation() instanceof Location);
        Assert.assertEquals("Desert", job.getLocation().toString());
        Assert.assertTrue(job.getPositionType() instanceof PositionType);
        Assert.assertEquals("Quality control", job.getPositionType().toString());
        Assert.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals("Persistence", job.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(job.equals(aJob));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String aJob = job.toString();
        Assert.assertEquals(System.lineSeparator(), aJob.substring(0,2));
        Assert.assertEquals(System.lineSeparator(), aJob.substring(aJob.length() -2));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals(System.lineSeparator()+"ID: " + job.getId() + System.lineSeparator() + "Name: Product tester" +System.lineSeparator() + "Employer: ACME" + System.lineSeparator() + "Location: Desert" + System.lineSeparator() + "Position Type: Quality control" + System.lineSeparator() + "Core Competency: Persistence" + System.lineSeparator(), job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        Assert.assertEquals(System.lineSeparator()+"ID: " + job.getId() + System.lineSeparator() + "Name: Data not available" +System.lineSeparator() + "Employer: Data not available" + System.lineSeparator() + "Location: Data not available" + System.lineSeparator() + "Position Type: Data not available" + System.lineSeparator() + "Core Competency: Data not available" + System.lineSeparator(), job.toString());

    }
}
