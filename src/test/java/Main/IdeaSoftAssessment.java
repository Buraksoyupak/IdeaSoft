package Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class IdeaSoftAssessment extends TestBase {

        @Test
        void tets01() {

                driver.get("https://testcase.myideasoft.com/");
                WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
                searchBox.sendKeys("kaykay");

                WebElement clickElement = driver.findElement(By.xpath("(//button)[1]"));
                clickElement.click();

                WebElement linkOfKaykay = driver.findElement(By.xpath("//a[@href='/urun/bebek2-2' and text()='kaykay']"));
                linkOfKaykay.click();

                WebElement dropDownMenu5 = driver.findElement(By.xpath("//option[@value='5']"));
                dropDownMenu5.click();

                WebElement sepeteEkle = driver.findElement(By.xpath("//a[@data-selector='add-to-cart']"));
                sepeteEkle.click();

                WebElement sepetinizeEklenmistir = driver.findElement(By.xpath("//*[contains(text(),'SEPETİNİZE EKLENMİŞTİR')]"));
                Assertions.assertTrue(sepetinizeEklenmistir.isDisplayed());

                waitForSecond(3);

               driver.findElement(By.xpath("//a[@title='Sepet']")).click();

               waitForSecond(3);

                WebElement actualResult = driver.findElement(By.xpath("//input[@value='5']"));
                String actualValueAttributeNumber = actualResult.getAttribute("value");
                String expectedValueAttributeNumber = "5";
                Assertions.assertEquals(expectedValueAttributeNumber,actualValueAttributeNumber);

        }
}
