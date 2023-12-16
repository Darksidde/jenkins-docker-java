package GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.time.Duration;

public class UpandDown {

    static WebDriver cdriver;
    static SoftAssert softAssert;
    static File file;

    /////// ELEMENTS
    static WebElement downloadButton;
    static WebElement uploadButton;

    //////OTHER
    public String downloadPath;
    static String downloadUrl;

    @BeforeClass
    public static void SetUp() {


        cdriver = new ChromeDriver();
        softAssert = new SoftAssert();
        cdriver.manage().window().maximize();
        cdriver.get("https://demoqa.com/upload-download");
    }

    @AfterClass
    public void tearDown() {
        softAssert.assertAll(); // Tüm assertlerin değerlendirilmesini sağlar
    }


    @Test
    public void test01() throws InterruptedException {
        downloadButton = cdriver.findElement(By.id("downloadButton"));
        downloadButton.click();

        downloadPath = "C:\\Users\\Brkyy\\Downloads\\";
        file = new File(downloadPath + "sampleFile.jpeg");

        WebDriverWait wait = new WebDriverWait(cdriver, Duration.ofSeconds(30));

        // Dosyanın indirilmesini bekleyin
        wait.until((WebDriver driver) -> file.exists());

        if (file.exists()) {
            softAssert.assertEquals(file.getName(), "sampleFile.jpeg");
            System.out.println("Dosya indirme Başarılı");
        } else {
            System.out.println("Dosya indirme Başarısız");
        }
    }


    @Test
    public void test02() {

        //uploadButton = cdriver.findElement(By.id("uploadFile"));
        //uploadButton.sendKeys("C:\\Users\\Brkyy\\Downloads\\sampleFile.txt");


    }
}




