package utils;

public class Data {


    static String Url = "https://automationpractice.com";
    static String Driver = "webdriver.chrome.driver";
    static String DriverPath = "src/test/resources/chromedriver.exe";
    static Integer WaitTime = 30;
    static Integer PollingTime = 2;
    static String Email = "raul.al.go.96@gmail.com";

    static String Password = "MyPassword";

    public static String getUrl() {
        return Url;
    }

    public static String getDriver() {
        return Driver;
    }

    public static String getDriverPath() {
        return DriverPath;
    }

    public static Integer getPollingTime() {
        return PollingTime;
    }

    public static Integer getWaitTime() {
        return WaitTime;
    }

    public static String getEmail() {
        return Email;
    }

    public static String getPassword() {
        return Password;
    }


}
