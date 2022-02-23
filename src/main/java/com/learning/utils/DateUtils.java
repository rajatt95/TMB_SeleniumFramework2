package com.learning.utils;

import java.util.Date;

//final -> We do not want any class to extend this class
public final class DateUtils {

    //private -> We do not want anyone to create the object of this class
    // Private constructor to avoid external instantiation
    private DateUtils() {
    }

    public static String getCurrentDate() {
        Date date = new Date();
        return date.toString().replace(":", "_").replace(" ", "_");
    }

}
