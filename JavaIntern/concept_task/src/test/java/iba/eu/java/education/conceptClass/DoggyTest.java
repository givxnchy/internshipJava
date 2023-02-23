package iba.eu.java.education.conceptClass;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DoggyTest extends TestCase {
    @Test
    public void testDogObject() {
        Doggy dog1 = new Doggy();
        dog1.age = 5;
        dog1.gender = "female";
        dog1.breed = "German shepard";
        int expectedAge = 5;
        String expectedGender = "female";
        String expectedBreed = "German shepard";
        Assert.assertEquals(expectedAge,dog1.age);
        Assert.assertEquals(expectedGender,dog1.gender);
        Assert.assertEquals(expectedBreed,dog1.breed);
    }
}