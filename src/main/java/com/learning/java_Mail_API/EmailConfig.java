/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.java_Mail_API;

import static com.learning.constants.FrameworkConstants.PROJECT_NAME;

/**
 * Data for Sending EMail after execution
 */
public class EmailConfig {

    public static final String SERVER = "smtp.gmail.com";
    public static final String PORT = "587";

    public static final String FROM = "testtmail95@gmail.com";
    public static final String PASSWORD = "*****";

    /* "**********@gmail.com", "**********@jetblue.com"*/
    public static final String[] TO = {"testtmail95@gmail.com"};
    public static final String SUBJECT = PROJECT_NAME;
}