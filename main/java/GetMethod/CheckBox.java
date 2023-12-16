package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {

        WebDriver cdriver = new ChromeDriver();
        cdriver.manage().window().maximize();

        cdriver.get("https://demoqa.com/checkbox");
      String homeboxCssValue = "#tree-node > ol > li > span > label > span.rct-checkbox > svg";
        WebElement homebox = cdriver.findElement(By.cssSelector(homeboxCssValue));
        homebox.click();

        homebox = cdriver.findElement(By.cssSelector(homeboxCssValue));

           String homeClass = homebox.getAttribute("class");

           if  (homeClass.equals("rct-icon rct-icon-check")){
           System.out.println("Checkbox Seçili"); }
           else{
               System.out.println("Checkbox Seçili Değil");}
    }

}
