package com.learning.utils;

import com.learning.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

import java.lang.reflect.Method;

import static com.learning.constants.FrameworkConstants.TEST_DATA_XLSX_FILE;

public class DataProviderUtils {


    //@DataProvider --> Return type -> Object[][] or Object[]
    //@DataSupplier //--> It can read any file (CSV, xlsx, JSON, YAMLDataSupplierTest)
    //@DataSupplier(runInParallel = true)
    @DataSupplier(runInParallel = true,name="getTestData")
    public StreamEx<TestData> getData(Method method) {

        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                //By default, it looks for files in src/test/resources directory
                .withSource(TEST_DATA_XLSX_FILE)
                .read()
                //  .filter(testData -> testData.getTestCaseName().equalsIgnoreCase("titleValidationTest"));

                // Using Java reflection -> Getting method name and use it for filtering
                .filter(testData -> testData.getTestCaseName().equalsIgnoreCase(method.getName()));
    }


    //@DataProvider(name = "getInvalidLoginData")
    public static Object[][] REFERENCE_getInvalidLoginData() {
        return new Object[][]{
                //Username, Password, Expected Error Message
                {"Admin", "admin1234", "Invalid credentials"}
        };
    }

    //@DataProvider(name = "getValidLoginData")
    public static Object[][] REFERENCE_getValidLoginData() {
        return new Object[][]{
                //Username, Password, Expected Page Title
                {"Admin", "admin123", "OrangeHRM"}
        };
    }


}
