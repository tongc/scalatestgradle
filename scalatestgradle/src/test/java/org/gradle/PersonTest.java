package org.gradle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        Assert.assertEquals("Larry", person.getName());
    }
}
