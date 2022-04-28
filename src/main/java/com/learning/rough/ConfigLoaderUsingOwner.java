/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.rough;

import com.learning.config.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;

public class ConfigLoaderUsingOwner {
    public static void main(String[] args) {

        FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        System.out.println("config.timeout(): " + config.timeout());
        System.out.println("config.url(): " + config.url());
        System.out.println("config.browser() = " + config.browser());
        System.out.println("config.passed_steps_screenshot() = " + config.passed_steps_screenshot());
        System.out.println("config.skipped_steps_screenshot() = " + config.skipped_steps_screenshot());
        System.out.println("config.failed_steps_screenshot() = " + config.failed_steps_screenshot());
    }
}
