package com.fourstay.utilities;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        switch (type) {

            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default: CHROME:
                driverManager = new ChromeDriverManager();
                break;

        }
        return driverManager;

    }
}
