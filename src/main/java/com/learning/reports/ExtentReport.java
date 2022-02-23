package com.learning.reports;

import static com.learning.constants.FrameworkConstants.*;

import java.util.Objects;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.learning.enums.AuthorType;
import com.learning.enums.CategoryType;
import com.learning.utils.BrowserInfoUtils;
import com.learning.utils.IconUtils;
import com.learning.utils.ReportUtils;

//final -> We do not want any class to extend this class
public final class ExtentReport {

    //private -> We do not want anyone to create the object of this class
    private ExtentReport() {
    }

    private static ExtentReports extent;

    public static void initReports() {
        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(getExtentReportFilePath());
            /*
             * .viewConfigurer() .viewOrder() .as(new ViewName[] { ViewName.DASHBOARD,
             * ViewName.TEST, //ViewName.TAG, ViewName.CATEGORY, ViewName.AUTHOR,
             * ViewName.DEVICE, ViewName.EXCEPTION, ViewName.LOG }) .apply();
             */

            /*
             * You can even update the view of the ExtentRerport - What do you want to you
             * first, you can prioritize
             */
            /*
             * ExtentSparkReporter spark = new
             * ExtentSparkReporter(REPORTS_SPARK_CUSTOMISED_HTML).viewConfigurer().viewOrder
             * () .as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY
             * }).apply();
             */
            extent.attachReporter(spark);

            // spark.config().setEncoding("utf-8");
            spark.config().setTheme(Theme.STANDARD);
            spark.config().setDocumentTitle(PROJECT_NAME + " - ALL");
            spark.config().setReportName(PROJECT_NAME + " - ALL");

            extent.setSystemInfo("Organization", "Nagarro");
            extent.setSystemInfo("Employee",
                    "<a href=" + ICON_SOCIAL_GITHUB_PAGE_URL + "> <b> Rajat Verma </b> </a>"
                            + " " + ICON_SOCIAL_LINKEDIN + " " + ICON_SOCIAL_GITHUB);
            extent.setSystemInfo("Domain", "Engineering (IT - Software)" + "  " + ICON_LAPTOP);
            extent.setSystemInfo("Skill", "Test Automation Engineer");
        }
    }

    public static void flushReports() {
        if (Objects.nonNull(extent)) {
            extent.flush();
        }
        ExtentManager.unload();
        ReportUtils.openReports();
    }

    public static void createTest(String testCaseName) {
        // ExtentManager.setExtentTest(extent.createTest(testCaseName));
        ExtentManager.setExtentTest(extent.createTest(IconUtils.getBrowserIcon() + " : " + testCaseName));
    }

    synchronized public static void addAuthors(AuthorType[] authors) {
        for (AuthorType author : authors) {
            ExtentManager.getExtentTest().assignAuthor(author.toString());
        }
    }

    // public static void addCategories(String[] categories) {
    synchronized public static void addCategories(CategoryType[] categories) {
        // for (String category : categories) {
        for (CategoryType category : categories) {
            ExtentManager.getExtentTest().assignCategory(category.toString());
        }
    }

    synchronized public static void addDevices() {
        ExtentManager.getExtentTest().assignDevice(BrowserInfoUtils.getBrowserInfo());
//		ExtentManager.getExtentTest()
//				.assignDevice(BrowserIconUtils.getBrowserIcon() + " : " + BrowserInfoUtils.getBrowserInfo());
    }


}
