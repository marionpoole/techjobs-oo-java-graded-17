package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

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
}
