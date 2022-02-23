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
