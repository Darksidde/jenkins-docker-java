import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Radio {

    @Test
    public void testRadioButton() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");

        WebElement element = driver.findElement(By.xpath("//div[@class='mb-3']"));
        String sitemesaj = element.getText();
        String sitemesajbeklenen = "Do you like the site?";
        sitemesaj.equals(sitemesajbeklenen);
        System.out.println("Do u like mesajı gözüktü");



        driver.findElement(By.cssSelector("label[for='impressiveRadio']")).click();
              //////// Maindeki yazıyı çektik impressive tıklattırdık bu yüzden (İMPRESSİVE)  ///////
        String actualText = driver.findElement(By.className("text-success")).getText();

        ////// BEKLENEN TESTİMİZ (YES) ///////

        String expectedText = "Yes";


        // Doğrudan assert kullanımı @Test annotasyonu altında
        if (actualText.equals(expectedText)) {
            System.out.println("First Step Text matched!"); // Eğer metinler eşleşiyorsa bu mesajı yazdır
        }
        else {
            System.out.println("First Step Text does not match!"); // Eğer metinler eşleşmiyorsa bu mesajı yazdır
        }

        int milis = 2000;

        driver.findElement(By.cssSelector("label[for='noRadio']")).click();

        String actualText1 = driver.findElement(By.className("text-success")).getText();



        String expectedText1 = "Impressive";

        if (actualText1.equals(expectedText1)) {
            System.out.println("Second Step Text matched!"); // Eğer metinler eşleşiyorsa bu mesajı yazdır
        }
        else {
            System.out.println("Second Step Text does not match!"); // Eğer metinler eşleşmiyorsa bu mesajı yazdır
        }




    }
}
