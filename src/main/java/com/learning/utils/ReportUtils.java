/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.utils;

import com.learning.config.ConfigFactory;
import com.learning.exceptions.FrameworkException;
import com.learning.exceptions.InvalidPathForExtentReportFileException;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.learning.constants.FrameworkConstants.*;


//final -> We do not want any class to extend this class
public final class ReportUtils {

    //private -> We do not want anyone to create the object of this class
    // Private constructor to avoid external instantiation
    private ReportUtils() {
    }

    public static String createExtentReportPath() {
        if (ConfigFactory.getConfig().override_reports().trim().equalsIgnoreCase(NO)) {
            /**
             * Report name ->
             *
             * Windows_10_Tue_Oct_05_02_30_46_IST_2021_AutomationReport.html
             * Mac_OS_X_Tue_Feb_22_17_09_05_IST_2022_AutomationReport.html
             */
            return EXTENT_REPORT_FOLDER_PATH + OSInfoUtils.getOSInfo() + "_" + DateUtils.getCurrentDate() + "_"
                    + EXTENT_REPORT_NAME;

        } else {
            return EXTENT_REPORT_FOLDER_PATH + EXTENT_REPORT_NAME;
        }
    }

    public static void openReports() {
        if (ConfigFactory.getConfig().open_reports_after_execution().trim().equalsIgnoreCase(YES)) {
            try {
                Desktop.getDesktop().browse(new File(getExtentReportFilePath()).toURI());
            } catch (FileNotFoundException fileNotFoundException) {
                throw new InvalidPathForExtentReportFileException("Extent Report file you are trying to reach is not found", fileNotFoundException.fillInStackTrace());
            } catch (IOException ioException) {
                throw new FrameworkException("Extent Report file you are trying to reach got IOException while reading the file", ioException.fillInStackTrace());
            }


        }
    }
}

