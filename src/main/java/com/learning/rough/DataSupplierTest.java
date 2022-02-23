package com.learning.rough;

import io.github.sskorol.core.DataSupplier;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

//We are going to use this instead of DataProvider from TestNG
public class DataSupplierTest {

    @Test(dataProvider = "getData")
    public void test1(String username){
        System.out.println("Username: "+username);
    }

    //@DataProvider --> Return type -> Object[][] or Object[]
    @DataSupplier //--> It can read any file (CSV, xlsx, JSON, YAMLDataSupplierTest)
    public List<String> getData(){
        return Arrays.asList("Selenium","Appium","RestAssured");
    }

}
