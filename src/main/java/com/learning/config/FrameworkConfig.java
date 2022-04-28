/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

import java.util.List;

@Sources(value = "file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

//    timeout=10
//    url=https://opensource-demo.orangehrmlive.com/

    long timeout();
    String url();
    String browser();
    String passed_steps_screenshot();
    String failed_steps_screenshot();
    String skipped_steps_screenshot();
    String runmode();
    String remoteUrl();
    String send_email_to_users();
    String override_reports();
    String open_reports_after_execution();
    String retry_failed_tests();

//    username=rajatt95
//    password=1234
//    url=https://github.com/rajatt95
//    timeOut=10
//    tools=Selenium,Appium,RestAssured

//    String username();
//    String password();
//    String url();
//    int timeOut();
//    String[] tools();
}
