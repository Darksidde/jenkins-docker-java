package Pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.awt.desktop.SystemSleepEvent;

public class Pratik {

        public static void main(String[] args) {



            WebDriver cdriver = new ChromeDriver();
            cdriver.manage().window().maximize();

            cdriver.get("https://demoqa.com/automation-practice-form");
            /// KUTULARI TANITIYORUM STRİNGE CSS KODUNU KOYUYORUM DAHA SONRA ELEMENT EKLEYİP CSS KODUNU TANITTIĞIM STRİNG İLE EŞLEŞTİRİYORUM

            String CinsiyetboxCss = "#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label";
            WebElement Cinsiyet = cdriver.findElement(By.cssSelector(CinsiyetboxCss));
            Cinsiyet.click();

            String ReadingCss = "#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label";
            WebElement Reading = cdriver.findElement(By.cssSelector(ReadingCss));
            Reading.click();

            String SportCss = "#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label";
            WebElement Sport = cdriver.findElement(By.cssSelector(SportCss));
            Sport.click();


          //// KUTU SEÇİLİMİ DEĞİL Mİ ////

WebElement SportTik = cdriver.findElement(By.cssSelector("#hobbies-checkbox-1"));
            boolean SporTiki = SportTik.isSelected();
            System.out.println(SporTiki);







            }
}
