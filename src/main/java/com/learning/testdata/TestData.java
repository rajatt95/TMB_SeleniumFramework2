package com.learning.testdata;

import com.beust.jcommander.converters.IntegerConverter;
import com.creditdatamw.zerocell.annotation.Column;

public class TestData {

    //  @Column(name="Test Case Name",index = 0) ->
    //Column name is Test Case Name and it is at 0th index in Excel sheet
    @Column(name = "Test Case Name", index = 0)
    private String testCaseName;

    @Column(name = "Username", index = 1)
    private String username;

    @Column(name = "Password", index = 2)
    private String password;

    @Column(name = "Expected Title", index = 3)
    private String expectedTitle;

    @Column(name = "Expected Error", index = 4)
    private String expectedError;

    @Column(name = "Expected URL", index = 5)
    private String expectedUrl;


    // converterClass = IntegerConverter.class -> This will do the conversion from String to int
    // @Column(name="age",index = 3, converterClass = IntegerConverter.class)
    //public int age;


    public String getTestCaseName() {
        return testCaseName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getExpectedTitle() {
        return expectedTitle;
    }

    public String getExpectedError() {
        return expectedError;
    }

    public String getExpectedUrl() {
        return expectedUrl;
    }
}
