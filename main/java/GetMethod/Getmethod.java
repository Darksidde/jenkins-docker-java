package GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {
    public static void main(String[] args) {

    WebDriver cdriver = new ChromeDriver();
        cdriver.manage().window().maximize();

    cdriver.get("https://demoqa.com/text-box");

        WebElement nameElement = cdriver.findElement(By.id("userName"));
                nameElement.click();
                nameElement.sendKeys("berkay");

                WebElement email = cdriver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
         email.sendKeys("berkay@hotmail.com");

        WebElement form = cdriver.findElement(new By.ByCssSelector(".form-control[id='permanentAddress']"));
        form.sendKeys("istanbul avci");

        WebElement adres = cdriver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
       adres.sendKeys("istanbul esenyurt");

        WebElement tikla = cdriver.findElement(new By.ByCssSelector("button#submit.btn-primary"));
        tikla.click();

        WebElement name = cdriver.findElement(By.xpath("//*[@id='name']"));
                String nametext = name.getText();
                System.out.println(nametext);




  }
}
