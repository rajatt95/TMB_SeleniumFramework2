package com.learning.rough.datasupplier_excel;

import com.learning.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

//We are going to use this instead of DataProvider from TestNG
public class DataSupplierTest_Excel {

    @Test(dataProvider = "getData")
    public void test1(TestData_Rough testData_rough) {
        System.out.println("testData.testCaseCame = " + testData_rough.testCaseCame);
        System.out.println("testData.username = " + testData_rough.username);
        System.out.println("testData.password = " + testData_rough.password);
        System.out.println("testData.age = " + testData_rough.age);

    }
    //@DataProvider --> Return type -> Object[][] or Object[]
    @DataSupplier //--> It can read any file (CSV, xlsx, JSON, YAMLDataSupplierTest)
    public StreamEx<TestData_Rough> getData() {

//        return Arrays.asList("Selenium", "Appium", "RestAssured");

        return  TestDataReader.use(XlsxReader.class)
                .withTarget(TestData_Rough.class)
                //By default, it looks for files in src/test/resources directory
                .withSource("testdata/testData_rough.xlsx")
                .read();
    }
}
