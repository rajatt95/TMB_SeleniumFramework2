package com.learning.rough.datasupplier_excel;

import com.beust.jcommander.converters.IntegerConverter;
import com.creditdatamw.zerocell.annotation.Column;

public class TestData_Rough {

    //  @Column(name="testcasename",index = 0) ->
    //Column name is testcasename and it is at 0th index in Excel sheet
    @Column(name="testcasename",index = 0)
    public String testCaseCame;

    @Column(name="username",index = 1)
    public String username;

    @Column(name="password",index = 2)
    public String password;

    //converterClass = IntegerConverter.class -> This will do the conversion from String to int
    @Column(name="age",index = 3, converterClass = IntegerConverter.class)
    public int age;

}
