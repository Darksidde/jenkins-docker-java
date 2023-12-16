package GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class MouseTıklamalari {
    static WebDriver cdriver;
    static Actions actions;

    /////////// ELEMENTS //////////
    static WebElement elementsButton;
    static WebElement DoubleClickBut;

    // Strings
    static String actualDoubleclickMessage;
    static String expectedDoubleclickMessage = "You have done a double click";;



    @BeforeClass
    public static void setUp() {
        cdriver = new ChromeDriver();
        actions = new Actions(cdriver);
        cdriver.manage().window().maximize();
        cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        cdriver.get("https://demoqa.com/buttons");


    }

    @AfterClass
    public static void TearDown() {



    }

    @Test
    public void test01() {
        DoubleClickBut = cdriver.findElement(By.id("doubleClickBtn")); // çift tıkla butonunu bul
        actions.moveToElement(DoubleClickBut).doubleClick().perform(); // buton üstüne git ve tıkla
        actualDoubleclickMessage = cdriver.findElement(By.id("doubleClickMessage")).getText();  // gelen uyarıyı kaydet
        System.out.println("Double Click Message: " + actualDoubleclickMessage); // double click message + kaydedilen uyarıyı yazdır
        Assert.assertEquals(actualDoubleclickMessage, expectedDoubleclickMessage);  // kaydedilen uyarı ve beklenen uyarıyı karşılaştır


    }




}
