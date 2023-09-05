package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:configs/base.properties",
        "classpath:configs/${env}.properties"
})
public interface WebConfig extends Config {

    @Key("user")
    String getUsername();

    @Key("key")
    String getPassword();

    @Key("device")
    String getDevice();

    @Key("osVersion")
    String getOsVersion();

    @Key("app")
    String getApp();

    @Key("project")
    String getProject();

    @Key("build")
    String getBuild();

    @Key("baseUrl")
    String getBaseUrl();
}