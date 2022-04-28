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

import java.io.File;

import org.zeroturnaround.zip.ZipUtil;

import static com.learning.constants.FrameworkConstants.*;

public class ZipUtils {

    /* make Zip file of Extent Reports in Project Root folder */
    public static void zip() {
//		ZipUtil.pack(new File(REPORT_LOCATION),
//				new File(Zipped_ExtentReports_Folder_Name));

        ZipUtil.pack(new File(EXTENT_REPORT_FOLDER_PATH),
                new File(Zipped_ExtentReports_Folder_Name));

        System.out.println("Zipped ExtentReports folder successfuly");
    }

	/*public static void main(String[] args) {
		System.out.println("REPORT_LOCATION = " + REPORT_LOCATION);
		System.out.println("Zipped_ExtentReports_Folder_Name = " + Zipped_ExtentReports_Folder_Name);

		ZipUtil.pack(new File(REPORT_LOCATION),
				new File(Zipped_ExtentReports_Folder_Name));
		System.out.println("Zipped ExtentReports folder successfuly");
	}*/

}
