import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWolverine {

    @AfterEach
    public void killChrome() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    @Test
    public void openWebsite() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://xmenmovies.fandom.com/wiki/X-Men_Movies_Wiki");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String expectedTitle = "X-Men Movies Wiki | Fandom";
        WebElement title = driver.findElement(By.xpath("//title"));
        assertEquals(expectedTitle, title.getText(),
                "Page Title not found");

        driver.close();
        driver.quit();
    }


}

