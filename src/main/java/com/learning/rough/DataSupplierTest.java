/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

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
