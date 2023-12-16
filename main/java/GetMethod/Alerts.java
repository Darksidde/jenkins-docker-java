package GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {

        static WebDriver cdriver;
        @BeforeClass public static void setUp() {
            cdriver= new ChromeDriver();
            cdriver.get("https://demoqa.com/alerts");
        }

    @Test
     public void Alerts() {


        cdriver.findElement(By.id("alertButton")).click();

        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        cdriver.switchTo().alert().getText();
        String Eray = cdriver.switchTo().alert().getText();
        System.out.println(Eray);
        cdriver.switchTo().alert().accept();
    }


        @Test
        public void Alerts1() {

            cdriver.findElement(By.id("timerAlertButton")).click();

            WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());

            cdriver.switchTo().alert().accept();
        }

            @Test

            public void Alerts02()
            {
                cdriver.findElement(By.id("confirmButton")).click();
                WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(6));
                wait.until(ExpectedConditions.alertIsPresent());
                cdriver.switchTo().alert().dismiss();





            }

    @Test

    public void Alerts03()
    {
        cdriver.findElement(By.id("confirmButton")).click();
        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());
        cdriver.switchTo().alert().dismiss();





    }

}