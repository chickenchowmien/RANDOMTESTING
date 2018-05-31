package com.fourstay.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum SingleDriver {

    CHROME{
        public WebDriver getDriver(){
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            return driver;
        }
    },
    FIRREFOX{
        public WebDriver getDriver(){
            System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            return driver;
        }
    },
    EXPLORER{
        public WebDriver getDriver(){
            System.setProperty("webdriver.ie.driver","src/test/resources/drivers/IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
            return driver;
        }
    },
    EDGE{
        public WebDriver getDriver(){
            System.setProperty("webdriver.edge.driver","src/test/resources/drivers/MicrosoftWebDriver.exe");
            WebDriver driver = new EdgeDriver();
            return driver;
        }
    };
    public abstract WebDriver getDriver();
}
