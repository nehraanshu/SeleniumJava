package lib.UI.PageObject;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private final WebDriver browser;
    private final int timeToWait;
    private final WebDriverWait wait;
    private final String url;

    public BasePage(WebDriver driver, int implicitWait, String url)
    {
        this.browser = driver;
        timeToWait = implicitWait;
        wait = new WebDriverWait(getDriver(), timeToWait);
        this.url = url;
    }

    public WebDriver getDriver()
    {
        return browser;
    }
}
