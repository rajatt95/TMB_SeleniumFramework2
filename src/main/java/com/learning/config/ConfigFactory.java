package com.learning.config;

//final -> We do not want any class to extend this class
public final class ConfigFactory {

    //private -> We do not want anyone to create the object of this class
    private ConfigFactory() {
    }

    public static FrameworkConfig getConfig() {
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
