/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.constants;

import com.learning.utils.ReportUtils;

//final -> We do not want any class to extend this class
public class FrameworkConstants {

    //private -> We do not want anyone to create the object of this class
    private FrameworkConstants() {
    }

    public static final String ASSERTION_FOR_RESPONSE_STATUS_CODE = "Assertion for Response Status Code";
    public static final String ASSERTION_FOR_RESPONSE_HEADER = "Assertion for Response Headers";
    public static final String ASSERTION_FOR_RESPONSE_CUSTOM_FIELD = "Assertion for Response Custom Field";
    public static final String ASSERTION_FOR = "Assertion for ";

    public static final long WAIT = 5;

    public static final String PROJECT_PATH = System.getProperty("user.dir");

    public static final String CHROME = "chrome";
    public static final String CHROME_HEADLESS = "chrome_headless";
    public static final String HEADLESS = "headless";

    public static final String FIREFOX = "firefox";
    public static final String EDGE = "edge";
    public static final String OPERA = "opera";
    public static final String SAFARI = "safari";

    public static final String LOCAL = "local";
    public static final String REMOTE = "remote";




    /*ExtentReports - START*/

//    private static final String REPORT_PATH = PROJECT_PATH + "/ExtentReport.html";
//    public static final String REPORT_LOCATION = PROJECT_PATH + "/ExtentReports/";

//    private static final String REPORT_PATH = getExtentReportFilePath();
//    public static final String REPORT_LOCATION = PROJECT_PATH + "/ExtentReports/";
//    private static String extentReportFilePath = "";
//    private static final String EXTENT_REPORT_NAME = "AutomationReport.html";

    public static final String EXTENT_REPORT_FOLDER_PATH = PROJECT_PATH + "/ExtentReports/";
    public static final String EXTENT_REPORT_NAME = "AutomationReport.html";
    private static String extentReportFilePath = "";

    /**
     * Zip file of Extent Reports
     */
    public static final String Zipped_ExtentReports_Folder_Name = "ExtentReports.zip";

    /*ExtentReports - END*/

    public static final String TEST_DATA_XLSX_FILE = "testdata/testData.xlsx";

    public static final String PROJECT_NAME = "Automation Test Suite Report - Selenium Framework - TMB 2";
    public static final String YES = "YES";
    public static final String NO = "NO";

    public static final String BOLD_START = "<b>";
    public static final String BOLD_END = "</b>";

    /* ICONS - START */

    public static final String ICON_SMILEY_PASS = "<i class='fa fa-smile-o' style='font-size:24px'></i>";
    public static final String ICON_SMILEY_SKIP = "<i class=\"fas fa-frown-open\"></i>";
    public static final String ICON_SMILEY_FAIL = "<i class='fa fa-frown-o' style='font-size:24px'></i>";

    public static final String ICON_OS_WINDOWS = "<i class='fa fa-windows' ></i>";
    public static final String ICON_OS_MAC = "<i class='fa fa-apple' ></i>";
    public static final String ICON_OS_LINUX = "<i class='fa fa-linux' ></i>";

//	public static final String ICON_BROWSER_OPERA = "<i class=\"fa fa-opera\" aria-hidden=\"true\"></i>";
//	public static final String ICON_BROWSER_EDGE = "<i class=\"fa fa-edge\" aria-hidden=\"true\"></i>";
//	public static final String ICON_BROWSER_CHROME = "<i class=\"fa fa-chrome\" aria-hidden=\"true\"></i>";
//	public static final String ICON_BROWSER_FIREFOX = "<i class=\"fa fa-firefox\" aria-hidden=\"true\"></i>";
//	public static final String ICON_BROWSER_SAFARI = "<i class=\"fa fa-safari\" aria-hidden=\"true\"></i>";

    public static final String ICON_Navigate_Right = "<i class='fa fa-arrow-circle-right' ></i>";
    public static final String ICON_LAPTOP = "<i class='fa fa-laptop' style='font-size:18px'></i>";
    public static final String ICON_BUG = "<i class='fa fa-bug' ></i>";
    /* style="text-align:center;" */

    public static final String ICON_SOCIAL_GITHUB_PAGE_URL = "https://rajatt95.github.io/";
    public static final String ICON_SOCIAL_LINKEDIN_URL = "https://www.linkedin.com/in/rajat-v-3b0685128/";
    public static final String ICON_SOCIAL_GITHUB_URL = "https://github.com/rajatt95";
    public static final String ICON_SOCIAL_LINKEDIN = "<a href='" + ICON_SOCIAL_LINKEDIN_URL
            + "'><i class='fa fa-linkedin-square' style='font-size:24px'></i></a>";
    public static final String ICON_SOCIAL_GITHUB = "<a href='" + ICON_SOCIAL_GITHUB_URL
            + "'><i class='fa fa-github-square' style='font-size:24px'></i></a>";

//	public static final String ICON_SOCIAL_LINKEDIN = "<i class='fa fa-linkedin-square' style='font-size:24px'></i>";
//	public static final String ICON_SOCIAL_GITHUB = "<i class='fa fa-github-square' style='font-size:24px'></i>";
//	public static final String ICON_SOCIAL_LINKEDIN_VALUE = "<a href='https://www.linkedin.com/in/rajat-v-3b0685128/'>LinkedIn</a>";
//	public static final String ICON_SOCIAL_GITHUB_VALUE = "https://github.com/rajatt95";

    public static final String ICON_CAMERA = "<i class=\"fa fa-camera\" aria-hidden=\"true\"></i>";

    public static final String ICON_BROWSER_EDGE = "edge";
    public static final String ICON_BROWSER_PREFIX = "<i class=\"fa fa-";
    public static final String ICON_BROWSER_SUFFIX = "\" aria-hidden=\"true\"></i>";
    /* ICONS - END */

    public static String getExtentReportFilePath() {
        if (extentReportFilePath.isEmpty()) {
            extentReportFilePath = ReportUtils.createExtentReportPath();
        }
        return extentReportFilePath;
    }

}
