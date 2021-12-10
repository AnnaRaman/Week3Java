package com.spartaglobal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BaseClassTests
{

    @Test
    @DisplayName("getFullName returns correct name")
    public void getFullNameTest()
    {
        // create a new BaseClass object, which represents a person
        var subject = new BaseClass("Cathy", "French");
        var result = subject.getFullName();
        Assertions.assertEquals("Cathy French", result);
    }

    @Test
    @DisplayName("getFullName returns blank String when name is blank")
    public void getFullNameTestBlank()
    {
        // create a new BaseClass object, which represents a person
        var subject = new BaseClass("", "");
        var result = subject.getFullName();
        Assertions.assertEquals(" ", result);
    }

    @Test
    @DisplayName("getAge and setAge methods work correctly")
    public void ageTest()
    {
        var subject = new BaseClass("A", "B");
        subject.setAge(35);
        Assertions.assertEquals(35, subject.getAge());
    }

    @Test
    @DisplayName("toString returns correct information")
    public void ToStringTest()
    {
        var subject = new BaseClass("Cathy", "French", 4, "High Street", "Stafford");
        subject.setAge(22);
        var result = subject.toString();
        Assertions.assertTrue( result.contains("Name: Cathy  French Age: 22. Address: 4 High Street, Stafford"));
        Assertions.assertTrue( result.contains("BaseClass"));
    }
}