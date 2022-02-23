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
