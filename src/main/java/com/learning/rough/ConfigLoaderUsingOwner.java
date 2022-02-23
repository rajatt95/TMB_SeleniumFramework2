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
