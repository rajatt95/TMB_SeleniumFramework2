package com.learning.rough.datasupplier_excel;

import com.learning.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

//We are going to use this instead of DataProvider from TestNG
public class DataSupplierTest_Excel2 {

    @Test(dataProvider = "getData")
    public void test1(TestData testData) {
        System.out.println("-----------------------------");
        System.out.println("testData.testCaseName = " + testData.getTestCaseName());
        System.out.println("testData.username = " + testData.getUsername());
        System.out.println("testData.password = " + testData.getPassword());
        System.out.println("testData.expectedTitle = " + testData.getExpectedTitle());
        System.out.println("testData.expectedError = " + testData.getExpectedError());
    }
    //@DataProvider --> Return type -> Object[][] or Object[]
    @DataSupplier //--> It can read any file (CSV, xlsx, JSON, YAMLDataSupplierTest)
    public StreamEx<TestData> getData() {

        return  TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                //By default, it looks for files in src/test/resources directory
                .withSource("testdata/testData.xlsx")
                .read();
    }

}
